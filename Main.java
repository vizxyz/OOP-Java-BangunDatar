package com.uas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        /*Program*/
        //panggil metode
        mainMenu();
    }

    private static void mainMenu(){

        //pilihan menu
        System.out.println("\n============ Hitung Luas dan Keliling Bangun Datar ============");
        System.out.println("1. Persegi");
        System.out.println("2. Persegi Panjang");
        System.out.println("3. Segitiga");
        System.out.println("4. Lingkaran");
        System.out.println("5. Keluar");
        System.out.println("============ Hafiz Syahputra / 2110031805031 ============\n");

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(isr);

        try {
            System.out.print("Masukan Pilihan Menu : ");
            String input = bufferedReader.readLine();

            //kondisional untuk pilihan menu yang dimasukan
            if (input.isEmpty()) {
                System.out.println("\nAnda tidak memasukkan inputan, silahkan coba lagi.\n");
                mainMenu();
            } else {
                int numberOfString = Integer.parseInt(input);

                if (numberOfString == 1) {
                    persegi();
                } else if (numberOfString == 2) {
                    persegiPanjang();
                } else if (numberOfString == 3) {
                    segitiga();
                } else if (numberOfString == 4) {
                    lingkaran();
                } else if (numberOfString == 5) {
                    System.out.println("\nTerimakasih Telah Menggunakan Aplikasi Ini :)\n");
                } else {
                    System.out.println("\nTidak ada pilihan, silahkan coba lagi.\n");
                    mainMenu();
                }
            }
        } catch (NumberFormatException | IOException e) {
            System.out.println("\nTidak ada pilihan, silahkan coba lagi.\n");
            mainMenu();
        }
    }

    private static void persegi() {
        /*Kamus*/
        Persegi opsg;
        double s;
        char coba;

        opsg = new Persegi();

        do {
            System.out.print("\nMasukan sisi persegi: ");
            s = scanner.nextDouble();
            System.out.println("Luas persegi: " + roundingMode(opsg.luas(s)));
            System.out.println("Keliling persegi: " + roundingMode(opsg.keliling(s)));

            System.out.print("\nIngin mencoba lagi? (y/t) : ");
            coba = scanner.next().charAt(0);
            System.out.print("\n");
        } while (coba == 'Y' || coba == 'y');

        System.out.print("\n");

        mainMenu();
    }

    private static void persegiPanjang() {
        /*Kamus*/
        PersegiPanjang opsgpjg;
        double s1, s2;
        char coba;

        opsgpjg = new PersegiPanjang();

        do {
            System.out.print("\nMasukan panjang persegi panjang: ");
            s1 = scanner.nextDouble();
            System.out.print("Masukan lebar persegi panjang: ");
            s2 = scanner.nextDouble();
            System.out.println("Luas persegi panjang: " + roundingMode(opsgpjg.luas(s1, s2)));
            System.out.println("Keliling persegi panjang: " + roundingMode(opsgpjg.keliling(s1, s2)));

            System.out.print("\nIngin mencoba lagi? (y/t) : ");
            coba = scanner.next().charAt(0);
            System.out.print("\n");
        } while (coba == 'Y' || coba == 'y');

        System.out.print("\n");

        mainMenu();
    }

    private static void segitiga() {
        /*Kamus*/
        Segitiga ostg;
        double s1, s2;
        char coba;

        ostg = new Segitiga();

        do {
            System.out.print("\nMasukan alas segitiga: ");
            s1 = scanner.nextDouble();
            System.out.print("Masukan tinggi segitiga: ");
            s2 = scanner.nextDouble();
            System.out.println("Sisi miring (hipotenusa): " + roundingMode(ostg.sisiMiring(s1, s2)));
            System.out.println("Luas segitiga: " + roundingMode(ostg.luas(s1, s2)));
            System.out.println("Keliling segitiga: " + roundingMode(ostg.keliling(s1, s2)));

            System.out.print("\nIngin mencoba lagi? (y/t) : ");
            coba = scanner.next().charAt(0);
            System.out.print("\n");
        } while (coba == 'Y' || coba == 'y');

        System.out.print("\n");

        mainMenu();
    }

    private static void lingkaran() {
        /*Kamus*/
        Lingkaran olingkaran;
        double r;
        char coba;

        olingkaran = new Lingkaran();

        do {
            System.out.print("\nMasukan jari-jari lingkaran: ");
            r = scanner.nextDouble();
            System.out.println("Luas lingkaran: " + roundingMode(olingkaran.luas(r)));
            System.out.println("Keliling lingkaran: " + roundingMode(olingkaran.keliling(r)));

            System.out.print("\nIngin mencoba lagi? (y/t) : ");
            coba = scanner.next().charAt(0);
            System.out.print("\n");
        } while (coba == 'Y' || coba == 'y');

        System.out.print("\n");

        mainMenu();
    }

    private static String roundingMode(double number) {
        DecimalFormat df = new DecimalFormat("#.#####");
        df.setRoundingMode(RoundingMode.CEILING);
        return df.format(number);
    }
}