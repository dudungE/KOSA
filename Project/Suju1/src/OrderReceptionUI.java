public class OrderReceptionUI {
    public void inputOrder(OrderInfo orderInfo) {
        System.out.println("Order input received for: " + orderInfo.getOrderNumber());
    }

    public void registerOrder(OrderInfo orderInfo) {
        Order order = new Order();
        order.registerOrder(orderInfo);
    }

    public void cancelOrder(String orderNumber) {
        // 실제 구현 시 DB에서 삭제 또는 상태 변경
        System.out.println("Order " + orderNumber + " cancelled.");
    }
}
