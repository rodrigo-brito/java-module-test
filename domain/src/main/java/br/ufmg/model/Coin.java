package br.ufmg.model;

import java.util.Date;

public class Coin {
    private String tick;
    private Date time;
    private double price;

    public String getTick() {
        return tick;
    }

    public void setTick(String tick) {
        this.tick = tick;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String toString() {
        return String.format("[%s] %s = %.2f", this.getTime(), this.getTick(), this.getPrice());
    }
}
