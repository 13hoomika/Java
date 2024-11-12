package com.xworkz.furnitureapp.furnitures;

public class Furniture {
    private int id;
    private double price;

    public Furniture() {
        System.out.println("Default constructor is invoked!!..");
    }
    public void Details(int id, double price){
        this.id = id;
        this.price = price;
        System.out.println("Table Id: "+this.id);
        System.out.println("Table price: "+this.price);
    }

}
