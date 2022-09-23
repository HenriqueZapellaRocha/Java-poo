package application;
import entities.Product;
import java.util.Scanner;


public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        

        System.out.println("Type the informations: ");
        System.out.print("Product name: ");
        String name  = sc.nextLine();
        System.out.print("Enter the price: ");
        double price = sc.nextDouble();
        Product productt = new Product(name, price);

        productt.setName("computer");
        System.out.println(productt.GetName());
        productt.setPrice(2000);
        System.out.println(productt.getPrice());

        System.out.println();
        System.out.println("Product data: " +productt);
        System.out.print("\nEnter the number of products to be added in stock: ");
        int quantity = sc.nextInt();
        productt.addProducts(quantity);
        System.out.println();
        System.out.println("Updated data: " + productt);

        productt.setName("Computador");
        System.out.println(productt.GetName());
        System.out.print("\nEnter a number of products to be removed from the stock: ");
        quantity = sc.nextInt();
        productt.removeProducts(quantity);
        System.out.println();
        System.out.print("Updated data: " + productt);


        sc.close();
    }


}