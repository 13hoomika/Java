package com.amazon.portronics.extensionboard;

public class Portronics {
    private int id;
    private String brand;
    private int totalPowerOutlets;
    private String voltage;

    public Portronics() {
        System.out.println("Default constructors invoked");
    }

    // setter
    public void setId(int id) {
        this.id = id;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setTotalPowerOutlets(int totalPowerOutlets) {
        this.totalPowerOutlets = totalPowerOutlets;
    }

    public void setVoltage(String voltage) {
        this.voltage = voltage;
    }
    // getter

    public int getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public int getTotalPowerOutlets() {
        return totalPowerOutlets;
    }

    public String getVoltage() {
        return voltage;
    }
}
