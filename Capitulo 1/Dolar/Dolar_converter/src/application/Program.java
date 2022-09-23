package application;
import java.util.Scanner;
import util.CurrencConverter;
public class Program {

    public static void main(String[] args) {

Scanner sc = new Scanner(System.in);

System.out.print("What is the dollar price: ");
double Dollar = sc.nextDouble();
System.out.print("How many dollar: ");
double Many = sc.nextDouble();

double d = CurrencConverter.Converter(Many, Dollar);

System.out.print("Amount paid in reais = " + d );




    }






}