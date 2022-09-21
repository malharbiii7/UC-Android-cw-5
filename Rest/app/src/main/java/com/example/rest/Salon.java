package com.example.rest;

import java.io.Serializable;

public class Salon implements Serializable {

    private String salonName;
    private double salonPrice;
    private int salonImg;

    public Salon(String salonName, double salonPrice, int salonImg) {
        this.salonName = salonName;
        this.salonPrice = salonPrice;
        this.salonImg = salonImg;
    }

    public String getSalonName() {
        return salonName;
    }

    public void setSalonName(String salonName) {
        this.salonName = salonName;
    }

    public double getSalonPrice() {
        return salonPrice;
    }

    public void setSalonPrice(double salonPrice) {
        this.salonPrice = salonPrice;
    }

    public int getSalonImg() {
        return salonImg;
    }

    public void setSalonImg(int salonImg) {
        this.salonImg = salonImg;
    }
}
