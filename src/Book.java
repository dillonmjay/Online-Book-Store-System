public class Book {
    private String title;
    private String author;
    private double price;
    private int quantity;

    // Constructor
    public Book(String title, String author, double price, int quantity) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.quantity = quantity;
    }

    // Getters and Setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // toString() Method
    @Override
    public String toString() {
        return "Book {" + "title = '" + title + '\''
                        + ", author = '" + author + '\''
                        + ", price = " + price
                        + ", quantity = " + quantity
                        + '}';
    }
}
