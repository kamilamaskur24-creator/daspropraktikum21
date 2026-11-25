package Pertemuan12;

import java.util.Scanner;

public class KafeKampus {
    public static void main(String[] args) {
        Scanner nuha = new Scanner(System.in);
        //pengguna memilih menu melalui fitur pencarian, mencatat pesanan, serta menghitung total biaya.

        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"};
        int[] harga = {15000, 13000, 10000, 12000, 8000, 18000, 20000};
        int brpPesanan;
        String pesanan;
        boolean ditemukan;
        int nomor = 1;
        int totalpesanan = 0;

        System.out.println("berapa banyak pesanan ? ");
        brpPesanan = nuha.nextInt();
        nuha.nextLine();

        String semuaPesanan [] = new String[brpPesanan];
        int semuaHarga [] = new int [brpPesanan];

        for (int i = 0; i < brpPesanan; i++) {
            System.out.println("masukkan pesanan anda ke-" + nomor);
            pesanan = nuha.nextLine();
            nomor++; 

            ditemukan = false;

            for (int j = 0; j< menu.length; j++) {
                if (pesanan.equalsIgnoreCase(menu[j])) {
                    System.out.println("harganya = " + harga[j]);
                    totalpesanan += harga [j];

                    semuaPesanan[i] = menu[j];
                    semuaHarga[i] = harga[j];

                    ditemukan = true; 
                    break;
                }
            }if (!ditemukan) {
                System.out.println( "menu tidak tersedia "); 
            } 
        }
        System.out.println("total nya adalah : " + totalpesanan);
        
        System.out.println("\n ==== Pesanan Anda === ");
        for (int k = 0; k < brpPesanan; k++) {
            if (semuaPesanan[k] != null) {
                System.out.println( semuaPesanan[k]  + " harganya = " + semuaHarga[k]);
            }
        } 
        System.out.println("totalnya yakni = " + totalpesanan);
    nuha.close();
    }
}
