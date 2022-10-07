package entities;

public class Fisica extends Contribuinte {
    private Double gastosComSaude;

    public Fisica() {
        super();
    }

    public Fisica(String nome, Double rendaAnual, Double gastosComSaude) {
        super(nome, rendaAnual);
        this.gastosComSaude = gastosComSaude;
    }

    public Double getGastosComSaude() {
        return gastosComSaude;
    }

    public void setGastosComSaude(Double gastosComSaude) {
        this.gastosComSaude = gastosComSaude;
    }

    public Double tax() {
        if (getRendaAnual() < 20000) {
            return (getRendaAnual() * 0.15) - (this.gastosComSaude * 0.50);
        } else {
            return (getRendaAnual() * 0.25) - (this.gastosComSaude* 0.50);
        }
        


    }

    
    @Override
    public String toString() {
        return getNome() + ", " + tax();
    }
    


}
