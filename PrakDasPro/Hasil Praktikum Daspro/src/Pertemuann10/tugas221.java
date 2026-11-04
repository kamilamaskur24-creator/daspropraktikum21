package Pertemuann10;

import java.util.Scanner;

public class tugas221 {
    public static void main(String[] args) {

        Scanner nuha = new Scanner(System.in);
        //Tugas 2 (uji wajib) n 5 + (P mod 4) => 5 + (21 mod 4) = 6

        System.out.print("Masukkan nilai n: ");
        int n  = nuha.nextInt();
        
        if (n < 3) {
            System.out.println(" Nilai n minimal 3. ");
        } else {
            int i = 1;
            int total = 0;

            while (i <= n) {
                int j = 1 ;

                while (j <= n) {
                    int total2 = i * j;
                    System.out.printf( "%4d", total2 ) ;
                    
                    total = total + total2;
                    j++;
            }

            System.out.println();
            i++;
        }
        System.out.println("jumlah seluruh angka: " + total );
        }

    }
    }

