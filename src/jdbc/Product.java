package jdbc;

public class Product {

    private int productId; // 제품번호
    private String productName; // 제품이름
    private String packingUnit; // 포장단위
    private double price; // 단가
    private int stock; // 재고

    public Product() {
    }

    public Product(int productId, String productName, String packingUnit, double price, int stock) {
        this.productId = productId;
        this.productName = productName;
        this.packingUnit = packingUnit;
        this.price = price;
        this.stock = stock;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getPackingUnit() {
        return packingUnit;
    }

    public void setPackingUnit(String packingUnit) {
        this.packingUnit = packingUnit;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", packingUnit='" + packingUnit + '\'' +
                ", price=" + price +
                ", stock=" + stock +
                '}';
    }
}
