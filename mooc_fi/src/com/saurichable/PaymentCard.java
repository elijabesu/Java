package com.saurichable;

public class PaymentCard {
    private double balance;

    public PaymentCard(double balance){
        this.balance = balance;
    }

    public double getBalance(){ return this.balance; }
    public void addMoney(double increase){
        if (increase > 0) {
            this.balance += increase;
        }
    }
    public boolean takeMoney(double decrease){
        if (this.balance >= decrease) {
            if (decrease > 0) {
                this.balance -= decrease;
                return true;
            }
            return false;
        }
        return false;
    }
}
