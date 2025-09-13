/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan_empat;

import java.sql.PreparedStatement;
import java.util.Scanner;

/**
 *
 * @author Lenovo IP 330-14IKB
 */
public class UpdateData extends Koneksi {
    public void updateBuku() {
        try {
            Scanner sc = new Scanner(System.in);

            System.out.print("Masukkan ID Buku yang ingin diupdate: ");
            String id = sc.nextLine();
            System.out.print("Masukkan Judul baru: ");
            String judul = sc.nextLine();
            System.out.print("Masukkan Penulis baru: ");
            String penulis = sc.nextLine();
            System.out.print("Masukkan Penerbit baru: ");
            String penerbit = sc.nextLine();
            System.out.print("Masukkan Tahun baru: ");
            int tahun = sc.nextInt();

            String sql = "UPDATE buku SET judul=?, penulis=?, penerbit=?, tahun=? WHERE ID_buku=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, judul);
            ps.setString(2, penulis);
            ps.setString(3, penerbit);
            ps.setInt(4, tahun);
            ps.setString(5, id);

            int row = ps.executeUpdate();
            if (row > 0) {
                System.out.println("✅ Data berhasil diupdate.");
            } else {
                System.out.println("⚠️ Data dengan ID " + id + " tidak ditemukan.");
            }
            ps.close();
        } catch (Exception e) {
            System.out.println("❌ Gagal update data: " + e.getMessage());
        }
    }
}
