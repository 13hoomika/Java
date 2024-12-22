package com.amazon.samsung.tablets;

public class Tablets {
    private int id;
    private String brand;
    private String ModelName;
    private String storage;
    private double price;

    public Tablets() {
        System.out.println("Default constructor is invoked!!");
    }

    //setter
    public void setId(int id) {
        this.id = id;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModelName(String modelName) {
        ModelName = modelName;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

    //getter
    public double getPrice() {
        return price;
    }

    public String getBrand() {
        return brand;
    }

    public int getId() {
        return id;
    }

    public String getModelName() {
        return ModelName;
    }

    public String getStorage() {
        return storage;
    }
}
