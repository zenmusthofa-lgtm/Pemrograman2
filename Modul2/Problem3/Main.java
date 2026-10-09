package Modul2.Problem3;

public class Main {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.name = "Roi";

        e.origin = "Kingdom of Orvel";
        e.setRole("Assasin");

        System.out.println("Nama: " + e.getName());

        System.out.println("Asal: " + e.getOrigin());
        System.out.println("Jabatan: " + e.role);

        System.out.println("Umur: " + e.age + " tahun");
    }
}