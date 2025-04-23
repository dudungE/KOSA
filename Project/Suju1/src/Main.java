import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // 회원정보 입력(id, 이름, 주소, 번호, 특별회원여부)
        // 상품 주문 목록 입력
        // 창고 조회
        //

        // 상품 생성 - 아이템 종류 정하기 - 인벤토리 수 확인
        // 다형성 이용해서 아이템 넣기
        Product product1 = new Product("P001", "Keyboard", 30000);
        Product product2 = new Product("P002", "Mouse", 15000);

        // 수주명세 생성 - 특별회원 시 추가 할인
        OrderDetail detail1 = new OrderDetail();
        detail1.registerOrderDetail(new OrderDetailInfo(2, 0.1, product1)); // 수량 2, 10% 할인

        OrderDetail detail2 = new OrderDetail();
        detail2.registerOrderDetail(new OrderDetailInfo(1, 0.0, product2)); // 수량 1, 할인 없음

        // 수주정보 생성
        List<OrderDetail> details = new ArrayList<>();
        details.add(detail1);
        details.add(detail2);
        System.out.println("details");
        for (OrderDetail od : details) {
            System.out.println(od);
        }

        OrderInfo orderInfo = new OrderInfo("ORD123", details);

        // 주문 UI 시뮬레이션
        OrderReceptionUI ui = new OrderReceptionUI();
        ui.inputOrder(orderInfo);
        ui.registerOrder(orderInfo);
        ui.cancelOrder(orderInfo.getOrderNumber()); // 테스트용 취소도 출력
    }
}
