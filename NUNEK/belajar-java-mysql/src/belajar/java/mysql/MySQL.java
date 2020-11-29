package belajar.java.mysql;

import java.sql.*;

public class MySQL {
   static final Connection CONN = connect();

   static Connection connect() {
      Connection conn = null;
      String url = "jdbc:mysql://localhost/isibensin";

      try {
         conn = DriverManager.getConnection(url, "root", "");
         System.out.println("Connection enstablished");
      } catch (Exception e) {
         e.printStackTrace();
      }
      return conn;
   }

   static void executeUpdateQuerry(String querry) {
      try {
         Statement stt = CONN.createStatement();
         stt.executeUpdate(querry);

      } catch (Exception e) {
         e.printStackTrace();
      }
   }

   static ResultSet executeReadQuerry(String querry) {
      ResultSet rs = null;
      try {
         Statement stt = CONN.createStatement();
         rs = stt.executeQuery(querry);

      } catch (Exception e) {
         e.printStackTrace();
      }
      return rs;
   }

   public static void main(String[] args) {

   }
}
