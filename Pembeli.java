package kuis;

abstract class Pembeli {
    private String nama;
    private String jenis;
    private int nominal;
    private String diskon;

    public Pembeli(String nama, String jenis, int nominal, String diskon) {
        this.nama = nama;
        this.jenis = jenis;
        this.nominal = nominal;
        this.diskon = diskon;
    }

    public String getNama() {
        return nama;
    }

    public String getJenis() {
        return jenis;
    }

    public int getNominal() {
        return nominal;
    }

    public String getDiskon() {
        return diskon;
    }
    
    abstract double diskon300rb();
    abstract double diskon700rb();
    abstract double diskon1_200rb();
    
    abstract void display();
    
}
