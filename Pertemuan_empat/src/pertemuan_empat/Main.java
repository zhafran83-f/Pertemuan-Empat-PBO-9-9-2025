/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan_empat;

import java.util.Scanner;

/**
 *
 * @author Lenovo IP 330-14IKB
 */
public class Main {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        InsertData insert = new InsertData();
        UpdateData update = new UpdateData();
        ReadData read = new ReadData();
        DeleteData delete = new DeleteData();

        while (true) {
            System.out.println("\n===== MENU TOKO BUKU =====");
            System.out.println("1. Insert Data");
            System.out.println("2. Update Data");
            System.out.println("3. Delete Data");
            System.out.println("4. Read Data");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            int pilih = sc.nextInt();
            sc.nextLine(); // buang newline

            switch (pilih) {
                case 1:
                    insert.insertBuku();
                    break;
                case 2:
                    update.updateBuku();
                    break;
                case 3:
                    delete.deleteBuku();
                    break;
                case 4:
                    read.readBuku();
                    break;
                case 5:
                    System.out.println("👋 Keluar dari program.");
                    System.exit(0);
                default:
                    System.out.println("⚠️ Pilihan tidak valid.");
            }
        }
    }
}
