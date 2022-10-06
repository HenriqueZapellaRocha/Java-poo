package entities;

public class ImportedProduct extends Product {
    
    private Double customFee;

    public ImportedProduct() {
    
    }

    public ImportedProduct(String name, Double price, Double customFee) {
        super(name, price);
        this.customFee = customFee;
    }

    public Double getCustomFee() {
        return customFee;
    }

    public void setCustomFee(Double customFee) {
        this.customFee = customFee;
    }

    
    public Double totalPrice() {
        Double totalPrice = getPrice();
       return totalPrice += this.customFee;
    }

    @Override
    public String toString() {
        return getName() + ", " + totalPrice() +  "(Customs fee: " + customFee + ")"; 
    }

    




}
