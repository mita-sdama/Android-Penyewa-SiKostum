package com.example.sikostumpenyewa;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.sikostumpenyewa.Adapter.PesanAdapter;
import com.example.sikostumpenyewa.MODEL.GetPesan;
import com.example.sikostumpenyewa.MODEL.Pesan;
import com.example.sikostumpenyewa.REST.APIClient;
import com.example.sikostumpenyewa.REST.APIInterface;
import com.example.sikostumpenyewa.Utils.SaveSharedPreferences;

import java.util.List;

import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class PemesananActivity extends AppCompatActivity {
    String id_user;
    APIInterface mApiInterface;
    RecyclerView mRecyclerView;
    RecyclerView.Adapter mAdapter;
    RecyclerView.LayoutManager mLayoutManager;
    Context mContext;
    TextView pesan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pemesanan);

        pesan =(TextView) findViewById(R.id.keterangan);
        mContext = getApplicationContext();
        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        mLayoutManager = new LinearLayoutManager(mContext);
        mRecyclerView.setLayoutManager(mLayoutManager);
        id_user = SaveSharedPreferences.getId(getApplicationContext());
        tampilPemesanan();
    }
    public void tampilPemesanan(){
        mApiInterface = APIClient.getClient().create(APIInterface.class);
        RequestBody reqid_user = MultipartBody.create(MediaType.parse("multipart/form-data"),
                SaveSharedPreferences.getId(getApplicationContext()));
        Call<GetPesan> mPemesananCall = mApiInterface.getPesan(reqid_user);
        mPemesananCall.enqueue(new Callback<GetPesan>() {
            @Override
            public void onResponse(Call<GetPesan> call, Response<GetPesan> response) {
                if(response.body(). getStatus().equals("success")){
                    pesan.setVisibility(View.GONE);
                    Log.d("Get Pemesanan", response.body().getStatus());
                    List<Pesan> daftarPemesanan = response.body().getResult();
                    mAdapter = new PesanAdapter(daftarPemesanan);
                    mRecyclerView.setAdapter(mAdapter);
                }
                else{
                    pesan.setVisibility(View.VISIBLE);

                }

            }

            @Override
            public void onFailure(Call<GetPesan> call, Throwable t) {
                Toast.makeText(getApplicationContext(),"Koneksi Internet bermasalah",Toast.LENGTH_SHORT).show();
            }
        });
    }

}
