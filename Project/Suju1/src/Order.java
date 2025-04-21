import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    private String orderNumber;
    private Date orderDate;
    private List<OrderDetail> orderDetails = new ArrayList<>();

    public void registerOrder(OrderInfo info) {
        this.orderNumber = info.getOrderNumber();
        this.orderDate = new Date(); // 현재 시간 기준
        this.orderDetails = info.getOrderDetails();
        System.out.println("Order registered: " + orderNumber);
    }

    public Date getOrderDate() {
        return this.orderDate;
    }
}
