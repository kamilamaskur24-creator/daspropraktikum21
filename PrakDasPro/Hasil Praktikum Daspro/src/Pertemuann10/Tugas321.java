package Pertemuann10;

import java.util.Scanner;

public class Tugas321 {
    public static void main(String[] args) {
        Scanner nuha = new Scanner(System.in);
        //Tugas 3 (uji wajib) jumlahToko 2 + (P mod 3) => 2 + (21 mod 3) = 2
        
        System.out.print("Masukkan jumlah toko : ");
        int jumlahToko = nuha.nextInt();

        
        while (jumlahToko < 1) {
            System.out.print("Jumlah toko minimal 1. ");
            System.out.print("Masukkan jumlah toko : ");
            jumlahToko = nuha.nextInt();
        }
        int nomorToko = 1;
        int totalSeluruhBarang = 0;
        int barangTerbanyak = -1;
        int tokoTerbanyak = 0;

        while (nomorToko <= jumlahToko) {
            System.out.print(" Toko " + nomorToko );

            System.out.print(" Masukkan jumlah pelanggan : ");
            int jumlahPelanggan = nuha.nextInt();
            System.out.print("");

            while (jumlahPelanggan < 0 ) {
                System.out.print("jumlah pelanggan tidak boleh negatif");
                System.out.print("masukkan jumlah pelanggan ");
                jumlahPelanggan = nuha.nextInt();   
            }
            int totalBarangToko = 0;

            for (int i  = 1 ; i <= jumlahPelanggan; i++) {
                int jumlahBarang;

                do {
                    System.out.print("jumlah barang pelanggan ke-" + i + ": ");
                    jumlahBarang = nuha.nextInt();

                    if (jumlahBarang < 0) {
                        System.out.println("Jumlah barang tidak boleh negatif. Ulangi input ");
                    }
                } while (jumlahBarang < 0);
                totalBarangToko+= jumlahBarang;
            }
           
            System.out.println("Toko " + nomorToko + " - pelanggan: " + jumlahPelanggan + ", total barang: " + totalBarangToko);

             totalSeluruhBarang += totalBarangToko;

                if (totalBarangToko > barangTerbanyak) {
                    barangTerbanyak = totalBarangToko;
                    tokoTerbanyak = nomorToko;
                }

                System.out.println("==============================");
                nomorToko++;
            }

            System.out.println("Total barang seluruh toko: " + totalSeluruhBarang);
            System.out.println("Toko dengan barang terbanyak: " + tokoTerbanyak);
        }
    }



    
