import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    private ArrayList<Page> pages = new ArrayList<>();
    private Scanner sc;

    public Menu(Scanner sc) {
        this.sc = sc;
    }

    public void add(Page page) {
        pages.add(page);
    }

    public void run() {
        int choice = -1;
        while (choice != 0) {
            System.out.println("\n=== MENU UTAMA ===");
            for (int i = 0; i < pages.size(); i++) {
                System.out.println((i + 1) + ". " + pages.get(i).getTitle());
            }
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");

            try {
                choice = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                choice = -1;
            }

            if (choice >= 1 && choice <= pages.size()) {
                pages.get(choice - 1).show();
            } else if (choice != 0) {
                System.out.println("Pilihan tidak ada.");
            }
        }
        System.out.println("Sampai jumpa!");
    }
}