package tugasprakpbo2;

import java.util.ArrayList;

class Jurusan{
    private String nama;
    private String fakultas;
    private ArrayList<Mahasiswa> daftarMahasiswa;

    Jurusan(String nama, String fakultas) {
        this.nama = nama;
        this.fakultas = fakultas;
        daftarMahasiswa = new ArrayList<>();
    }
    String getNamaJurusan(){
        return this.nama;
    }
    String getFakultas(){
        return this.fakultas;
    }
    void tambahMahasiswa(Mahasiswa m){
        daftarMahasiswa.add(m);
    }
    void hapusMahasiswa(Mahasiswa m){
        daftarMahasiswa.remove(m);
    }
    ArrayList<Mahasiswa> getDaftarMahasiswa(){
        return daftarMahasiswa;
    }
}

class Mahasiswa{
    private String nama;
    private int nim;
    private Jurusan jurusan;
    private Alamat alamat;
    private Dosen dosen;

    Mahasiswa(String nama, String jalan, String kota, String provinsi, Dosen dosen) {
        this.nama = nama;
        this.dosen = dosen;
        this.alamat = alamat;
        this.alamat = new Alamat(jalan, kota, provinsi);
    }
    String getNama(){
        return this.nama;
    }
    Dosen getDosen(){
        return this.dosen;
    }
    String getJalan(){
        return alamat.getJalan();
    }
    String getKota(){
        return alamat.getKota();
    }
    String getProvinsi(){
        return alamat.getProvinsi();
    }
    Dosen getNamaDosen(){
        return dosen;
    }
    Dosen getMatkul(){
        return dosen;
    }
}

class Dosen{
    private String nama;
    private String matkul;

    Dosen(String nama, String matkul){
        this.nama = nama;
        this.matkul = matkul;
    }
    String getNamaDosen(){
        return this.nama;
    }
    String getMatkul(){
        return this.matkul;
    }
    
}

class Alamat{
    private String jalan;
    private String kota;
    private String provinsi;

    Alamat(String jalan, String kota, String provinsi) {
        this.jalan = jalan;
        this.kota = kota;
        this.provinsi = provinsi;
    }
    String getJalan(){
        return this.jalan;
    }
    String getKota(){
        return this.kota;
    }
    String getProvinsi(){
        return this.provinsi;
    }
}

public class TugasPrakPBO2 {

    public static void main(String[] args) {
        Dosen dosen1 = new Dosen("Pak Agin", "Sofware Oriented Architecture");
        Dosen dosen2 = new Dosen("Pak Hadi", "Web Framework");
        Jurusan jurusan = new Jurusan("Teknik Informatika","Teknik");
        Mahasiswa mahasiswa1 = new Mahasiswa("Yulia Citra","Karapitan","Bandung","Jawa Barat",dosen1);
        Mahasiswa mahasiswa2 = new Mahasiswa("Yulia Citra","Karapitan","Bandung","Jawa Barat",dosen2);
        
        System.out.println(mahasiswa1.getNama() + " adalah mahasiswa jurusan " + jurusan.getNamaJurusan() + ", Di Fakultas " + jurusan.getFakultas());
        System.out.println(mahasiswa1.getNama() + " tinggal di " + mahasiswa1.getJalan() + ", " + mahasiswa1.getKota() + ", " + mahasiswa1.getProvinsi() + ".");
        System.out.println(mahasiswa1.getNama() + " memiliki 2 dosen pebimbing, yaitu: ");
        System.out.println("1. " + mahasiswa1.getNamaDosen().getNamaDosen() + " mengajar " + mahasiswa1.getMatkul().getMatkul());
        System.out.println("2. " + mahasiswa2.getDosen().getNamaDosen() + " mengajar " + mahasiswa2.getMatkul().getMatkul());
    }
    
}
