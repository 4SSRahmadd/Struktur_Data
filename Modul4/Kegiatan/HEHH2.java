package Kegiatan;

import java.util.Scanner;
import java.util.HashMap;

public class HEHH2 {

    public HashMap<String, String> dataPraktikan = new HashMap<>();
    public HashMap<String, String> tabelSesiLogin = new HashMap<>();

    public boolean login(String email, String password) {
        if (email.endsWith("@umm.ac.id")) {
            if (tabelSesiLogin.get(email).equals(password)) {
                System.out.println("Berhasil Login");
                return true;
            }
            System.out.println("Gagal Login, Password Salah");
            return false;
        }
        System.out.println("Gagal Login, Email Harus Diakhiri Dengan '@umm.ac.id'");
        return false;
    }

    public boolean tambahData(String nimPraktikan, String namaAsisten) {
        if (nimPraktikan.contains("IF") && !dataPraktikan.containsKey(nimPraktikan)) {
            dataPraktikan.put(nimPraktikan, namaAsisten);
            return true;
        } else {
            return false;
        }
    }

    public void tampil() {
        if (dataPraktikan.isEmpty()) {
            System.out.println("Belum ada data yang diinputkan");
        } else {
            System.out.println("Data praktikan yang telah diinputkan:");
            for (String nim : dataPraktikan.keySet()) {
                System.out.println("NIM: " + nim + ", Nama Asisten: " + dataPraktikan.get(nim));
            }
        }
    }

    public void listNimPraktikan() {
        if (dataPraktikan.isEmpty()) {
            System.out.println("Belum ada data yang diinputkan");
        } else {
            System.out.println("List NIM praktikan yang telah diinputkan:");
            for (String nim : dataPraktikan.keySet()) {
                System.out.println(nim);
            }
        }
    }

    public void listNamaAsisten() {
        if (dataPraktikan.isEmpty()) {
            System.out.println("Belum ada data yang diinputkan");
        } else {
            System.out.println("List Nama Asisten yang telah diinputkan:");
            for (String nim : dataPraktikan.keySet()) {
                System.out.println(dataPraktikan.get(nim));
            }
        }
    }

    public int totalEmail() {
        return dataPraktikan.size();
    }

    public boolean hapusData(String nimPraktikan, String namaAsisten) {
        if (dataPraktikan.containsKey(nimPraktikan) && dataPraktikan.get(nimPraktikan).equals(namaAsisten)) {
            dataPraktikan.remove(nimPraktikan);
            return true;
        } else {
            return false;
        }
    }

    public void editData(String nimPraktikan, String namaAsisten) {
        if (dataPraktikan.containsKey(nimPraktikan)) {
            dataPraktikan.put(nimPraktikan, namaAsisten);
            System.out.println("Data berhasil diubah");
        } else {
            System.out.println("NIM tidak ditemukan");
        }
    }

    public void search(String namaAsisten) {
        if (dataPraktikan.isEmpty()) {
            System.out.println("Belum ada data yang diinputkan");
        } else {
            System.out.println("List NIM praktikan dengan nama asisten " + namaAsisten + ":");
            for (String nim : dataPraktikan.keySet()) {
                if (dataPraktikan.get(nim).equals(namaAsisten)) {
                    System.out.println(nim);
                }
            }
        }
    }

    public static void main(String[] args) {
        HEHH2 in = new HEHH2();
        Scanner input = new Scanner(System.in);
        String nim, aslab;

        in.tabelSesiLogin.put("yaasir@umm.ac.id", "aman");
        System.out.print("Masukan Email : ");
        String email = input.nextLine();
        System.out.print("Masukan Password : ");
        String pass = input.nextLine();

        while (in.login(email, pass)) {

            System.out.println(
                    "===MENU===\n 0. LOG OUT \n 1. Tambah Data\n 2. Tampilkan Data\n 3. Tampilkan Data Praktikan\n 4. Tampilkan Nama Aslab\n 5. Total Data\n 6. Hapus Data\n 7. Edit Data\n 8. Search\n 9. Pilih Menu :");
            int i = input.nextInt();
            if (i == 0) {
                System.out.print(".LOG OUT.");
                break;
            }
            // 1. NAMBAH DATA SEK MOASS
            if (i == 1) {
                System.out.println("Tambahkan Data Praktikan ");
                System.out.print("NIM : ");
                nim = input.next();
                System.out.print("Nama Aslab : ");
                aslab = input.next();
                if (in.tambahData(nim, aslab)) {
                    System.out.println("\nData Berhasil Ditambah");
                } else {
                    System.out.println("\nData Gagal Ditambah");
                }
            }
            // 2. TAMPILKAN DATA
            if (i == 2) {
                in.tampil();
            }
            // 3. TAMPILKAN DATA PRAKTIKAN
            if (i == 3) {
                in.listNimPraktikan();
            }
            // 4. TAMPILKAN NAMA ASLAB
            if (i == 4) {
                in.listNamaAsisten();
            }
            // 5. TOTAL DATA
            if (i == 5) {
                System.out.println("Total Data yang sudah diinputkan : " + in.totalEmail());
            }
            // 6. HAPUS DATA
            if (i == 6) {
                System.out.print("\nHapus Data\nMasukan Nim Praktikan : ");
                nim = input.next();
                System.out.print("Masukan Nama Asisten : ");
                aslab = input.next();
                if (in.hapusData(nim, aslab)) {
                    System.out.println("\nData Berhasil Dihapus");
                } else {
                    System.out.println("\nData Gagal Dihapus");
                }
            }
            // 7. Edit DATAA
            if (i == 7) {
                System.out.print("\nEdit Data\nMasukan Nim Praktikan : ");
                nim = input.next();
                System.out.print("Masukan Nama Asisten : ");
                aslab = input.next();
                in.editData(nim, aslab);
            }
            // 8. SEARCH
            if (i == 8) {
                System.out.print("\nSearch\nMasukan Nama Asisten : ");
                String asisten = input.next();
                in.search(asisten);
            }
        }
    }
}
