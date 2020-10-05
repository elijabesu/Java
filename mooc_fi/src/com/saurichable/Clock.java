package com.saurichable;

public class Clock {
    private CounterLimitedFromTop hours;
    private CounterLimitedFromTop minutes;
    private CounterLimitedFromTop seconds;

    public Clock(){
        this.hours = new CounterLimitedFromTop(24);
        this.minutes = new CounterLimitedFromTop(60);
        this.seconds = new CounterLimitedFromTop(60);
    }

    public void advance(){
        this.seconds.advance();
        if (this.seconds.getValue() == 0){
            this.minutes.advance();
            if (this.minutes.getValue() == 0){
                this.hours.advance();
            }
        }
    }

    public String toString(){
        return hours + ":" + minutes + ":" + seconds;
    }
}
