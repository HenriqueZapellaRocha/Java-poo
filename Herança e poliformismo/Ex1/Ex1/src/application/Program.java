package application;
import java.util.Scanner;
import entitites.Employee;
import entitites.OutscorcedEmployee;
import java.util.List;
import java.util.ArrayList;


public class Program {
    public static void main(String[] args) {
        
    
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the number of employees: ");
    int n = sc.nextInt();


    List<Employee> employee = new ArrayList<>();


    for(int i =1; i <=n; i++){
        System.out.println("Employee #" + i + " data:");
        System.out.print("Outscored? ");
        sc.nextLine();
        String outscored = sc.nextLine();
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Hours: ");
        Integer hours = sc.nextInt();
        System.out.print("Value per hour: ");
        Double valuePerHour = sc.nextDouble();
    
        if(outscored.equals("yes")) {
            System.out.print("Additional charge: ");
            Double additionalCharge = sc.nextDouble();
            employee.add(new OutscorcedEmployee(name, hours, valuePerHour, additionalCharge));
        } else {
            employee.add(new Employee(name, hours, valuePerHour));
        }

        }

    System.out.println("PAYMENTS: ");

    for(Employee c : employee){
        System.out.println(c.getName() + "- $ " + String.format("%.2f", c.payment()));
    }


    


    

        sc.close();
    }
}
