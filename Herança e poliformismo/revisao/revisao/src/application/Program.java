package application;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);

        List<Product> product = new ArrayList<>();

    System.out.print("Enter the number of products: ");
    int n = sc.nextInt();

    for (int i = 1; i<=n; i++) {
        System.out.println("Product number #" + i);
        System.out.print("New, used or imported (n/u/i)");
        char chosse = sc. next().charAt(0);
        System.out.print("Name: ");
        sc.nextLine();
        String name = sc.nextLine();
        System.out.print("Price: ");
      
        Double price = sc.nextDouble();
        
        if( chosse == 'n') {
            sc.nextLine();
        product.add(new Product(name, price));

        } else if (chosse == 'i') {
            
            System.out.print("Custom fee: ");
            sc.nextLine();
            Double customFee = sc.nextDouble();
            product.add(new ImportedProduct(name, price, customFee));
        } else {
           
            System.out.print("Manufacture date: ");
            sc.nextLine();
            String manufcatureDate = sc.nextLine();
            product.add(new UsedProduct(name, price, manufcatureDate));
        }

        for (Product pro : product) {
           
            System.out.println(pro.toString());
        }


    }




    }
}
