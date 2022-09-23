package entities;

import entities.enums.WorkerLevel;
import java.util.List;
import java.util.ArrayList;

public class Worker {

    private String name;
    private WorkerLevel level;
    private Double baseSalary;

    private Department department;
    List<HourContract> contracts  = new ArrayList<>();
    
    public Worker() {
    }

    public Worker(String name, WorkerLevel level, Double baseSalary, Department department) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public void setLevel(WorkerLevel level) {
        this.level = level;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartmentName(Department departmentName) {
        this.department = departmentName;
    }

    public List<HourContract> getContracts() {
        return contracts;
    }

   
    public void addContracts(HourContract contract) {
        contracts.add(contract);
    }

    public void removeContracts(HourContract contract) {
        contracts.remove(contract);
    }

    public Double income(Integer year, Integer month) {
        Double sum = baseSalary;
        for (HourContract c : contracts) {
            if (c.getDate().getYear() == year && c.getDate().getMonthValue() == month) {
               sum += c.totalValue();
            }
        }
        return sum;
    }
    
}
