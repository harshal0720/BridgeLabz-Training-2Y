class BookLib {
    private String title;
    private String author;
    private double price;
    private boolean availability;

    BookLib(String title, String author, double price, boolean availability) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.availability = availability;
    }

    void borrowBook() {
        if (availability) {
            availability = false;
            System.out.println(title + " borrowed.");
        } else {
            System.out.println(title + " not available.");
        }
    }

    void display() {
        System.out.println("Title: " + title + ", Author: " + author + ", Price: " + price + ", Available: " + availability);
    }

    public static void main(String[] args) {
        BookLib b1 = new BookLib("Java", "James", 500, true);
        b1.display();
        b1.borrowBook();
        b1.display();
    }
}
