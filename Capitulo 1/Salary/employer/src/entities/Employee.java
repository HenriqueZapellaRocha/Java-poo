package entities;

public class Employee {

    public String name;
    public double GroosSalary;
    public double Tax;
    double perc = 100;
    public double NetSalary() {
        return GroosSalary - Tax;
    }
    public void AddSalary(double percentage) {
        GroosSalary += GroosSalary * percentage / 100.0;
     }
     public String toString() {
         return "Updated data : " + name + ", $ " + NetSalary(); 
 
     }
}
