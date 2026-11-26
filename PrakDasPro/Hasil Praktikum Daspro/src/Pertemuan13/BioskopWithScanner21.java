package Pertemuan13;

import java.util.Scanner;

public class BioskopWithScanner21 {
    public static void main(String[] args) {
        Scanner nuha = new Scanner(System.in);

        int baris, kolom;
        String nama, pilihan;
       
        String[] [] penonton = new String [4] [2];
        
        while (true) { 
            System.out.print("Masukkan nama: "); 
            nama = nuha.nextLine();
            System.out.print("Masukkan baris: "); 
            baris = nuha.nextInt(); 
            System.out.print("Masukkan kolom: ");
            kolom = nuha.nextInt(); 
            nuha.nextLine(); 
            
            penonton[baris - 1][kolom - 1] = nama; 
            System.out.print("Input penonton lainnya? (y/n): ");
            pilihan = nuha.nextLine(); 
            
            if (pilihan.equalsIgnoreCase("n")) { 
                break; 
            }
        }
    
    
    
    
    
    
    
    
    
    
    }
    
}
