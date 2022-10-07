package entities;

public class Juridica extends Contribuinte {
    private Integer numeroDeFuncionarios;

    public Juridica() {
        super();
    }

    public Juridica(String nome, Double rendaAnual, Integer numeroDeFuncionarios) {
        super(nome, rendaAnual);
        this.numeroDeFuncionarios = numeroDeFuncionarios;
    }

    public  Double tax() {
       if (numeroDeFuncionarios > 10) {
        return getRendaAnual() * 0.14;
       } else {
        return getRendaAnual() * 0.16;
       }
    }

    @Override
    public String toString() {
        return "Juridica [numeroDeFuncionarios=" + numeroDeFuncionarios + "]";
    }

    

}
