import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Create a customer
        Customer customer = new Customer("FadilAdz", "Bekasi");

        // Create an item
        Item PS5 = new Item("PS5");

        // Order Date
        SimpleDateFormat od = new SimpleDateFormat("yyyy-MM-dd");
        Date orderDate = new Date();

        // Create an order
        Order order = new Order(PS5, orderDate, "Offline");

        // Payments
        Payment cashPayment = new Cash(9700000);
        Payment checkPayment = new Check(9700000, "1234567891011");
        Payment creditPayment = new Credit(9700000, "2024-12-03");

        // Output
        System.out.println("Customer\n" + customer);
        System.out.println("\nOrder\n" + order);
        System.out.println("\nPayments");
        System.out.println(cashPayment);
        System.out.println(checkPayment);
        System.out.println(creditPayment);
    }
}