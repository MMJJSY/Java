package jdbc;

public class OrderDetail {

    private String orderId; // 주문번호
    private int productId; // 제품번호
    private double price; // 단가
    private int orderQuantity; // 주문수량
    private double discountRate; // 할인율

    public OrderDetail() {
    }

    public OrderDetail(String orderId, int productId, double price, int orderQuantity, double discountRate) {
        this.orderId = orderId;
        this.productId = productId;
        this.price = price;
        this.orderQuantity = orderQuantity;
        this.discountRate = discountRate;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getOrderQuantity() {
        return orderQuantity;
    }

    public void setOrderQuantity(int orderQuantity) {
        this.orderQuantity = orderQuantity;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }

    @Override
    public String toString() {
        return "OrderDetail{" +
                "orderId='" + orderId + '\'' +
                ", productId=" + productId +
                ", price=" + price +
                ", orderQuantity=" + orderQuantity +
                ", discountRate=" + discountRate +
                '}';
    }
}

