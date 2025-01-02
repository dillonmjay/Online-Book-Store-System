public class PremiumCustomer extends Customer {
    // Additional attribute for premium customers
    private double discountRate;

    // Constructor to initialize PremiumCustomer attibutes
    public PremiumCustomer(String name, String username, String password, double discountRate){
        super(name, username, password);
        this.discountRate = discountRate;
    }

    // Getters and Setters for discount rate
    public double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }

    
}
