package tugasprakpbo5; // Package File

class Mahasiswa { // class mahasiswa
    String nama; // deklarasi var nama bertipe data string
    String nomorHp; // deklarasi var nomorHp bertipe data string
    String E_mail; // deklarasi var E_mail bertipe data string
    int Usia; // deklarasi var Usia bertipe data int
    String NPM; // deklarasi var NPM bertipe data string
    String jurusan; // deklarasi var jurusan bertipe data string
    int semester; // deklarasi var semester bertipe data int
    String alamat; // deklarasi var alamat bertipe data string
    
    public Mahasiswa(String nama, String nomorHp, String E_mail, 
            int Usia, int semester,String NPM, String jurusan, String alamat) {
    // constructor mahasiswa
    }
    void display(){ // fungsi menampilkan data
        System.out.println("nama : " + this.nama + "\n"
                            +"Nomor Hp : " + this.nomorHp + "\n"
                            +"E-mail : " + this.E_mail + "\n"
                            +"Usia : " + this.Usia + "\n"
                            +"Semester : " + this.semester + "\n"
                            +"NPM : " + this.NPM + "\n"
                            +"Jurusan : " + this.jurusan + "\n"
                            +"Alamat : " + this.alamat);
    }
    void perkenalan(){ // fungsi perkenalan diri
        System.out.println("halo perkenalkan nama saya " + this.nama + " \nNPM " +
                this.NPM + " \ndari jurusan "+ this.jurusan + " \nberalamat di " + 
                this.alamat);
    }
}

class MahasiswaReguler extends Mahasiswa{ // class MahasiswaReguler Inheritance Mahasiswa
    String asalSekolah; // deklarasi var asalSekolah bertipe data string 
    
    public MahasiswaReguler(String nama, String nomorHp, String E_mail,
            int Usia, int semester, String NPM, String jurusan, String alamat, 
            String asalSekolah) { // constructor MahasiswaReguler
        super(nama, nomorHp, E_mail,Usia, semester, NPM, jurusan, alamat);
        this.asalSekolah = asalSekolah;
        super.nama = nama;
        super.nomorHp = nomorHp;
        super.E_mail = E_mail;
        super.Usia = Usia;
        super.semester = semester;
        super.NPM = NPM;
        super.jurusan = jurusan;
        super.alamat = alamat;
    }

    @Override
    void display() {
        super.display(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Asal Sekolah : " + this.asalSekolah); // menampilkan kalimat
    }

    @Override
    void perkenalan() {
        super.perkenalan(); //To change body of generated methods, choose Tools | Templates.
    }
    void SayHi(){
        System.out.println("Hi !, saya " + this.nama + " saya mahasiswa reguler");
    }
    
}

class MahasiswaTransfer extends Mahasiswa{ // class MahasiswaTransfer Inheritance Mahasiswa
    String asalUniverstas; // deklarasi var asalSekolah bertipe data string 
    
    public MahasiswaTransfer(String nama, String nomorHp, String E_mail, 
            int Usia, int semester, String NPM, String jurusan, 
            String alamat, String asalUniverstas) { // constructor MahasiswaTransfer
        super(nama, nomorHp, E_mail,Usia, semester, NPM, jurusan, alamat);
        this.asalUniverstas = asalUniverstas;
        super.nama = nama;
        super.nomorHp = nomorHp;
        super.E_mail = E_mail;
        super.Usia = Usia;
        super.semester = semester;
        super.NPM = NPM;
        super.jurusan = jurusan;
        super.alamat = alamat;
    }

    @Override
    void display() { // method override
        super.display(); 
        System.out.println("Asal Universitas : " + this.asalUniverstas);            
    }

    @Override
    void perkenalan() { // method override
        super.perkenalan(); //To change body of generated methods, choose Tools | Templates.
    }
    void SayHi(){
        System.out.println("Hi !, saya " + this.nama + " saya mahasiswa transfer");
    }
}

public class TugasPrakPBO5 {

