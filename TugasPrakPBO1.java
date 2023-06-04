package tugasprakpbo1;
import java.util.ArrayList;

//class mahasiswa
class Mahasiswa {
    static int JumlahMahasiswa;
    private String nama;
    private int usia;
    private String npm;
    private double ipk;
    private ArrayList<Mata_Kuliah> daftarMk;
    // constructornya
  Mahasiswa(String nama, int usia, String npm){
    Mahasiswa.JumlahMahasiswa++;
    this.nama = nama;
    this.usia = usia;
    this.npm = npm;
    this.ipk = ipk;
    this.daftarMk = new ArrayList<>();
  }
  
// ini cuman tambahanan ngambil materi PBO Pak eddy
  static void showJumlahMahasiswa(){
      System.out.println(Mahasiswa.JumlahMahasiswa);
  }
  // untuk menambahkan matkul
  void tambahMatkul(Mata_Kuliah mk){
      daftarMk.add(mk);
      
  }
  // untuk menampilkan
  void showTambahMatkul(){
      System.out.println("daftar mahasiswa yang diambil oleh " + nama + ", " + usia + ", " + npm +
      "." );
      for(int i = 0; i < daftarMk.size(); i++){
          Mata_Kuliah mk = daftarMk.get(i);
          System.out.println(mk.getKode() + " - " + mk.getMatkul() + " - " + mk.getSKS());
      }
  }
  
}
// class matkul
class Mata_Kuliah {
    private String KodeMatkul ;
    private String NamaMatkul ;
    private int sks ;
    
    Mata_Kuliah() {
        
    }
    // setter kode
  void setKode(String kode){
      this.KodeMatkul = kode;
  }
  // getter kode
  String getKode(){
      return this.KodeMatkul;
  }
  // setter matkul
  void setMatkul(String matkul){
      this.NamaMatkul = matkul;
  }
  // getter matkul
  String getMatkul(){
      return this.NamaMatkul ;
      
  }
  // setter sks
  void setSKS(int sks){
      this.sks = sks ;
  }
  // getter sks
  int getSKS(){
      return this.sks ;
  }
}
public class TugasPrakPBO1 {
    public static void main(String[] args) {
        System.out.println("jumlah obj mahasiswa");
        Mahasiswa.showJumlahMahasiswa();
        Mahasiswa mahasiswa1 = new Mahasiswa("yuga", 20, "41155050220057");
        
        String[][] dataMatkul = {{"iF0001","Pemrograman Berorientasi Objek","2"},
                {"iF0001","Pemrograman Berorientasi Objek","2"}};
        for(int j = 0; j < dataMatkul.length;j++){
            Mata_Kuliah mk = new Mata_Kuliah();
            mk.setKode(dataMatkul[j][0]);
            mk.setMatkul(dataMatkul[j][1]);
            mk.setSKS(Integer.parseInt(dataMatkul[j][2]));
            
            mahasiswa1.tambahMatkul(mk);
        }
        
        mahasiswa1.showTambahMatkul();
        System.out.println("jumlah obj mahasiswa");
        Mahasiswa.showJumlahMahasiswa();
    }
    
}
