package Pertemuan9;

import java.util.Scanner;

public class TiketBioskop21 {
    public static void main(String[] args) {
        
        Scanner nuha = new Scanner(System.in);

        //Harga tiket = 40000 + (P mod 6) × 2000 = 40000 + (21 mod 6) × 2000 = 46000
        //Syarat diskon pertama = lebih dari (3 + (P mod 3)) tiket = tiket (3 + (21 mod 3)) = 3 , dengan diskon (8 + (P mod 5))% = diskon (8 + (21 mod 5))% = 9%
        //Syarat diskon kedua = lebih dari (8 + (P mod 4)) tiket = (8 + (21 mod 4)) = 9 , dengan diskon (15 + (P mod 4))% = (15 + (21 mod 4))% = 16%
        

        int jumlah;
        int totalTiket = 0;
        int harga = 46000;
        double totalUang = 0;

        while (true) {
            System.out.print("Jumlah tiket (0 untuk selesai): ");
            jumlah = nuha.nextInt();

            if (jumlah < 0) {
                System.out.println("Jumlah tidak boleh negatif!");
                continue;
            }

            if (jumlah == 0) {
                break;
            }

            double bayar = jumlah * harga;

            if (jumlah > 3) {
                bayar = bayar - (bayar * 9 / 100);
            } else if (jumlah > 9) {
                bayar = bayar - (bayar * 16 / 100);
            }

            System.out.println("Total bayar: Rp" + bayar);

            totalTiket = totalTiket + jumlah;
            totalUang = totalUang + bayar;
        }

        System.out.println("Total tiket terjual: " + totalTiket);
        System.out.println("Total penjualan: Rp" + totalUang);


    }
}


