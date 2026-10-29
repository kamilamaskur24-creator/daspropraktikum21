package Pertemuan9;

import java.util.Scanner;

public class Parkir21 {
    public static void main(String[] args) {
        Scanner nuha = new Scanner(System.in);

        //Tarif parkir mobil = 2500 + (P mod 6) x 250 per jam = 2500 + (21 mod 6) x 250 per jam = Rp3.250/jam
        //Tarif parkir motor = 1500 + (P mod 6) x 250 per jam (gunakan nilai (P mod 6) yang SAMA dengan tarif mobil) = 1500 + (21 mod 6) x 250 per jam = Rp2.250/jam

        int pilihan;
        int jam;
        int total = 0;

        while (true) {
            System.out.println("1. Mobil");
            System.out.println("2. Motor");
            System.out.println("0. Keluar");
            System.out.print("Pilih kendaraan: ");

            pilihan = nuha.nextInt();

            if (pilihan == 0) {
                break;
            }

            System.out.print("Lama parkir (jam): ");
            jam = nuha.nextInt();

            if (jam <= 0) {
                System.out.println("Jam harus lebih dari 0!");
                continue;
            }

            if (pilihan == 1) {
                total = total + (jam * 3250);
                System.out.println("Biaya mobil: Rp" + (jam * 3250));
            } else if (pilihan == 2) {
                total = total + (jam * 2250);
                System.out.println("Biaya motor: Rp" + (jam * 2250));
            } else {
                System.out.println("Pilihan tidak tersedia!");
            }
        }

        System.out.println("Total pembayaran: Rp" + total);





















    }
}
