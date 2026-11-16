import java.util.Scanner;

public abstract class BasePage implements Page {
    private String title;
    protected Scanner sc;

    public BasePage(String title, Scanner sc) {
        this.title = title;
        this.sc = sc;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public void show() {
        System.out.println("\n--- " + title + " ---");
        content();
        System.out.print("\nEnter untuk kembali...");
        sc.nextLine();
    }

    protected abstract void content();
}