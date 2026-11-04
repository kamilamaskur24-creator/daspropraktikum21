package Pertemuann10;

import java.util.Scanner;

public class Star21 {
    public static void main(String[] args) {
        Scanner nuha = new Scanner(System.in);
        //n (uji ke-1)  3 + (P mod 5) => 3 + ( 21 mod 5) = 4
        // n (uji ke-2) 9 + (P mod 5) => 9 + (21 mod 5) = 10
        //(Pertanyaan 1 & 2) n 4 + (P mod 4) => 4 + (21 mod 4) = 5
        //(Pertanyaan 3) n 10 + (P mod 6) =>  10 + (21 mod 6)= 13 
        
        System.out.print("Masukkan nilai n = ");
        int n =nuha.nextInt();

        for (int i = 1 ; i <= n; i++) {  
            System.out.print("*");
    
        }
        System.out.println();
        nuha.close();

    }
    
}
