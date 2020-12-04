
package belajar.java.mysql;

//import static belajar.java.mysql.MySQL.CONN;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Koneksi {
    Connection con;
    Statement stm;
    Statement stat;
    ResultSet rs;
    String sql;

    public void config() {
        try {
            // Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/coronashooter?serverTimezone=UTC", "root", "");
            stm = con.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public  void buatSkor(int skor, int corona,String nama){
        
        int id = ambil_id(nama);
        Koneksi DB = new Koneksi();
        DB.config();
        con = DB.con;
        stat = DB.stm;
        try {
            sql = "INSERT INTO score (nilai,corona,id_player) VALUES ("+ skor +" , "+ corona +" , "+ id +")";
            int i = stat.executeUpdate(sql);
                if (i != 0) {
                    System.out.println("Skor berhasil diinput");
                } else {
                    System.out.println("Gagal insert skor");
                }
        }catch (HeadlessException | SQLException e) {
            System.out.println("Skor Gagal Dimasukan" + e.getMessage());
        }
    }
    
    
    public int ambil_id(String nama){
        int nilai = 0;
        Koneksi DB = new Koneksi();
        DB.config();
        con = DB.con;
        stat = DB.stm;
        try {
            sql = "SELECT id_player FROM player WHERE username = '"+ nama +"'";
            rs = stat.executeQuery(sql);
            while(rs.next()){
                nilai = rs.getInt("id_player");    
                System.out.println("nilai");
            }

        }catch (HeadlessException | SQLException e) {
            System.out.println("Id Gagal diambil" + e.getMessage());
        }
        return nilai;
    } 
}
