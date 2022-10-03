package entitites;

public class OrderItem {

private int quantity;



private Product product;


public OrderItem() {
}


public OrderItem(int quantity, Product product) {
    this.quantity = quantity;
    this.product = product;
}


public int getQuantity() {
    return quantity;
}


public Product getProduct() {
    return product;
}


public void setProduct(Product product) {
    this.product = product;
}




}