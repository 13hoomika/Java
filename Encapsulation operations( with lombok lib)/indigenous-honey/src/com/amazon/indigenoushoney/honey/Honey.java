package com.amazon.indigenoushoney.honey;

public class Honey {
    private int id;
    private String brand;
    private String flavour;

    public Honey() {
        System.out.println("Default constructors invoked!!");
    }

    //setter

    public void setId(int id) {
        this.id = id;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setFlavour(String flavour) {
        this.flavour = flavour;
    }

    //getter

    public int getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public String getFlavour() {
        return flavour;
    }
}
