public class Order {

    private String orderNumber;

    private Integer totalPrice;

    public Order(String orderNumber, Integer totalPrice) {
        this.orderNumber = orderNumber;
        this.totalPrice = totalPrice;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public Integer getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Integer totalPrice) {
        this.totalPrice = totalPrice;
    }
}
