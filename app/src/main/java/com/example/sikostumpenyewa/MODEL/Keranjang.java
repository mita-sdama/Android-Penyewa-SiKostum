package com.example.sikostumpenyewa.MODEL;

public class Keranjang {
    private String jml;
    private String id_user;
    private String id_kerajang;
    private String id_kostum;
    private String id_tempat;
    private String id_alamat;
    private String nama_kostum;
    private String nama_tempat;
    private String alamat;
    private String jumlah_kostum;
    private String harga_kostum;

    private Long id_cart;
    private String sub_harga;

    public String getJml() {
        return jml;
    }

    public void setJml(String jml) {
        this.jml = jml;
    }

    public String getId_user() {
        return id_user;
    }

    public void setId_user(String id_user) {
        this.id_user = id_user;
    }

    public String getId_kerajang() {
        return id_kerajang;
    }

    public void setId_kerajang(String id_kerajang) {
        this.id_kerajang = id_kerajang;
    }

    public String getId_kostum() {
        return id_kostum;
    }

    public void setId_kostum(String id_kostum) {
        this.id_kostum = id_kostum;
    }

    public String getId_tempat() {
        return id_tempat;
    }

    public void setId_tempat(String id_tempat) {
        this.id_tempat = id_tempat;
    }

    public String getId_alamat() {
        return id_alamat;
    }

    public void setId_alamat(String id_alamat) {
        this.id_alamat = id_alamat;
    }

    public String getNama_kostum() {
        return nama_kostum;
    }

    public void setNama_kostum(String nama_kostum) {
        this.nama_kostum = nama_kostum;
    }

    public String getNama_tempat() {
        return nama_tempat;
    }

    public void setNama_tempat(String nama_tempat) {
        this.nama_tempat = nama_tempat;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getJumlah_kostum() {
        return jumlah_kostum;
    }

    public void setJumlah_kostum(String jumlah_kostum) {
        this.jumlah_kostum = jumlah_kostum;
    }

    public String getHarga_kostum() {
        return harga_kostum;
    }

    public void setHarga_kostum(String harga_kostum) {
        this.harga_kostum = harga_kostum;
    }

    public Long getId_cart() {
        return id_cart;
    }

    public void setId_cart(Long id_cart) {
        this.id_cart = id_cart;
    }

    public String getSub_harga() {
        return sub_harga;
    }

    public void setSub_harga(String sub_harga) {
        this.sub_harga = sub_harga;
    }

    public Keranjang(String id_keranjang, String id_user, String id_kostum, String id_tempat, String id_alamat,
                     String nama_kostum, String nama_tempat, String alamat, String jumlah_kostum, String harga_kostum, String jml, String sub_harga){
        this.id_kerajang=id_keranjang;
        this.id_user= id_user;
        this.id_kostum = id_kostum;
        this.id_tempat = id_tempat;
        this.id_alamat = id_alamat;
        this.nama_kostum= nama_kostum;
        this.nama_tempat= nama_tempat;
        this.alamat= alamat;
        this.jumlah_kostum= jumlah_kostum;
        this.harga_kostum= harga_kostum;
        this.jml=jml;
        this.sub_harga= sub_harga;
    }
}
