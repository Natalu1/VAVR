import io.vavr.collection.List;

public class Customer {

    private String fullName;

    private List<Order> order;

    public Customer(String fullName, List<Order> order) {
        this.fullName = fullName;
        this.order = order;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public List<Order> getOrder() {
        return order;
    }

    public void setOrder(List<Order> order) {
        this.order = order;
    }
}
