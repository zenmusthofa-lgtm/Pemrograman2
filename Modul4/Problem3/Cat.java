package Modul4.Problem3;

public class Cat extends Pet {
    private String furColor;

    public Cat(String name, String breed, String furColor) {
        super(name, breed);
        this.furColor = furColor;
    }

    public void display() {
        super.display();
        System.out.println("Memiliki warna bulu : " + furColor);
    }
}