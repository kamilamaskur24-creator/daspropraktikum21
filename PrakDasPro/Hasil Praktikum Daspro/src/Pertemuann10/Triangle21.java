package Pertemuann10;

import java.util.Scanner;

public class Triangle21 {
    public static void main(String[] args) {
        Scanner nuha = new Scanner(System.in);
        //Percobaan 3 (uji awal, langkah 3) 2 + (P mod 3) => 2 + (21 mod 3)	= 2 
        
        System.out.print("Masukkan nilai n = ");
        int n = nuha.nextInt();

        int i = 0;
        while (i <= n) {
            
           int j = 0 ;
           while (j < i ) {
            System.out.print("*");
                j++;
            }

           System.out.println();
            i++;
        }
        
        nuha.close();


    }
    }
