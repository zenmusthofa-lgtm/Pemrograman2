package Modul4.Problem3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pilih jenis hewan yang ingin diinputkan:");
        System.out.println("1 = Kucing");
        System.out.println("2 = Anjing");
        System.out.print("Masukkan pilihan: ");
        int choice = Integer.parseInt(scanner.nextLine().trim());

        if (choice != 1 && choice != 2) {
            System.out.println("Pilihan tidak valid. Masukkan 1 atau 2.");
            scanner.close();
            return;
        }

        System.out.print("Nama hewan peliharaan: ");
        String name = scanner.nextLine();

        System.out.print("Ras: ");
        String breed = scanner.nextLine();

        System.out.print("Warna Bulu: ");
        String furColor = scanner.nextLine();

        Pet pet;
        if (choice == 1) {
            pet = new Cat(name, breed, furColor);
        } else if (choice == 2) {
            System.out.print("Kemampuan : ");
            String[] abilities = scanner.nextLine().split(",");
            pet = new Dog(name, breed, furColor, abilities);
        } else {
            return;
        }

        pet.display();

        scanner.close();
    }
}