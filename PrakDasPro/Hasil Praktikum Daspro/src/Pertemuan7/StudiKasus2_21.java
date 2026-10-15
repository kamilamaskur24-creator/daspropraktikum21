package Pertemuan7;

import java.util.Scanner;

public class StudiKasus2_21 {
    public static void main(String[] args) {
        Scanner nuha = new Scanner(System.in);
        String NamaMahasiswa;
        String JenisKegiatan;
        int jumlahdokumen;
        int peringkatJuara;
        int statusPKM;
    
        System.out.print("Nama mahasiswa: ");
        NamaMahasiswa = nuha.nextLine();
        System.out.print("Jenis kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA): ");
        JenisKegiatan = nuha.nextLine();
        System.out.print("Jumlah dokumen yang dikumpulkan: ");
        jumlahdokumen = nuha.nextInt();
        System.out.print("Peringkat: ");
        peringkatJuara = nuha.nextInt();
        System.out.print("Status PKM (1 untuk lolos, 0 untuk tidak lolos): ");
        statusPKM = nuha.nextInt();

        //if yang awal disini buat Jenis Kegiatan biar masuk
        if (JenisKegiatan.equalsIgnoreCase("BELMAWA") || JenisKegiatan.equalsIgnoreCase("BAKORMA") || JenisKegiatan.equalsIgnoreCase("MANDIRI") || JenisKegiatan.equalsIgnoreCase("PKM") || JenisKegiatan.equalsIgnoreCase("LAINNYA")) {

            //nah yang disini if untuk Jumlah dokumen buat lomba
            if (jumlahdokumen < 4) {
                System.out.println("Status : Dokumen tidak lengkap (kurang " + (4 - jumlahdokumen) + " dokumen).");
                System.out.println("Dana penghargaan tidak diberikan.");
            } else {

                
                if (peringkatJuara>= 1 && peringkatJuara <= 3) {
                    System.out.println("Status : Dokumen lengkap.");
                    System.out.println("Dana penghargaan diberikan.");
                } else {
                    System.out.println("Status : Dokumen lengkap, tetapi bukan Juara 1, 2, atau 3.");
                    System.out.println("Dana penghargaan tidak diberikan.");
                }
            }
        } else if (JenisKegiatan.equalsIgnoreCase("PKM")) {
        System.out.println("Status pendanaan PKM (1= Lolos / 0= Tidak Lolos): ");
        statusPKM = nuha.nextInt();
        
         //if disini biar status PKM nya keinput,semoga ga bingung lagi aku
            if (statusPKM == 1) {
                System.out.println("Status : Dokumen lengkap.");
                System.out.println("Dana penghargaan diberikan.");
            } else {
                System.out.println("Status : Dokumen lengkap, tetapi tidak lolos PKM.");
                System.out.println("Dana penghargaan tidak diberikan.");
            }
        } else {
            System.out.println("Jenis kegiatan tidak valid.");
            System.out.println("Dana penghargaan tidak diberikan.");

       
        
        }
    }
}









        


