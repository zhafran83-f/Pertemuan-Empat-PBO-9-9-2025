/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan_empat;

import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Lenovo IP 330-14IKB
 */
public class ReadData extends Koneksi {
    public void readBuku() {
        try {
            Statement stmt = conn.createStatement();
            String sql = "SELECT * FROM buku";
            ResultSet rs = stmt.executeQuery(sql);

            System.out.println("\n📚 Daftar Buku:");
            System.out.println("ID\tJudul\t\tPenulis\t\tPenerbit\tTahun");
            System.out.println("----------------------------------------------------------");

            while (rs.next()) {
                System.out.printf("%s\t%s\t%s\t%s\t%d\n",
                        rs.getString("ID_buku"),
                        rs.getString("judul"),
                        rs.getString("penulis"),
                        rs.getString("penerbit"),
                        rs.getInt("tahun"));
            }

            rs.close();
            stmt.close();
        } catch (Exception e) {
            System.out.println("❌ Gagal membaca data: " + e.getMessage());
        }
    }
}
