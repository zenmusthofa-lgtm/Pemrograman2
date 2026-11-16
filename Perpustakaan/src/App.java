import java.util.Scanner;

public class App {
    private Menu menu;

    public App() {
        Scanner sc = new Scanner(System.in);
        Library library = new Library();

        menu = new Menu(sc);
        menu.add(new BookListPage(sc, library));
        menu.add(new BorrowPage(sc, library));
    }

    public void start() {
        menu.run();
    }
}