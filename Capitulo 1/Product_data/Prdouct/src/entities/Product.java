package entities;

public class Product {
    
   private String name;
   private double price;
   private int quantity;

   

   public Product(String name, double price, int quantity) {
    this.name = name;
    this.price = price;
    this.quantity = quantity;
}

public Product(String name, double price) {
    this.name = name; 
    this.price = price; 
}

    public String getName() {
    return name;
}

    public double getPrice() {
        return price;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String GetName() {
        return name;
    }

    public double TotalValueInStock() {
        return price * quantity;
    }
    
    public void addProducts(int quantity) {
        this.quantity += quantity;
    }
    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }
    public String toString() {
        return "Product data: " + name + ",  $ " + String.format("%.2f", price) + ", " + quantity + " units, total: " + String.format("%.2f", TotalValueInStock()); 
    }

}

