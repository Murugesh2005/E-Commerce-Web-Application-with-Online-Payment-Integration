import java.util.Random;
import java.util.Scanner;

public class MyShopBackend {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("----- MyShop Order Processing -----");

        // Customer Details
        System.out.print("Enter Customer Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Email: ");
        String email = sc.nextLine();

        System.out.print("Enter Address: ");
        String address = sc.nextLine();

        // Product Price
        System.out.print("Enter Product Price: ");
        double price = sc.nextDouble();

        // GST Calculation (18%)
        double gst = price * 0.18;
        double totalAmount = price + gst;

        // Generate Transaction ID
        Random random = new Random();
        String transactionId = "TXN" + (100000 + random.nextInt(900000));

        // Display Order Confirmation
        System.out.println("\n----- Payment Successful -----");
        System.out.println("Customer Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Total Amount (incl. GST): ₹" + totalAmount);
        System.out.println("Transaction ID: " + transactionId);
        System.out.println("Order Confirmed Successfully!");

        sc.close();
    }
}
