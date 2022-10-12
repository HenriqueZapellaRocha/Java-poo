package model.entitities;

import javax.security.auth.login.AccountException;

public class Account {

private Integer number;
private String holder;
private Double balance;
private Double withdrawLimit;


public Account() {
}


public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
    this.number = number;
    this.holder = holder;
    this.balance = balance;
    this.withdrawLimit = withdrawLimit;
}


public Integer getNumber() {
    return number;
}


public void setNumber(Integer number) {
    this.number = number;
}


public String getHolder() {
    return holder;
}


public void setHolder(String holder) {
    this.holder = holder;
}


public Double getBalance() {
    return balance;
}


public void setBalance(Double balance) {
    this.balance = balance;
}


public Double getWithdrawLimit() {
    return withdrawLimit;
}


public void setWithdrawLimit(Double withdrawLimit) {
    this.withdrawLimit = withdrawLimit;
}

public void withdraw(Double amount) throws AccountException {
    if (amount > this.balance) {
   throw new AccountException("The amount excedes your balance");
    } else if (amount > this.withdrawLimit) {
    throw new AccountException("the amount is higher than your withdraw limit");
    }
    this.balance -= amount;
}




}