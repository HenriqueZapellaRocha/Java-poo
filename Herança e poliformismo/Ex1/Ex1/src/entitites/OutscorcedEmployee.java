package entitites;

public class OutscorcedEmployee extends Employee {
    

private Double additionalCharge;



public OutscorcedEmployee() {
}


public OutscorcedEmployee(String name, Integer hours, Double valuePerHour, Double additionalCharge) {
    super(name, hours, valuePerHour);
    this.additionalCharge = additionalCharge;
}


public Double getAdditionalCharge() {
    return additionalCharge;
}


public void setAdditionalCharge(Double additionalCharge) {
    this.additionalCharge = additionalCharge;
}

@Override
public Double payment() {
    return super.payment() + (this.additionalCharge * 1.10);
}




}
