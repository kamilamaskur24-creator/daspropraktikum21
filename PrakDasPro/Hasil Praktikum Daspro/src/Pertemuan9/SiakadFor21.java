package Pertemuan9;

import java.util.Scanner;

public class SiakadFor21 {
    public static void main(String[] args) {
        Scanner nuha = new Scanner(System.in);
        
        double nilai , tertinggi = 0  , terendah = 100;
        int lulus = 0 , tidaklulus = 0;
        
        //8 +(p mod 5) = 8 +(21 mod 5)=8+1= 9
        //(modifikasi kode) = 55 + (P mod 11) = 55 + (21 mod 11) = 65
        //++ artinya menambah nilai menjadi 1

        for (int i = 1;   i  <= 9; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + i + ": ");
            nilai = nuha.nextDouble();
            if (nilai > tertinggi) {
                tertinggi = nilai;
            }
            if (nilai  < terendah) {
                terendah = nilai;           
            } 
            if (nilai >= 65) {
                lulus++;
            } else {
                tidaklulus++;

            }

        }

        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terrendah: " + terendah);
        System.out.println("Jumlah Mahasiswa lulus: " + lulus);
        System.out.println("Jumlah mahasiswa tidak lulus: " + tidaklulus);
        
    }   
}
