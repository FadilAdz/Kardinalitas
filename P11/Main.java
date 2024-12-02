import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Example usage
        Customer customer = new Customer();
        customer.setName("Reza Cihuy");
        customer.setAddress("123 Main St");

        Order order = new Order();
        order.setDate(new Date());
        order.setStatus("Pending");

        System.out.println("Customer Name: " + customer.getName());
        System.out.println("Order Status: " + order.getStatus());
    }
}