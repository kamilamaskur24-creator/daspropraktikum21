package Pertemuann10;

import java.util.Scanner;

public class Tugas121 {
    public static void main(String[] args) {
        Scanner nuha = new Scanner(System.in);
        //Tugas 1 (uji wajib) n 6 + (P mod 5) => 6 + (21 mod 5) = 7
        System.out.print("Masukkan nilai n = ");
        int n = nuha.nextInt();
        
        int i = 1;
        while (i <= n) {
           int j = 0 ;
           while (j < i) {
            System.out.print(" " + (j +1));
                j++;
            }

            System.out.println();
            i++;
        }
        
        nuha.close();
        System.out.println(" Total angka tercetak: " + n);
    }

    }
    
