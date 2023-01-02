import io.vavr.collection.List;
import io.vavr.collection.Set;

public class CustomerService {
    private static final Order ORDER_1 = new Order("123",50);
    private static final Order ORDER_2 = new Order("234",150);
    private static final Order ORDER_3 = new Order("345",20);
    private static final Order ORDER_4 = new Order("456",580);
    private static final Order ORDER_5 = new Order("567",98);
    private static final Order ORDER_6 = new Order("679",1700);

    private static final List<Customer> CUSTOMERS = List.of(
            new Customer("John Smith", List.of(ORDER_1, ORDER_2)),
            new Customer("Jane Smith", List.of(ORDER_3, ORDER_4)),
            new Customer("Jack Sparrow", List.of(ORDER_5, ORDER_6)),
            new Customer("Harry Potter", List.empty()));

    public Set<Customer> getAllCustomerSet(){
        return CUSTOMERS.toSet();
    }
    public List<Customer> getAllCustomerByFullName(String fullName){
        return CUSTOMERS.filter(customer -> customer.getFullName().equals(fullName));
    }
    public List<String> getAllCustomerFullNames(){
        return CUSTOMERS.map(customer -> customer.getFullName());
    }
    public List<Order> getAllOrderByCustomerFullName(String fullName){
        return getAllCustomerByFullName(fullName).flatMap(customer -> customer.getOrder());

//        return CUSTOMERS.filter(customer -> customer.getFullName().equals(fullName))
//                .flatMap(customer -> customer.getOrder());

    }
}
