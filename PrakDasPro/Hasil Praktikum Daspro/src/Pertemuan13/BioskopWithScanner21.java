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


        if (pilihan.equals("1")) {
            System.out.println(" Masukkan nama anda : ");
            nama = nuha.nextLine();
            while (true) {
                System.out.println("Masukkan baris , pilih salah satu 1 - 2 - 3 - 4 : ");
                    baris = nuha.nextInt();
                    System.out.println("Masukkan kolom , pilih salah satu 1 - 2 : ");
                    kolom = nuha.nextInt();
                    penonton[baris - 1][kolom - 1] = nama;
                    nuha.nextLine();

                    break;
            }
            
        }else if (pilihan.equals("2")) {
            System.out.println(" Daftar Penonton");
            for (int i = 0; i < penonton.length; i++) {
                for (int j = 0; j < penonton[i].length; j++) {
                    System.out.print(penonton[i][j] + "\t" ) ;
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
    
