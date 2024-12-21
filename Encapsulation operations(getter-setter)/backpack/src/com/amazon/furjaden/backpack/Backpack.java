package com.amazon.furjaden.backpack;

public class Backpack {
    private int id;
    private String brand;
    private String careInstructions;
    private String countryofOrigin;

    public Backpack() {
        System.out.println("Default constructors invoked!!");
    }
//setter
    public void setId(int id) {
        this.id = id;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setCareInstructions(String careInstructions) {
        this.careInstructions = careInstructions;
    }

    public void setCountryofOrigin(String countryofOrigin) {
        this.countryofOrigin = countryofOrigin;
    }
//getter
    public int getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public String getCareInstructions() {
        return careInstructions;
    }

    public String getCountryofOrigin() {
        return countryofOrigin;
    }
}
