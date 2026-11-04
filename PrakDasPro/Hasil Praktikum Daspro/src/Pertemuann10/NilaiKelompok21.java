package Pertemuann10;

import java.util.Scanner;

public class NilaiKelompok21 {
    public static void main(String[] args) {
        Scanner nuha = new Scanner(System.in);
        //Percobaan 4 (uji wajib, langkah 10) jumlahKelompok 2 + (P mod 3) => jumlahKelompok 2 + (21 mod 3) = 2
        //Percobaan 4 (uji wajib, langkah 10) jumlahPenilai 3 + (P mod 2) => jumlahPenilai 3 + (21 mod 2) = 4

        System.out.print("Masukkan jumlah kelompok : ");
        int jumlahKelompok = nuha.nextInt();
        System.out.print("Masukkan jumlah penilai : ");
        int jumlahPenilai = nuha.nextInt();

        if (jumlahKelompok <= 0 || jumlahPenilai <= 0) {
            System.out.println("Jumlah kelompok dan penilai harus > 0.");
        } else {
            // langkah 3 sampai 8 ditulis didalam blok else ini
            int nomorKelompok = 1;        //penghitung outer loop
            double rataTertinggi = 0;  //-1 agar kelompok pertama pasti tercatat 
            int kelompokTerbaik = 0;
            
            while (nomorKelompok <= jumlahKelompok) {
            System.out.println("Kelompok " + nomorKelompok);
            double totalNilai = 0;
            
            for (int j = 1; j <= jumlahPenilai; j++) { 
                int nilai; 
                do {
                    System.out.print(" Nilai dari Penilai " + j + ": ");
                    nilai = nuha.nextInt(); 
                    if (nilai < 0 || nilai > 100) { 
                        System.out.println(" Nilai harus 0-100. Ulangi input!"); 
                    } 
                } while (nilai < 0 || nilai > 100); 
                totalNilai += nilai; 
           }
            double rataNilai = totalNilai / jumlahPenilai; 
            System.out.println("Kelompok " + nomorKelompok + ": nilai rata-rata = " + rataNilai); 
        
            if (rataNilai > rataTertinggi) {
                rataTertinggi = rataNilai;
                kelompokTerbaik = nomorKelompok;
                    // lengkapi: perbarui rataTertinggi dan kelompokTerbaik }
            } 
            System.out.println("=============================="); 
            nomorKelompok++;
            }
                System.out.println("Kelompok terbaik : " + kelompokTerbaik); 
                System.out.println("Rata-rata tertinggi : " + rataTertinggi); 
            }
        }
    }
    



