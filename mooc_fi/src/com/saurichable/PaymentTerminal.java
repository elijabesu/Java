package com.saurichable;

public class PaymentTerminal {
    private double money;
    private int affortableMeals;
    private int heartyMeals;
    private double affortableCost;
    private double heartyCost;

    public PaymentTerminal(){
        this.money = 1000;
        this.affortableMeals = 0;
        this.heartyMeals = 0;
        this.affortableCost = 2.5;
        this.heartyCost = 4.3;
    }

    // cash
    public double eatAffordably(double payment){
        if (payment < this.affortableCost){ return payment; }
        this.money += this.affortableCost;
        this.affortableMeals += 1;
        return payment - this.affortableCost;
    }
    public double eatHeartily(double payment){
        if (payment < this.heartyCost){ return payment; }
        this.money += this.heartyCost;
        this.heartyMeals += 1;
        return payment - this.heartyCost;
    }

    // card
    public boolean eatAffordably(PaymentCard card){
        if (card.getBalance() < this.affortableCost){ return false; }
        this.money += this.affortableCost;
        this.affortableMeals += 1;
        card.takeMoney(this.affortableCost);
        return true;
    }
    public boolean eatHeartily(PaymentCard card){
        if (card.getBalance() < this.heartyCost){ return false; }
        this.money += this.heartyCost;
        this.heartyMeals += 1;
        card.takeMoney(this.heartyCost);
        return true;
    }
    public void addMoneyToCard(PaymentCard card, double sum){
        card.addMoney(sum);
    }
    public String toString(){
        return "money: " + this.money + ", number of sold affortable meals: " + this.affortableMeals
                + ", number of sold hearty meals: " + this.heartyMeals;
    }
}
