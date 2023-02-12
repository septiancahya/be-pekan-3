import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Nomor 1
        // a.
        Scanner myObj = new Scanner(System.in);

        String name = "";
        System.out.println("TUGAS PEKAN 3");

        System.out.print("Masukan nama Anda: ");
        name = myObj.nextLine();

        System.out.println("Selamat datang di bootcamp Kawah Edukasi, " + name);

        // b.
        short minShort = -32768;
        short maxShort = 32767;

        double phi = 3.14d;
        double half = 0.5d;

        char start = 'A';
        char end = 'Z';

        boolean isGood = true;
        boolean isBad = false;


        // c.
        String firstWord = "Saya senang";
        String secondWord = "belajar";
        String thirdWord = "Java Language";

        String combined = firstWord + " " + secondWord + " " + thirdWord;
        System.out.println(combined);


        // Nomor 2
        // Luas Lingkaran
        double r = 4;
        double luasLingkaran = phi * (r * r);

        // Volume Balok
        double p = 3;
        double l = 4;
        double t = 5;
        double volumeBalok = p * l * t;

    }
}