package entitites;
import java.time.LocalDateTime;
import entitites.nums.OrderStatus;
import java.util.ArrayList;
import java.util.List;

public class Order {
    
private LocalDateTime moment;
private OrderStatus status;


private Client client;
List<OrderItem> orderitem = new ArrayList<>();


public Order() {
}

public Order(LocalDateTime moment, OrderStatus status, Client client) {
    this.moment = moment;
    this.status = status;
    this.client = client;
    
}

public LocalDateTime getMoment() {
    return moment;
}

public void setMoment(LocalDateTime moment) {
    this.moment = moment;
}

public OrderStatus getStatus() {
    return status;
}

public void setStatus(OrderStatus status) {
    this.status = status;
}

public Client getClient() {
    return client;
}

public void setClient(Client client) {
    this.client = client;
}

public List<OrderItem> getOrderitem() {
    return orderitem;
}

public Double total() {
  Double precoTotal = 0.0;
    for (OrderItem order : orderitem) {
        precoTotal += order.getPrice();
    }
    return precoTotal;
}






}
