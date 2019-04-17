package br.ufmg.model;

public class ResponseData {
    private float buy;
    private float high;
    private float last;
    private float low;
    private float sell;
    private float trades_quantity;
    private float volume;
    private String date;

    public float getBuy() {
        return buy;
    }

    public float getHigh() {
        return high;
    }

    public float getLast() {
        return last;
    }

    public float getLow() {
        return low;
    }

    public float getSell() {
        return sell;
    }

    public float getTrades_quantity() {
        return trades_quantity;
    }

    public float getVolume() {
        return volume;
    }

    public String getDate() {
        return date;
    }

    public void setBuy(float buy) {
        this.buy = buy;
    }

    public void setHigh(float high) {
        this.high = high;
    }

    public void setLast(float last) {
        this.last = last;
    }

    public void setLow(float low) {
        this.low = low;
    }

    public void setSell(float sell) {
        this.sell = sell;
    }

    public void setTrades_quantity(float trades_quantity) {
        this.trades_quantity = trades_quantity;
    }

    public void setVolume(float volume) {
        this.volume = volume;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
