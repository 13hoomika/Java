package com.xworkz.electronicsapp.electronics;

public class ElectronicGadget {
    private double cost;

    public ElectronicGadget() {
        System.out.println("ElectronicGadget Default constructor invoked!!");
    }
    public void getInfo(double cost) {
        this.cost = cost;
        System.out.println("Cost is: " + this.cost);
    }
}
