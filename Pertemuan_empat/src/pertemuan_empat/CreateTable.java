/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan_empat;

import java.sql.Statement;

/**
 *
 * @author Lenovo IP 330-14IKB
 */
public class CreateTable extends Koneksi {
        public CreateTable() {
        super(); // panggil constructor Koneksi
        try {
            Statement stmt = conn.createStatement();

            // SQL buat tabel "buku"
            String sql = "CREATE TABLE IF NOT EXISTS buku (" +
                         "ID_buku VARCHAR(4) PRIMARY KEY, " +
                         "judul VARCHAR(100), " +
                         "penulis VARCHAR(100), " +
                         "penerbit VARCHAR(100), " +
                         "tahun INT" +
                         ")";

            stmt.executeUpdate(sql);
            System.out.println("✅ Tabel 'buku' berhasil dibuat (atau sudah ada).");

            stmt.close();
        } catch (Exception e) {
            System.out.println("❌ Gagal membuat tabel: " + e.getMessage());
        }
    }

    // untuk testing langsung
    public static void main(String[] args) {
        new CreateTable();
    }
}
