package com.xworkz.laptopapp.laptop;

public class Laptop {
    private String name;
    private double amount;


    public Laptop() {
        System.out.println("Laptop's Default Constructor is invoked!!");
    }

    public void LaptopDetails(String name,double amount){
        this.amount = amount;
        this.name = name;
        System.out.println("Name of laptop: "+this.name);
        System.out.println("Amount of laptop: "+this.amount);
    }
}
