/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan_empat;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Lenovo IP 330-14IKB
 */
public class Koneksi {
    protected static Connection conn;
    
    
    public Koneksi() {
        try {
            if (conn == null) {
                Class.forName("org.postgresql.Driver"); // load driver

                String URL = "jdbc:postgresql://localhost:5432/Kuliah_PBO";
                String USER = "postgres";   // ganti sesuai username PostgreSQL kamu
                String PASSWORD = "ZayZiya03";  // ganti sesuai password PostgreSQL kamu

                conn = DriverManager.getConnection(URL, USER, PASSWORD);
                System.out.println("✅ Koneksi berhasil ke database: " + URL);
            }
        } catch (Exception e) {
            System.out.println("❌ Koneksi gagal: " + e.getMessage());
        }
    }

    public Connection getConn() {
        return conn;
    }

    public static void main(String[] args) { //mulai tes koneksi Java ke Java
        new Koneksi(); 
    }
}
