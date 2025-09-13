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
public class InsertData extends Koneksi {
    public void insertBuku() {
        try {
            Scanner sc = new Scanner(System.in);

            System.out.print("Masukkan ID Buku (4 digit): ");
            String id = sc.nextLine();
            System.out.print("Masukkan Judul Buku: ");
            String judul = sc.nextLine();
            System.out.print("Masukkan Penulis: ");
            String penulis = sc.nextLine();
            System.out.print("Masukkan Penerbit: ");
            String penerbit = sc.nextLine();
            System.out.print("Masukkan Tahun Terbit: ");
            int tahun = sc.nextInt();

            String sql = "INSERT INTO buku (ID_buku, judul, penulis, penerbit, tahun) VALUES (?,?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, id);
            ps.setString(2, judul);
            ps.setString(3, penulis);
            ps.setString(4, penerbit);
            ps.setInt(5, tahun);

            ps.executeUpdate();
            System.out.println("✅ Data berhasil ditambahkan.");
            ps.close();
        } catch (Exception e) {
            System.out.println("❌ Gagal insert data: " + e.getMessage());
        }
    }
}
