package entitites;
import java.time.LocalDateTime;
import entitites.nums.OrderStatus;
import java.util.ArrayList;
import java.util.List;

public class Order {
    
private LocalDateTime moment;
private OrderStatus status;



private Client client;
List<OrderItem> listOrder = new ArrayList<>();


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

public void orderAdd( OrderItem orderItem) {
listOrder.add(orderItem); 
}


public List<OrderItem> getListOrder() {
    return listOrder;
}

public double total() {
  double total = 0;

  for(OrderItem c : listOrder ) {
    total = total + (c.getQuantity() * c.getProduct().getPrice());
    
}

return total;
}














}
