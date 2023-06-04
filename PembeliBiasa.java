package kuis;

public class PembeliBiasa extends Pembeli{
    
    public PembeliBiasa(String nama, String jenis, int nominal, String diskon) {
        super(nama, jenis, nominal, diskon);
    }

    @Override
    double diskon300rb() {
        if(getNominal() >= 300000){
        double diskon300;
        diskon300 = getNominal()* 0.03;
        return getNominal() - diskon300;
        } else return 0;
        
    }

    @Override
    double diskon700rb() {
        if(getNominal() >= 700000){
        double diskon700;
        diskon700 = getNominal() * 0.1;
        return getNominal() - diskon700;
        } else return 0;   
    }

    @Override
    double diskon1_200rb() {
        if(getNominal() >= 1200000){
        double diskon1_200;
        diskon1_200 = getNominal() * 0.15;
        return getNominal() - diskon1_200;
        } else return 0;
    }

    @Override
    void display() {
        System.out.println("nama pelanggan \t\t: " + getNama() +"\n" +
                            "jenis pelanggan \t: " + getJenis() + "\n" +
                            "nominal awal \t\t: " + getNominal() + "\n" +
                            "diskon \t\t\t: " + getDiskon());
    }
    
}
