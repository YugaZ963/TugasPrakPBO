package tugasprakpbo_7;
import java.sql.*;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class TugasPrakPBO_7 {

        static InputStreamReader InputStreamReader = new InputStreamReader(System.in);
        static BufferedReader input = new BufferedReader(InputStreamReader);

    public static void main(String[] args) throws IOException{
        String url = "jdbc:mysql://localhost/tugasprakpbo_5";
        String username = "root";
        String password = "";
        
        
        DBConnection koneksiDB = new DBConnection(url, username, password);
        boolean loop = true;
        do {
        System.out.println("Menu Program");
        System.out.println("=============");
        System.out.println("1. Insert data");
        System.out.println("2. Show data");
        System.out.println("3. Update data");
        System.out.println("4. Delete data");
        System.out.println("5. Keluar");
        System.out.print("masukkan pilihan : ");
        System.out.println("pilihan yang anda masukkan harus benar !!");
        
        
        
            try {
            int pilih = Integer.parseInt(input.readLine());
            
            switch(pilih){
                case 1: {
                    koneksiDB.insertData();
                    break;
                }
                case 2:{
                    koneksiDB.displayData();
                    break;
                }
                case 3: {
                    koneksiDB.updateData();
                    break;
                }
                case 4: {
                    koneksiDB.deleteData();
                    break;
                }
                case 5: {
                    loop = false;
                    System.exit(0);
                    break;
                }
                default:
                    System.out.println("Pilihan yang anda masukkan salah woy!");
            }
            
        } catch (IOException | NumberFormatException e) {
            
        }
    } while(loop);
        }
        
    
}
