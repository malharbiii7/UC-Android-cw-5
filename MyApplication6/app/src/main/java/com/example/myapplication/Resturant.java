package com.example.myapplication;

public class Resturant {

    private String mealName;
    private double mealPrice;
    private int mealImg;

    public Resturant(String mealName, double mealPrice, int mealImg) {
        this.mealName = mealName;
        this.mealPrice = mealPrice;
        this.mealImg = mealImg;
    }

    public String getMealName() {
        return mealName;
    }

    public void setMealName(String mealName) {
        this.mealName = mealName;
    }

    public double getMealPrice() {
        return mealPrice;
    }

    public void setMealPrice(double mealPrice) {
        this.mealPrice = mealPrice;
    }

    public int getMealImg() {
        return mealImg;
    }

    public void setMealImg(int mealImg) {
        this.mealImg = mealImg;
    }
}