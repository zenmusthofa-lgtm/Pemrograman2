package Module01.Problem05;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static final double PHI = 3.14;

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jari-jari: ");
        double r = input.nextDouble();

        System.out.print("Masukkan tinggi: ");
        double t = input.nextDouble();

        double volume = PHI * r * r * t;

        System.out.printf("Volume tabung dengan jari-jari %s cm dan tinggi %s cm adalah %.3f m3\n", R, T, volume);

        input.close();
    }
}
