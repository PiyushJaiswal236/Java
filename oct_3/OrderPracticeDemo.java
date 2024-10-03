package oct_3;

import java.util.Scanner;

//Create an abstract class “order” having members id,description and add abstract method show().
// Create two subclasses “Purchase Order” and “Sales Order” having members Vendor name and customer name   respectively.
// Define methods accept and display in all cases. Create 3 objects each of Purchase Order and Sales Order and accept and display details
public class OrderPracticeDemo {
    public static void main(String[] args) {
        PurchaseOrder p1 = new PurchaseOrder();
        SalesOrder s1 = new SalesOrder();

        p1.accept();
        s1.accept();
        p1.show();
        s1.show();


    }
}
abstract  class  order{
    protected int id;
    protected String description;
    abstract void show();
}
class PurchaseOrder extends order{
    private  String customer,vendor;

    void accept(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Purchase Order ID: ");
        id = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter Description: ");
        description = scanner.nextLine();
        System.out.print("Enter Vendor Name: ");
        vendor = scanner.nextLine();
    }
    @Override
    void show() {
        System.out.println("Purchase Order ID: " + id);
        System.out.println("Description: " + description);
        System.out.println("Vendor Name: " + vendor);
    }
}
class SalesOrder extends order {
    String customerName;

    void accept() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Sales Order ID: ");
        id = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter Description: ");
        description = scanner.nextLine();
        System.out.print("Enter Customer Name: ");
        customerName = scanner.nextLine();
    }

    @Override
    void show() {
        System.out.println("Sales Order ID: " + id);
        System.out.println("Description: " + description);
        System.out.println("Customer Name: " + customerName);
    }
}
