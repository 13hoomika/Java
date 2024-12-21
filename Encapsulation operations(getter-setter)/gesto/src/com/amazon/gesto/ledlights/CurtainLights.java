package com.amazon.gesto.ledlights;

public class CurtainLights {
    private int id;
    private String brand;
    private String usage;
    private String specialFeature;
    private String occasion;
    private double price;

    public CurtainLights() {
        System.out.println("Default constructor invoked here!!");
    }

    //setter

    public void setId(int id) {
        this.id = id;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setSpecialFeature(String specialFeature) {
        this.specialFeature = specialFeature;
    }

    public void setOccasion(String occasion) {
        this.occasion = occasion;
    }

    public void setUsage(String usage) {
        this.usage = usage;
    }

    //getter

    public int getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }

    public String getSpecialFeature() {
        return specialFeature;
    }

    public String getOccasion() {
        return occasion;
    }

    public String getUsage() {
        return usage;
    }
}
