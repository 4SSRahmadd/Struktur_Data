package Latihan1;

import java.util.HashMap;
import java.util.Scanner;

public class Mahasiswa {
    String nama, kelas, matkulPraktikum;
    int nomerIndukMahasiswa;

    public Mahasiswa(String nm, String kl, String mp, int nim){
        this.nama = nm;
        this.kelas = kl;
        this.matkulPraktikum = mp;
        this.nomerIndukMahasiswa = nim;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Mahasiswa> mhs = new HashMap<>();
        String input;
        Mahasiswa data;

        mhs.put("1", new Mahasiswa("Putri","3H","Struktur Data", 2020000));
        mhs.put("2", new Mahasiswa("Agus","3A","Matematika",2020012));
        mhs.put("3", new Mahasiswa("Arro","30","Pemrograman",2020017));

        System.out.print("Masukkan ID : ");
        input = scanner.nextLine();
        data = mhs.get(input);
        if (data != null){
            System.out.println("Data Mahasiswa : " + data.nama + ", Kelas : " +
                    data.kelas + ", Mata Kuliah Praktikum : " + data.matkulPraktikum +
                    ", Nim : " + data.nomerIndukMahasiswa);
        }
    }
}