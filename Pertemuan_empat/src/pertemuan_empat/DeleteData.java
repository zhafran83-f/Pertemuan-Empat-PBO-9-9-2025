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
public class DeleteData extends Koneksi {
    public void deleteBuku() {
        try {
            Scanner sc = new Scanner(System.in);

            System.out.print("Masukkan ID Buku yang ingin dihapus: ");
            String id = sc.nextLine();

            String sql = "DELETE FROM buku WHERE ID_buku=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, id);

            int row = ps.executeUpdate();
            if (row > 0) {
                System.out.println("✅ Data berhasil dihapus.");
            } else {
                System.out.println("⚠️ Data dengan ID " + id + " tidak ditemukan.");
            }
            ps.close();
        } catch (Exception e) {
            System.out.println("❌ Gagal hapus data: " + e.getMessage());
        }
    }
}
