package kuis;

public class Kuis {

    public static void main(String[] args) {
        Pembeli pb1 = new PembeliBiasa("dadang supriatna", "biasa", 300000, "3%");
        Pembeli pm1 = new PembeliMember("budi sidoarjo", "member", 300000, "8%");
        
        Pembeli pb2 = new PembeliBiasa("Endah sutisna", "biasa", 700000, "10%");
        Pembeli pm2 = new PembeliMember("indah nuraini", "member", 700000, "15%");
        
        Pembeli pb3 = new PembeliBiasa("ahmad sudirman", "biasa", 1200000, "15%");
        Pembeli pm3 = new PembeliMember("nani sumitra", "member", 1200000, "20%");
        
        pb1.display();
        System.out.println("nominal yang harus dibayar : " + pb1.diskon300rb()+ "\n");
        pm1.display();
        System.out.println("nominal yang harus dibayar : " + pm1.diskon300rb()+ "\n");
        pb2.display();
        System.out.println("nominal yang harus dibayar : " + pb2.diskon700rb() + "\n");
        pm2.display();
        System.out.println("nominal yang harus dibayar : " + pm2.diskon700rb() + "\n");
        pb3.display();
        System.out.println("nominal yang harus dibayar : " + pb3.diskon1_200rb() + "\n");
        pm3.display();
        System.out.println("nominal yang harus dibayar : " + pm3.diskon1_200rb() + "\n");
    }
    
}
