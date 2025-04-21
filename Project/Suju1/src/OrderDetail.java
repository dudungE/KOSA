public class OrderDetail {
    private int quantity;
    private double discountRate;
    private Product product;

    public void registerOrderDetail(OrderDetailInfo info) {
        this.quantity = info.getQuantity();
        this.discountRate = info.getDiscountRate();
        this.product = info.getProduct();
        System.out.println("Order detail registered for product: " + product.getProductName());
    }

    // Getter for product (optional)
    public Product getProduct() {
        return product;
    }
}
