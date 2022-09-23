package entities;

public class Count {
    
private String name;
private double saldo;
private double numero;


public Count(String name, double numero) {
    this.name = name;
    this.numero = numero;
}



public Count(String name, double saldo, double numero) {
    this.name = name;
     AddSaldo(saldo);
    this.numero = numero;
}


public String getName() {
    return name;
}


public void setName(String name) {
    this.name = name;
}


public double getSaldo() {
    return saldo;
}


public double getNumero() {
    return numero;
}

public void AddSaldo(double deposito) {
  this.saldo += deposito;
}

public void LessSaldo(double saque) {
    this.saldo -= saque + 5;
}

public String toString() {
    return "Count name= " + name + ", numero= " + numero + ", saldo= " + saldo;
}





}
