package application;
import entitites.Client;
import entitites.Order;
import entitites.OrderItem;
import entitites.Product;
import entitites.nums.OrderStatus;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;



import java.util.List;


public class Program {
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter client data: ");
    System.out.print("Name: ");
    String name = sc.nextLine();
    System.out.print("Email: ");
    String email = sc.nextLine();
    System.out.print("Birth date dd/mm/yyyy: ");
    String birthDate = sc.nextLine();
    System.out.println("Enter order status: ");
    String orderStatus = sc.nextLine();

    Order order = new Order(LocalDateTime.now(),OrderStatus.valueOf(orderStatus), new Client(name, email, birthDate));
    
    System.out.println();

    
    System.out.println("How many items to this order: ");
    int ordersQauntity = sc.nextInt();
    
        for (int i = 1; i <= ordersQauntity; i++) {

            System.out.println("Enter #" + i + " data:");
            System.out.print("Product name: ");
            sc.nextLine();
            name = sc.nextLine();
            System.out.print("Product price: ");
            Double price = sc.nextDouble();
            System.out.print("Quantity: ");
            int quantity = sc.nextInt();

            OrderItem orderItem = new OrderItem(quantity, new Product(name, price));

          order.orderAdd(orderItem);
     
            System.out.println();
            System.out.println(orderItem);

        }

        


        System.out.println("Order summary: ");
        System.out.println("Order date: "+ order.getMoment());
        System.out.println("Client name: " + order.getClient().getName() + order.getClient().getEmail() + "-" + order.getClient().getBirthDate());
        System.out.println("Order item: ");

        

        
            System.out.print(.getProduct().getName() + " " + c.getProduct().getPrice() + " " + c.getQuantity());

        

        System.out.println();
        System.out.println(order.total());



}


}