package Pertemuan13;

import java.util.Scanner;

public class SIAKAD21 {
    public static void main(String[] args) {
        Scanner nuha = new Scanner(System.in);

        System.out.println(" Masukkan jumlah mahasiswa : ");
        int jmlMahasiswa = nuha.nextInt();

        System.out.println("MAsukkan jumlah amta kuliah : ");
        int jmlhMatkul = nuha.nextInt();

        int [] [] nilai = new int [jmlMahasiswa] [jmlhMatkul];

        for (int i = 0; i < nilai.length; i++) { 
            System.out.println("Input nilai mahasiswa ke-" + (i + 1)); 
            double totalPerSiswa = 0;
        //4 baris = mahasiswa
        //3 kolom = mata kuliah nilainya
            for (int j = 0; j < nilai[i].length; j++) { 
                System.out.print("Nilai mata kuliah " + (j + 1) + ": "); 
                nilai[i][j] = nuha.nextInt(); 
                totalPerSiswa += nilai[i][j];
            }
        
            System.out.println("Nilai rata-rata: " + totalPerSiswa / nilai[i].length);
        }
        //tiap mahasiswa ditampilkan rata rat nya
            System.out.println("\n==========================");
            System.out.println("Rata Rata nilai setiap mata kuliah: ");

            for (int j = 0; j < nilai[0].length; j++) {
                double totalPerMatkul =  0;

            for (int i = 0; i < nilai.length; i++) {
                totalPerMatkul += nilai[i][j];
                }
                System.out.println("Mata kuliah " + (j + 1) + " : " + totalPerMatkul/nilai.length);
            }

    }
    }
    

