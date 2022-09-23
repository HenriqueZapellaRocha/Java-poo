package application;
import java.util.Scanner;
import entities.Product;
public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        int n = sc.nextInt();

        Product[] vect = new Product[n];

        for (int i=0; i < vect.length; i++) {
            sc.nextLine();
            String name = sc.nextLine();
            double price = sc.nextDouble();
            vect[i] = new Product(name, price);
        }
        double soma = 0;
        for (int i=0; i < vect.length; i++) {

            soma += vect[i].getPrice();

        }

        soma = soma/n;

        for (int i = 0; i < n; i++)

        System.out.println(vect[i]);

        sc.close();

        System.out.println("Preço medio dos produtos: " + soma);
    }
    
}
