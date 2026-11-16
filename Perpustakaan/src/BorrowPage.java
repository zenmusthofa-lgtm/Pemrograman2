import java.util.Scanner;

public class BorrowPage extends BasePage {
    private Library library;

    public BorrowPage(Scanner sc, Library library) {
        super("Pinjam Buku", sc);
        this.library = library;
    }

    @Override
    protected void content() {
        System.out.print("Nama kamu: ");
        String name = sc.nextLine();
        System.out.print("Nomor buku: ");
        String input = sc.nextLine();

        try {
            int number = Integer.parseInt(input);
            if (library.borrowBook(number, name)) {
                System.out.println("Berhasil dipinjam!");
            } else {
                System.out.println("buku sudah dipinjam sama orang lain.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Nomor harus angka.");
        }
    }
}