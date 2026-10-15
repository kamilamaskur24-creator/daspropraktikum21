package Pertemuan7;

import java.util.Scanner;

public class StudiKasus1_21 {
    public static void main(String[] args) {
        Scanner nuha = new Scanner(System.in);
        int hargaPerCub = 18000;
        int jumlahCup , uangBayar;
        int totalHarga , diskon , totalBayar;
        int kembalian , kurang ;

        System.out.print(" Masukkan jumlah cup : " );
        jumlahCup = nuha.nextInt();
        System.out.print(" Masukkan uang bayar : " );
        uangBayar = nuha.nextInt();

        totalHarga = jumlahCup * hargaPerCub;
        diskon = 0;

        if (totalHarga >= 100000) {
            diskon = totalHarga * 10 / 100;
        }

        totalBayar = totalHarga - diskon;

        System.out.println( " Total harga : " + totalHarga);
        System.out.println( " Diskon      : " + diskon);
        System.out.println( " Total bayar : " + totalBayar);

        if (uangBayar >= totalBayar) {
            kembalian = uangBayar - totalBayar;
        } else {
            kurang  = totalBayar - uangBayar;
            System.out.print(" Uang tidak cukup, kurang : Rp " + kurang);

        }







    }
}
       