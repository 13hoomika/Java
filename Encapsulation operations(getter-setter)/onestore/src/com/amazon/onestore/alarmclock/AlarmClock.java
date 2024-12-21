package com.amazon.onestore.alarmclock;

public class AlarmClock {
    private int id;
    private String brand;
    private String colour;
    private String displayType;
    private String style;
    private String powerSource;
    private String shape;
    private double price;

    public AlarmClock() {
        System.out.println("Default constructor invoked!!");
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setDisplayType(String displayType) {
        this.displayType = displayType;
    }

    public void setPowerSource(String powerSource) {
        this.powerSource = powerSource;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public int getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public String getColour() {
        return colour;
    }

    public String getDisplayType() {
        return displayType;
    }

    public String getPowerSource() {
        return powerSource;
    }

    public String getShape() {
        return shape;
    }

    public String getStyle() {
        return style;
    }

    public double getPrice() {
        return price;
    }
}

