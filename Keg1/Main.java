package Keg1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
        System.out.println("===HASIL LUAS SEGITIGA YGY===\n");
        System.out.println("\nMAU MENAMPILKAN DALAM BENTUK APA NICH? :");
        System.out.println("1. Hasil dari Integer ");
        System.out.println("2. Hasil dari Double");

        System.out.println("Masukkan pilihan 1/2 :");
        int pilih = masuk.nextInt();

        switch (pilih) {
            case 1:
                System.out.println("Masukkan Nilai alas dan Nilai tinggi secara berurutan");
                System.out.print("Masukkan nilai alas = ");
                int als = masuk.nextInt();
                System.out.print("Masukkan Nilai tinggi = ");
                int tgi = masuk.nextInt();
                Segitiga<Integer> akm = new Segitiga<Integer>(als, tgi);
                System.out.println(akm.getResultAsInt());
                break;
            case 2:
                System.out.println("Masukkan Nilai alas dan Nilai tinggi secara berurutan");
                System.out.print("Masukkan nilai alas = ");
                Double alas = masuk.nextDouble();
                System.out.print("Masukkan nilai tinggi = ");
                Double tinggi = masuk.nextDouble();
                Segitiga<Double> m4 = new Segitiga<Double>(alas, tinggi);
                System.out.println(m4.getResultAsDouble());
                break;
            default:
                System.out.println("Inputan tidak ada");
        }
    }
}
