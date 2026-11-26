package Pertemuan13;

import java.util.Scanner;

public class BioskopWithScanner21 {
    public static void main(String[] args) {
        Scanner nuha = new Scanner(System.in);

        int baris, kolom;
        String nama, pilihan;
        String[] [] penonton = new String [4] [2];
       
        while (true) {
            System.out.println("Menu dan Fungsi");
            System.out.println("1. Input Data penonton");
            System.out.println("2. Tampilkan daftar Penonton");
            System.out.println("3. Exit");

            System.out.println("Masukkan input menu yang dipilih : ");
            pilihan = nuha.nextLine();

        //input nama, baris , kolom dan Modifikasi program untuk menangani nomor baris atau kolom yang tidak tersedia(misalnya baris 7 atau kolom 0).
        if (pilihan.equals("1")) {
            System.out.println(" Masukkan nama anda : ");
            nama = nuha.nextLine();
        //input jika baris salah
            while (true) {
                System.out.println("Masukkan baris , pilih salah satu 1 - 2 - 3 - 4 : ");
                    baris = nuha.nextInt();
                    
                    if (baris < 1 || baris >4) {
                        System.out.println("Baris Salah input ulang");
                        continue;
                    }
                    System.out.println("Masukkan kolom , pilih salah satu 1 - 2 : ");
                    kolom = nuha.nextInt(); 
                    nuha.nextLine();   
        //input jika kolom salah
                    if (kolom <1 || kolom >2) {
                        System.out.println("kolom salah , ulangi input");
                        continue;

        //Pada menu 1, tampilkan peringatan jika kursi yang dipilih sudah terisi penonton lain, lalu minta baris dan kolom kembali.     
                    }else if(penonton[baris-1][kolom-1]!= null){
                        System.out.println("maaf kursi sudah terisi , pilih yang lain");
                    }
                    penonton[baris - 1][kolom - 1] = nama;
                    break;    
                
                }

        // Pada menu 2, jika sebuah kursi kosong (null), tampilkan *** sebagai pengganti null.
        }else if (pilihan.equals("2")) {
            System.out.println(" Daftar Penonton");
            for (int i = 0; i < penonton.length; i++) {
                for (int j = 0; j < penonton[i].length; j++) {
                    if (penonton[i][j] == null) {
                        System.out.print("***\t");
                    } else {
                    System.out.print(penonton[i][j] + "\t" ) ;
                }
            }
                System.out.println();
            }

        }else if (pilihan.equals("3")) {
            System.out.println(" Exit dari menu ");
            break;

        } else {
            System.out.println(" Input salah , input pilihan dari salah satu menu ");
        }
    }
        nuha.close();
    }
        
    }


    
    
