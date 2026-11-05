package Modul4.Problem2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nama Hewan Peliharaan: ");
        String name = scanner.nextLine();

        System.out.print("Ras: ");
        String breed = scanner.nextLine();

        Pet pet = new Pet(name, breed);
        pet.display();

        scanner.close();
    }
}