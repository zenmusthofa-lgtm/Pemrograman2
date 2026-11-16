import java.util.Scanner;

public class BookListPage extends BasePage {
    private Library library;

    public BookListPage(Scanner sc, Library library) {
        super("Daftar Buku", sc);
        this.library = library;
    }

    @Override
    protected void content() {
        for (int i = 0; i < library.getCount(); i++) {
            System.out.println((i + 1) + ". " + library.getBook(i));
        }
    }
}