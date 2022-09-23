package entities;

public class Trabalhadores {
    private int id;
    private String nome; 
    private double salario;

    public Trabalhadores(Integer id, String nome, Double salario) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
    }

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Double getSalario() {
        return salario;
    }

    public void IncreasySalary(percentage) {
        
    }

    @Override
    public String toString() {
        return "Trabalhadores [id=" + id + ", nome=" + nome + ", salario=" + salario + "]";
    }

    
    

    
    


}
