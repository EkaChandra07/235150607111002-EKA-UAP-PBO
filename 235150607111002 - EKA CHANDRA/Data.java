import java.util.ArrayList;
import java.util.Scanner;

public class Data {
    public static ArrayList<Tanaman> tanamans = new ArrayList<>();
    public static ArrayList<Integer> lokasi = new ArrayList<>();
    public static Scanner in = new Scanner(System.in);

    public static void mulai() {
        System.out.print("Masa tanam (bulan) : ");
        int masaTanam = in.nextInt();
        while (true) {
            System.out.println("Mau menanam apa?");
            System.out.println("1. Tomat");
            System.out.println("2. Stroberi");
            System.out.println("3. Persik");
            int choice = in.nextInt();
            Tanaman tanaman;
            switch (choice) {
                case 1:
                    tanaman = new Tomat();
                    System.out.println("Tomat berhasil ditanam.");
                    break;
                case 2:
                    tanaman = new Stroberi();
                    System.out.println("Stroberi berhasil ditanam.");
                    break;
                case 3:
                    tanaman = new Persik();
                    System.out.println("Persik berhasil ditanam.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    continue;
            }
            tanamans.add(tanaman);

            System.out.print("Mau menanam lagi? (y/n) : ");
            String lagi = in.next();
            if (!lagi.equalsIgnoreCase("y")) {
                break;
            }
        }
    }

    public static void info() {
        System.out.println("\n--------------------");
        System.out.println("PROSES PERKEMBANGAN");
        System.out.println("--------------------\n");

        for (Tanaman tanaman : tanamans) {
            tanaman.berkembang();
        }

        System.out.println("-----HASIL MENANAM-----\n");

        int count = 1;
        for (Tanaman tanaman : tanamans) {
            System.out.printf("Tanaman buah ke-%d\n", count++);
            System.out.println(tanaman.toString());
        }
    }
}