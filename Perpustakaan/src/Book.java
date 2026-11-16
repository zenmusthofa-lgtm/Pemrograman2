public class Book {
    private String title;
    private String author;
    private String borrower;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public boolean borrow(String name) {
        if (borrower != null) {
            return false;
        }
        borrower = name;
        return true;
    }

    @Override
    public String toString() {
        String status = (borrower == null) ? "tersedia" : "dipinjam " + borrower;
        return title + " - " + author + " (" + status + ")";
    }
}