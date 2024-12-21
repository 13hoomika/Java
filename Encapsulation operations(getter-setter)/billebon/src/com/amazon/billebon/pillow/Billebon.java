package com.amazon.billebon.pillow;

public class Billebon {
    private int id;
    private String brand;
    private String specialFeature;
    private String size;

    public Billebon() {
        System.out.println("Default constructors invoked");
    }

    //setter

    public void setId(int id) {
        this.id = id;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setSpecialFeature(String specialFeature) {
        this.specialFeature = specialFeature;
    }

    public void setSize(String size) {
        this.size = size;
    }

    //getter
    public int getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public String getSpecialFeature() {
        return specialFeature;
    }

    public String getSize() {
        return size;
    }
}
