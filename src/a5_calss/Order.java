package a5_calss;

import java.util.Date;

public class Order {
    // 1. 필드
    long orderId; // 주문번호 : 숫자형가능 이 경우 long이 주로 사용됨
    String userEmail; // 주문자
    String productId; // 주문제품
    Date oderDate; // 주문일
    double totalAmount; // 주문수량

    // 2. 생성자

    public Order() {
    }

    public Order(long orderId, String userEmail, String productId, Date oderDate, double totalAmount) {
        this.orderId = orderId;
        this.userEmail = userEmail;
        this.productId = productId;
        this.oderDate = oderDate;
        this.totalAmount = totalAmount;
    }
    // 3. 메서드
    // 주문수량 입력
    public double setTotalAmonunt(double newAmount) {
        this.totalAmount = newAmount;
        return this.totalAmount;

    }
}


