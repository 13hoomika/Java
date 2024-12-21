package com.amazon.cppluse.cctv;

public class Cctv {
    private int id;
    private String brand;
    private String modelName;
    private String connectivityTechnology;

    public Cctv() {
        System.out.println("Default constructors invoked");
    }

    //setter
    public void setId(int id) {
        this.id = id;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public void setConnectivityTechnology(String connectivityTechnology) {
        this.connectivityTechnology = connectivityTechnology;
    }

    //getter
    public int getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public String getModelName() {
        return modelName;
    }

    public String getConnectivityTechnology() {
        return connectivityTechnology;
    }
}
