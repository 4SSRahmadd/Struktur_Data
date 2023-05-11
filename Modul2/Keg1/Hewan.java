package Keg1;

import java.util.ArrayList;

// Buatlah sebuah ArrayList of String dengan nama-nama Hewan, Lalu isilah ArrayList tersebut dengan ketentuan sebagai berikut ini :
// Index 0 = Angsa, Index 1 = Bebek, Index 2 = Cicak, Index 3 = Domba, Index 4 = Elang, Index 5 = Gajah
// 1. Buatlah object kosong untuk menambahkan ketentuan diatas yang bertipe data String. Boleh menggunakan Library.
public class Hewan {
    public static void main(String[] args) {
        ArrayList<String> Kewan = new ArrayList<>();
        Kewan.add("Angsa");
        Kewan.add("Bebek");
        Kewan.add("Cicak");
        Kewan.add("Domba");
        Kewan.add("Elang");
        Kewan.add("Gajah");
        Kewan.add("Badak");
        Kewan.add("Bebek");

// 2. Tambahkan elemen lagi “Badak” dan ”Bebek”, hitung jumlah elemen “Bebek” dan tampilkan posisi index dari elemen “Bebek” pada object kosong yang telah dibuat
        System.out.println("\n2. ");
        System.out.println("Output : \n" + Kewan);
        int b = 0;
// Posisi index dari bebek
        ArrayList<Integer> Bebek = new ArrayList();
        for (int i = 0; i < Kewan.size(); i++) {
            if (Kewan.get(i).contains("Bebek")) {
                b++;
                Bebek.add(i);
            }
        }
        System.out.println("Jumlah Bebek = " + b);
        System.out.println("Posisi Index ke " + Bebek);
// 3. Hapus posisi “Bebek” yang pertama.
        System.out.println("\n3. ");
        int hps = Bebek.get(0);
        Kewan.remove(hps);
        System.out.println("Output : ");
        System.out.println(Kewan);

// 4. Tampilkan elemen pada index ke-0 dan ke-2, selanjutnya hapus index ke-0.
        System.out.println("\n4. ");
        System.out.println("Output : ");
        System.out.println("Index ke-0 : " + Kewan.get(0));
        System.out.println("Index ke-2 : " + Kewan.get(2));
        Kewan.remove(0);
        System.out.println(Kewan);

// 5. Ubahlah index ke-0 dari “Cicak” Menjadi “Ular”, selanjutnya tambahkan elemen baru pada index ke-2 dengan “Itik”.
        System.out.println("\n5. ");
        Kewan.set(0, "Ular");
        System.out.println(Kewan);
        Kewan.add(2, "Itik");
        System.out.println(Kewan);

// 6. Hapus elemen diantara index ke-1 dan ke-5
        System.out.println("\n6. ");
        for (int x = 2; x < 5; x++) {
            Kewan.remove(2);
        }
        System.out.println("Output : ");
        System.out.println(Kewan);

// 7. Tampilkan elemen pertama dan terakhir.
        System.out.println("\n7. ");
        System.out.println("Output :");
        System.out.println("Elemen Pertama : " + Kewan.get(0));
        System.out.println("Elemen Terakhir : " + Kewan.get(Kewan.size() - 1));

// 8. Tampilkan jumlah elemen pada ArrayList.
// 9. Carilah posisi index dari “Badak”
        System.out.println("\n8. Jumlah Elemen pada Arraylist : " + Kewan.size());
        System.out.println("\n9. Posisi Index Badak : " + Kewan.indexOf("Badak"));
        System.out.println(Kewan);
    }
}
