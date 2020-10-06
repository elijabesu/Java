package com.saurichable;

public class Money {
    // /final/ makes it so that the values cannot be modified after they have been set in the constructor
    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {
        this.euros = euros;
        this.cents = cents;
    }
    public int getEuros() { return this.euros; }
    public int getCents() { return this.cents; }

    public String toString() {
        if (this.cents < 10) { return this.euros + ".0" + this.cents + " Euro"; }
        return this.euros + "." + this.cents + " Euro";
    }

    public Money plus(Money money){
        int euros = this.euros + money.euros;
        int cents = this.cents + money.cents;
        while (cents >= 100) {
            euros += 1;
            cents -= 100;
        }
        return new Money(euros, cents);
    }
    public Money minus(Money money) {
        int euros = this.euros - money.euros;
        int cents = this.cents - money.cents;
        while (cents < 0) {
            euros -= 1;
            cents = 100 + cents;
        }
        if (euros < 0) { return new Money(0,0); }
        else if (euros == 0) {
            if (cents <= 0) { return new Money(0,0); }
            else { return new Money(0, cents); }
        } else { return new Money(euros, cents); }
    }
    public boolean lessThan(Money compared) {
        if (this.euros < compared.euros) { return true; }
        if (this.euros == compared.euros) {
            if (this.cents < compared.cents) { return true; }
            return false;
        }
        return false;
    }
}
