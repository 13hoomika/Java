package com.xworkz.stationaryshop.items;

public class Item {
    private int itemId;
    private String itemName;
    private String brand;
    private String colour;
    private double price;

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
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

    public int getItemId() {
        return itemId;
    }

    public String getBrand() {
        return brand;
    }

    public String getItemName() {
        return itemName;
    }

    public String getColour() {
        return colour;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public int hashCode() {
        return itemId;
    }

    @Override
    public boolean equals(Object obj) {
        Item item = (Item) obj;
        if (this.hashCode() == item.hashCode()) return true;
        return false;
    }
}

