package application;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



import entities.Employee;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Employee> list = new ArrayList<>();

        System.out.println("How many employeees will be registered? ");
        int n = sc.nextInt();

        System.out.println();

        for (int i = 0; i < n; i++) {
            System.out.printf("\nEmployee #%d\n", (i+1));
            System.out.print("Id: ");
            Integer Id = sc.nextInt();
            System.out.print("Name: ");
            sc.nextLine();
            String Name = sc.nextLine();
            System.out.println("Salary: ");
            Double Salary = sc.nextDouble();

            Employee emp = new Employee(Id, Name, Salary);

            list.add(emp);
        }

        System.out.print("Enter employeee id will have salary increase: ");
        int id = sc.nextInt();
        Integer pos = HasId(list, id);

            if(pos == null) {
                System.out.println("This id does not exist!");
            }
                else {
                    System.out.print("Enter the percentage increasy: ");
                    Double percentage = sc.nextDouble();

                    list.get(pos).IncreasySalary(percentage);
                }


                System.out.println();
                System.out.println("List of employees: ");
                
                for (Employee emp : list) {
                    System.out.println(emp);
                }




        sc.close();
    }
    
    public static Integer HasId(List<Employee> list, int id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                return i;
            }
        }
        return null;

    }


}
