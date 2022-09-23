package entities;

public class Employee {
    
    private Integer Id;
    private String Name;
    private Double Salary;


    public Employee(Integer id, String name, Double salary) {
        Id = id;
        Name = name;
        Salary = salary;
    }



    public Integer getId() {
        return Id;
    }
    public void setId(Integer id) {
        Id = id;
    }
    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }
    public Double getSalary() {
        return Salary;
    }
  

    public void IncreasySalary(Double percentage) {
        this.Salary += Salary * (percentage/100);

    }
    

   
    public String toString() {
        return  Id + ", " + Name + ", " + Salary;
    }


    

}
