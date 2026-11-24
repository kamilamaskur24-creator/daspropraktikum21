package Pertemuan12;

import java.util.Arrays;
import java.util.Scanner;

public class SortNilai21 {
    public static void main(String[] args) {
        Scanner nuha = new Scanner(System.in);
        //Modifikasi kode program Bagian A sehingga program dapat menerima input berupa banyaknya elemen array nilai, 
        //isi array, dan sebuah nilai (key) yang ingin dicari dari pengguna, lalu mencetak indeks posisi
        //elemen dari nilai (key) tersebut.

        int nilaiArray = 0; 
        //program menerima input
        System.out.println("Masukkan nilainya ");
        nilaiArray = nuha.nextInt();

        //isi array
        int  nilai [] = new int [nilaiArray];
        for (int i = 0; i < nilai.length; i++) {
            System.out.println(" Masukkan nilai ke- " + (i + 1) + ": ");
            nilai[i] = nuha.nextInt();
        }
        //proses 
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
