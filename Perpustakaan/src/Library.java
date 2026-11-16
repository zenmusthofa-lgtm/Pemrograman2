import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();

    public Library() {
        books.add(new Book("Laskar Pelangi", "Andrea Hirata"));
        books.add(new Book("Dilan 1990", "Pidi Baiq"));
        books.add(new Book("Atomic Habits", "James Clear"));
    }

    public int getCount() {
        return books.size();
    }

    public Book getBook(int index) {
        return books.get(index);
    }

    public boolean borrowBook(int number, String name) {
        if (number < 1 || number > books.size()) {
            return false;
        }
        return books.get(number - 1).borrow(name);
    }
}