package Pertemuan12;

import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner nuha = new Scanner(System.in);
    //Buatlah program yang dapat menyimpan dan mengelola nilai mahasiswa (bilangan bulat). Program harus menyediakan fitur untuk;
    //WAJIB: uji program dengan memasukkan sejumlah (5 + (P mod 11))  = 15 , nilai mahasiswa sesuai parameter unik Anda (P = nomor absen), dan pastikan salah satu nilai yang diinput sama dengan (P mod 100). Sertakan hasilnya pada bukti pengerjaan yang dikumpulkan
    //deklarasi 
        int nilaiMhs1;
        double rataRata = 0;
        int tertinggi = 0;
        int terendah = 100;
        int totalNilai = 0;

     //Memasukkan banyaknya nilai mahasiswa yang akan diinput.
        System.out.print("Masukkan banyak nilai mahasiswa yang akan di input : ");
        nilaiMhs1 = nuha.nextInt();

    // Memasukkan setiap nilai mahasiswa satu per satu.
    //array nya 
        int nilaiMhs [] = new int [nilaiMhs1];

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.println("Masukkan nilai mahasiswa ke- " + ( i + 1) + ": " );
            nilaiMhs[i] = nuha.nextInt();   
            }

     // Menghitung nilai rata-rata dari seluruh nilai yang dimasukkan.        
        for (int i = 0; i < nilaiMhs.length; i++) {
            totalNilai += nilaiMhs [i];
        
            if (nilaiMhs[i] > tertinggi) {
                 tertinggi = nilaiMhs[i];
                }
                if (nilaiMhs[i] < terendah) {
                    terendah = nilaiMhs[i];
                }
            }
        rataRata += (double) totalNilai / nilaiMhs.length;
        System.out.println("Rata rata untuk seluruh nilai : " +  rataRata);

    //Menampilkan nilai tertinggi dan nilai terendah.
        System.out.println("nilai tertinggi yakni : " + tertinggi);
        System.out.println("nilai terendah yakni :  " + terendah);

    // Menampilkan semua nilai yang telah dimasukkan, beserta status kelulusannya (LULUS / TIDAK LULUS).
        int nomor = 1;
        for (int semuaNilai : nilaiMhs){
            String status = (semuaNilai > 50 ) ? "LULUS" : "TIDAK LULUS";
            System.out.println("Mahasiswa ke-" + nomor +" Nilai :" + semuaNilai + " Status : " + " ( " + status + " ) " );
            nomor++;

            }

        }

    }  

