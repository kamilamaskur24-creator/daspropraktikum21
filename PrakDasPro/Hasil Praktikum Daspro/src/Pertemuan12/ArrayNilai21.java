package Pertemuan12;

import java.util.Scanner;

public class ArrayNilai21 {
    public static void main(String[] args) {
    
    int[] nilaiAkhir = new int[10];
    Scanner nuha = new Scanner(System.in);

    for (int i = 0; i < nilaiAkhir.length; i++) {
        System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
        nilaiAkhir[i] = nuha.nextInt();
    }  
    int nomor = 1 ;
    int totalLulus = 0;
    int totaktidakLulus = 0; 
   //Gunakan ++ karena kita ingin menghitung jumlah orang, bukan menjumlahkan nomor urut mahasiswa.

    for (int nilai : nilaiAkhir) {
        if ( nilai> 70) {
           System.out.println("Mahasiswa ke-" + nomor + ": " + nilai+ " (" + "LULUS" + " ) ") ;
           totalLulus++; //Modifikasi program agar turut menghitung dan menampilkan jumlah mahasiswa yang lulus dan
        } else {
            System.out.println("Mahasiswa ke-" + nomor + ": " + nilai+ " (" + "TIDAK LULUS" + " ) ") ;
            totaktidakLulus++; //jumlah mahasiswa yang tidak lulus di akhir program
        }
        nomor++;
        }

        System.out.println("Mahasiswa yang Lulus " + totalLulus);
        System.out.println("Mahasiswa yang tidak Lulus " + totaktidakLulus);

        nuha.close();


    }

    }
    
