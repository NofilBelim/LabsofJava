package Lab7;
class Book {
    int bookId;
    String title;
    String author;
    double price;

    Book(int bookId, String title, String author, double price) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void display() {
        System.out.println("Book ID: " + bookId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}

class Periodical extends Book {
    String period;

    Periodical(int bookId, String title, String author, double price, String period) {
        super(bookId, title, author, price);
        this.period = period;
    }

    void updatePrice(double newPrice) {
        this.price = newPrice;
    }

    void updatePeriod(String newPeriod) {
        this.period = newPeriod;
    }

    void displayPeriodical() {
        display();
        System.out.println("Period: " + period);
    }
}

public class Q3_BookDemo {
    public static void main(String[] args) {
        Periodical p = new Periodical(101, "Science Today", "ABC Publisher", 150.0, "Monthly");

        System.out.println("Original Details:");
        p.displayPeriodical();

        p.updatePrice(200.0);
        p.updatePeriod("Weekly");

        System.out.println("\nUpdated Details:");
        p.displayPeriodical();
    }
}
