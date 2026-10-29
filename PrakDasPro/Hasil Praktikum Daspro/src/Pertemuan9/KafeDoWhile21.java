package Pertemuan9;

import java.util.Scanner;

public class KafeDoWhile21 {
    public static void main(String[] args) {

        //hargaKopi = 10000 + (P mod 5) × 1000 = 10000 + (21 mod 5) x 1000 = 11000
        //hargaTeh = 5000 + (P mod 4) × 1000 = 5000 + (21 mpd 4) x  1000 = 6000
        //hargaRoti = 15000 + (P mod 6) × 1000 = 15000 + (21 mod 6) x 1000 = 18000

        Scanner nuha = new Scanner(System.in);
        int kopi , teh , roti;
        int hargaKopi = 11000 , hargaTeh = 6000 , hargaRoti = 18000;
        int totalHarga;
        String namaPelanggan;

        do {
            System.out.print("Masukkan nama pelanggan (ketik 'batal' untuk keluar): ");
            namaPelanggan = nuha.nextLine();
            if (namaPelanggan.equalsIgnoreCase("batal")) {
                System.out.println("Traksaksi dibatalkan.");
                break;
            }
            System.out.print("Jumlah kopi: ");
            kopi = nuha.nextInt();
            System.out.print("Jumlah teh: ");
            teh = nuha.nextInt();
            System.out.print("Jumlah roti: ");
            roti = nuha.nextInt();
            totalHarga = (kopi * hargaKopi) + (teh * hargaTeh) + (roti * hargaRoti);
            System.out.println("Total yang harus dibayar: Rp " + totalHarga);
            nuha.nextLine();
        } while (true);

        System.out.println("Semua transaksi selesai.");







    }
}
