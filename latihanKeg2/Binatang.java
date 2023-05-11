import java.util.*;
public class Binatang {
    public static void main(String[] args) {
        ArrayList<String> Hewan = new ArrayList<>();
        Hewan.add("Sapi");
        Hewan.add("Kelinci");
        Hewan.add("Kambing");
        Hewan.add("Unta");
        Hewan.add("Domba");

        ArrayList<String> DeleteHewan = new ArrayList<>();
        DeleteHewan.add("Kelinci");
        DeleteHewan.add("Kambing");
        DeleteHewan.add("Unta");

        String[] hew = Arrays.copyOf(Hewan.toArray(), Hewan.size(), String[].class);
        System.out.println("Hewan : "+Arrays.toString(hew));
        System.out.println("Hewan yang Dihapus : ");
        String[] dhew = Arrays.copyOf(DeleteHewan.toArray(), DeleteHewan.size(), String[].class);
        System.out.println(Arrays.toString(dhew));
        System.out.print("Output Hewan : ");
        for (String outp : DeleteHewan) {
            Hewan.removeIf(item -> item.equals(outp));
        }
        
        System.out.println(Hewan);
    }
}
