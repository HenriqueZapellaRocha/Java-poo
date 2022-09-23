package application;
import java.util.Scanner;
import entities.Triangle;
public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       Triangle x, y;

       x = new Triangle();
        y = new Triangle();

        double area1, area2 = 0;

        System.out.println("Enter the measures of triangle x: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("Enter the measures of triangle y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        area1 = x.area();
        area2 = y.area();

        System.out.print("Traingle x area: " + String.format("%.4f%n", area1));
        System.out.print("Triangle y area: " + String.format("%.4f%n", area2));

        if (area1 > area2) {
            System.out.print("\nLarger area is x");
        } else {
            System.out.print("\nLarger area is y");
        }

    }
}
