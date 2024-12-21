package com.amazon.delinza.drone;

public class Drone {
    private int id;
    private String brand;
    private String ageRange;
    private double price;

    public Drone() {
        System.out.println("Default constructors invoked");
    }

    //setter

    public void setId(int id) {
        this.id = id;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setAgeRange(String ageRange) {
        this.ageRange = ageRange;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    //getter

    public int getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public String getAgeRange() {
        return ageRange;
    }

    public double getPrice() {
        return price;
    }
}
