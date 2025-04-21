public class Product {
    private String productCode;
    private String productName;
    private int unitPrice;

    public Product(String productCode, String productName, int unitPrice) {
        this.productCode = productCode;
        this.productName = productName;
        this.unitPrice = unitPrice;
    }

    public String getProductName() {
        return productName;
    }

    public int getUnitPrice() {
        return unitPrice;
    }
}
