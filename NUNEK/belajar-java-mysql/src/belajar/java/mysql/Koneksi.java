
package belajar.java.mysql;

//import static belajar.java.mysql.MySQL.CONN;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Koneksi {
    Connection con;
    Statement stm;

    public void config() {
        try {
            // Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/coronashooter?serverTimezone=UTC", "root", "");
            stm = con.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
