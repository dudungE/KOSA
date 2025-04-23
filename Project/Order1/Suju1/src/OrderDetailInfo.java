public class OrderDetailInfo {
    private int quantity;
    private double discountRate;
    private Product product;

    public OrderDetailInfo(int quantity, double discountRate, Product product) {
        this.quantity = quantity;
        this.discountRate = discountRate;
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public Product getProduct() {
        return product;
    }
}