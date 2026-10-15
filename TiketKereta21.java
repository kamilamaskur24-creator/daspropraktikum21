package Pertemuan8;

import java.util.Scanner;

public class TiketKereta21 {
    public static void main(String[] args) {
        Scanner nuha = new Scanner(System.in);
        String kode_layanan;
        
        String Layanan;
        String Biaya_dasar;
        double Diskon;
        double Total_bayar;

    
        switch (kode_layanan) {
            case 1;
            System.out.println(" kode 1 ekonomi,bayar Rp50000");
                break;
            case 2;
            System.out.println("kode 2 eksekutif,bayar Rp85000");
                break;
            case 3;
            System.out.println("kode 3 anak, bayar Rp 40000");
                break;
                
                
                default:
                break;
        }

        System.out.println("Layanan");
        Layanan = nuha.nextInt();
        System.out.println("Biaya dasar");
        Biaya_dasar= nuha.nextInt();
        System.out.print("Diskon");
        Diskon = nuha.nextDouble();
        System.out.print("Total bayar");
        Total_bayar = nuha.nextDouble();
    
    

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    }
}
