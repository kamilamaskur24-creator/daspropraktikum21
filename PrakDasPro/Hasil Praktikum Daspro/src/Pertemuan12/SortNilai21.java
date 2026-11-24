package Pertemuan12;

import java.util.Arrays;
import java.util.Scanner;

public class SortNilai21 {
    public static void main(String[] args) {
        Scanner nuha = new Scanner(System.in);
        //Modifikasi kode program Bagian A sehingga program dapat menerima input berupa banyaknya elemen array nilai, 
        //isi array, dan sebuah nilai (key) yang ingin dicari dari pengguna, lalu mencetak indeks posisi
        //elemen dari nilai (key) tersebut.
        //"Nilai yang dicari tidak ditemukan" dengan format pesan yang 
        //lebih informatif apabila nilai yang dicari (key) tidak ada di dalam array.

        int nilaiArray = 0; 
        boolean ditemukan = false;

        //program menerima input
        System.out.println("Masukkan nilainya ");
        nilaiArray = nuha.nextInt();
       

        //isi array
        int  nilai [] = new int [nilaiArray];
        for (int i = 0; i < nilai.length; i++) {
            System.out.println(" Masukkan nilai ke- " + (i + 1) + ": ");
            nilai[i] = nuha.nextInt();

           
        }
        //mencari nilai
        System.out.print("Masukkan nilai yang ingin dicari: ");
        int keyNilai = nuha.nextInt();

        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] == keyNilai) {
                System.out.println("Nilai " + keyNilai + " ditemukan pada indeks " + i);

                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
        System.out.println("Nilai" + keyNilai + " Tidak ditemukan di dalam array");
    }
        for (int i = 0; i < nilai.length - 1; i++) {
            for (int j = 0; j < nilai.length - 1 - i; j++) {

                if (nilai[j] > nilai[j + 1]) {
                int temp = nilai[j];
                nilai[j] = nilai[j + 1];
                nilai[j + 1] = temp;
                }  
        } 
    }
   
    System.out.println("Hasil Pengurutan ");
        //menampilkan indeks
        for (int i = 0; i < nilai.length; i++) {
            System.out.println(" Indeks " + i + " = " + nilai[i]);
        }
    
        System.out.println(Arrays.toString(nilai));

nuha.close();












    }
    
}
