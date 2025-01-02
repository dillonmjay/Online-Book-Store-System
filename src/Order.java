public class Order {
    private int orderId;
    private String bookTitle;
    private int quantity;
    private String customerName;

    // Constructor
    public Order(int orderId, String bookTitle, int quantity, String customerName){
        this.orderId = orderId;
        this.bookTitle = bookTitle;
        this.quantity = quantity;
        this.customerName = customerName;
    }

    
}
