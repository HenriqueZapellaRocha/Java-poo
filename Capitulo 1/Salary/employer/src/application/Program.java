package application;
import entities.Employee;
import java.util.Scanner;



public class Program {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Employee guy = new Employee();
        double percentage;

        System.out.println("Enter with the emplyer data: ");
        System.out.print("Name: ");
        guy.name = sc.nextLine();
        System.out.print("Groos salary: ");
        guy.GroosSalary = sc.nextDouble();
        System.out.print("Tax: ");
        guy.Tax = sc.nextDouble();


        System.out.print("Employee: " + guy.name + ", $ " + guy.NetSalary());
        System.out.println();

        System.out.println("Wich percentage to increase salary? ");
         percentage = sc.nextDouble();
        guy.AddSalary(percentage);

        System.out.println("Updated data: " + guy);






        sc.close();
    }


}
