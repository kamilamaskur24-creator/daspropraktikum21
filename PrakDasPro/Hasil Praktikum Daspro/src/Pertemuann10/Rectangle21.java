package Pertemuann10;

import java.util.Scanner;

public class Rectangle21 {
    public static void main(String[] args) {
        Scanner nuha = new Scanner(System.in);
        //(baris, kolom) uji ke-1  (2 + (P mod 3), 4 + (P mod 3)) => (2 + (21 mod 3), 4 + (21 mod 3)) = 2 , 4
        //(uji tambahan, langkah 9) (baris, kolom) uji ke-2 (5 + (P mod 3), 2 + (P mod 3)) => (5 + (21 mod 3), 2 + (21 mod 3)) = 5 , 2
        //(Pertanyaan 2) baris, kolom 4 + (P mod 4), 6 + (P mod 4) => 4 + (21 mod 4), 6 + (21 mod 4) = 5 , 7
        
        System.out.print("Masukkan jumlah baris: ");
        int baris = nuha.nextInt();
        System.out.print("Masukkan jumlah kolom: ");
        int kolom = nuha.nextInt();

        for (int i = 1; i <= baris; i++) {
            for (int j = 1; j <= kolom; j++) {
            System.out.print(" * ");
        }
        System.out.println(); 
           
    }
        nuha.close();
    }
}
