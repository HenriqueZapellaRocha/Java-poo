package entitties;

public class Emplyee {
    
    private Integer id;
    private String name;
    private double salary;


    public Emplyee(Integer id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }


    public Integer getId() {
        return id;
    }


    public void setId(Integer id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public double getSalary() {
        return salary;
    }


    public void SalaryIncrease(double Percentage) {
        this.salary += salary * (Percentage / 100); 
    }
    


    
    

}
