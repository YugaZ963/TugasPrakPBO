package tugasprakpbo_6;

abstract class Bentuk {
    
    
    abstract void hitungKeliling();
    abstract void hitungLuas();
}
class Segitiga {
    int sisi;
    int alas;
    int tinggi;
    public Segitiga(int sisi) {
        this.sisi = sisi;
    }
    double hitungKeliling(int sisi){
        int keliling;
        keliling = sisi + sisi + sisi;
        return keliling;
    }
    double hitungLuas(int alas, int tinggi){
    int luas;
    luas = alas * tinggi / 2;
    return luas;
    }
    
}
class Lingkaran {
double phi = 3.14;
int diameter;
    public Lingkaran(int diameter) {
        this.diameter = diameter;
    }
    double hitungKeliling(int r){
        double keliling;
        keliling = 2 * this.phi * r;
        return keliling;
    }
    double hitungLuas(int r){
        double luas;
        luas = this.phi * r * r;
        return luas;
    }
    
}

public class TugasPrakPBO_6 {

    public static void main(String[] args) {
        Segitiga piramid = new Segitiga(2);
        System.out.println(piramid.hitungKeliling(2));
        System.out.println(piramid.hitungLuas(2, 2));
        
        Lingkaran bulet = new Lingkaran(24);
        System.out.println(bulet.hitungKeliling(2));
        System.out.println(bulet.hitungLuas(2));
        
    }
    
}