    public static void main(String[] args) {
        Mahasiswa mhsReg1 = new MahasiswaReguler("Budi Sidoarjo","087754632167",
                                "bdsdj22@jmail.cim",18,2,"41155050220031","teknik mesin",
                                "jl. setiabudi. no 56","SMAN 5 BDG");
        // membuat objek mhsReg1 dari kelas MahasiswaReguler dengan menggunakan constructor 
        // yang menerima argumen
        Mahasiswa mhsReg2 = new MahasiswaReguler("Tatang Suhendra","087754632168",
                                "ttgshd77@jmail.cim",19,4,"41155050220030","teknik sipil",
                                "jl. untung. no 07","SMAN 11 BDG");
        // membuat objek mhsReg1 dari kelas MahasiswaReguler dengan menggunakan constructor 
        // yang menerima argumen
        Mahasiswa mhsReg3 = new MahasiswaReguler("Hennie Surlani","087754632169",
                                "henlan43@jmail.cim",20,2,"41155050220029","Arsitek",
                                "jl. cut nyak dien. no 36","SMKN 3 BDG");
        // membuat objek mhsReg1 dari kelas MahasiswaReguler dengan menggunakan constructor 
        // yang menerima argumen
        Mahasiswa mhsReg4 = new MahasiswaReguler("Ono Sudrajat","087754632170",
                                "onosud020@jmail.cim",22,6,"41155050220028","teknik industri",
                                "jl. Pattimura. no 10","SMAN 22 BDG");
        // membuat objek mhsReg1 dari kelas MahasiswaReguler dengan menggunakan constructor 
        // yang menerima argumen
        MahasiswaReguler mhsReg5 = new MahasiswaReguler("danang subagja","087754632189",
                                "danbag079@jmail.cim",22,6,"41155050220020","teknik nuklir",
                                "jl. dipatiukur. no 10","SMAN 21 BDG");
        
        Mahasiswa mhsTf1 = new MahasiswaTransfer("Dadan Supratna", "087754632171", 
                               "danprt23@jmailcim", 30, 6, "41155050220027", "teknik elektro", 
                               "jl imam bonjol no 09", "UNLA");
        // membuat objek mhsReg1 dari kelas MahasiswaReguler dengan menggunakan constructor 
        // yang menerima argumen
        Mahasiswa mhsTf2 = new MahasiswaTransfer("Lani Sulastri", "087754632172", 
                               "lanlas63@jmailcim", 21, 4, "41155050220026", "teknik fisika", 
                               "jl mekar wangi no 45", "UNPAD");     
        // membuat objek mhsReg1 dari kelas MahasiswaReguler dengan menggunakan constructor 
        // yang menerima argumen
        
        mhsReg5.SayHi();
        System.out.println("");
        Mahasiswa kumpulanMhsReg[] = new Mahasiswa[4] ;
        kumpulanMhsReg[0] = mhsReg1;
        kumpulanMhsReg[1] = mhsReg2;
        kumpulanMhsReg[2] = mhsReg3;
        kumpulanMhsReg[3] = mhsReg4;
        // menginisialisasi array kumpulanMhsReg dengan kapasitas 4 dan mengisi elemennya 
        // dengan objek-objek mhsReg1, mhsReg2, mhsReg3, dan mhsReg4.
        
        Mahasiswa kumpulanMhsTf[] = new Mahasiswa[2];
        kumpulanMhsTf[0] = mhsTf1;
        kumpulanMhsTf[1] = mhsTf2;
        // menginisialisasi array kumpulanMhsTf dengan kapasitas 2 dan mengisi elemennya dengan 
        // objek-objek mhsTf1 dan mhsTf2.
        
        kumpulanMhsReg[0].display();
        System.out.println("");
        kumpulanMhsReg[1].display();
        System.out.println("");
        kumpulanMhsReg[2].display();
        System.out.println("");
        kumpulanMhsReg[3].display();
        System.out.println("");
        kumpulanMhsTf[0].display();
        System.out.println("");
        kumpulanMhsTf[1].display();
        // memanggil metode display() pada objek-objek dalam array kumpulanMhsReg dan kumpulanMhsTf. 
        // Metode display() digunakan untuk menampilkan informasi mengenai mahasiswa.
        
        kumpulanMhsReg[0].perkenalan();
        // memanggil metode perkenalan() pada objek kumpulanMhsReg[0], yang menampilkan pesan 
        // perkenalan dari mahasiswa pertama dalam array kumpulanMhsReg.
        
        
    }
    
}
