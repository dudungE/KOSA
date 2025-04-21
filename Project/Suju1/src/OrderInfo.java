import java.util.List;

public class OrderInfo {
    private String orderNumber;
    private List<OrderDetail> orderDetails;

    public OrderInfo(String orderNumber, List<OrderDetail> orderDetails) {
        this.orderNumber = orderNumber;
        this.orderDetails = orderDetails;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public List<OrderDetail> getOrderDetails() {
        return orderDetails;
    }
}