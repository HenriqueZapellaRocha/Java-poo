

import java.util.Scanner;
public class main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a , b , c , a1, b1 , c1 ;

        double p, p1, area1, area2 = 0;

        System.out.println("Enter the measures of triangle x: ");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        System.out.println("Enter the measures of triangle y: ");
        a1 = sc.nextDouble();
        b1 = sc.nextDouble();
        c1 = sc.nextDouble();

        p = (a+b+c) / 2;
        area1 = Math.sqrt((p*(p-a))*((p-b))*(p-c));
        p1 = (a1+b1+c1) / 2;
        area2 = Math.sqrt((p1*(p1-a1))*((p1-b1))*(p1-c1));

        System.out.print("Traingle x area: " + String.format("%.4f", area1) + "\n");
        System.out.print("Triangle y area: " + String.format("%.4f", area2));

        if (area1 > area2) {
            System.out.print("\nLarger area is x");
        } else {
            System.out.print("\nLarger area is y");
        }

    }


}
