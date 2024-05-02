package com.example.microservices.limitsservice;

public class LimitConfiguraton {

    public int maximum;

    public int getMinimum() {
        return minimum;
    }

    public LimitConfiguraton(int maximum, int minimum) {
        this.maximum = maximum;
        this.minimum = minimum;
    }

    public int getMaximum() {
        return maximum;
    }

    public void setMaximum(int maximum) {
        this.maximum = maximum;
    }

    public void setMinimum(int minimum) {
        this.minimum = minimum;
    }

    public int minimum;

}
