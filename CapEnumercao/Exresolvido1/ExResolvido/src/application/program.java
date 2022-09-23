package application;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;


public class program {
    public static void main(String[] args) throws ParseException {

        Scanner sc = new Scanner(System.in);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");



        System.out.print("Enter with deparment name: ");
        String name = sc.nextLine();
        System.out.println("Enter worker data: ");
        System.out.print("Name: ");
        String workerName = sc.nextLine();
        System.out.print("Worker level: ");
        String workerLevel = sc.nextLine();
        System.out.print("Base salary: ");
        double workerBaseSalary = sc.nextDouble();

        

        
        
        Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), workerBaseSalary, new Department(name));
            

        System.out.println("How many contracts to this worker: ");
        int n = sc.nextInt();

        for (int i = 1; i <=n; i++) {

            System.out.print("Ano e mes do contrato: ");
            String date = sc.next();
            LocalDate dataTransformada = LocalDate.parse(date, formatter);
            System.out.print("Whats is the value per hour: ");
            Double valuePerHour = sc.nextDouble();
            System.out.print("Duration in hours: ");
            Integer hours = sc.nextInt();

            HourContract contract = new HourContract(dataTransformada, valuePerHour, hours);
            worker.addContracts(contract);
        }

        System.out.println();

        System.out.print("Month and year of the contract: MM/yyyy ");
        sc.nextLine();
        String contractDate = sc.next();

        Integer month = Integer.parseInt(contractDate.substring(0, 2));
        Integer year = Integer.parseInt(contractDate.substring(3));

        System.out.println(month);
        System.out.println(year);

        Double income = worker.income(year, month);

        System.out.println();
        System.out.println();


        System.out.print("Name: " + worker.getName()+ "\n");
        System.out.println("Worker level: "+ worker.getLevel());
        System.out.print("Department: \n" + worker.getDepartment().getName()+ "\n");
        System.out.println("Income for " + contractDate + ": " + income);
        sc.close();
    }
    
}
