package com.xworkz.hotelapp.hotel;

public class Hotel {
    private String name;
    private String type;

    public Hotel() {
        System.out.println("Hotel default constructor invoked!!");
    }

    public void HotelInfo(String name, String type){
        this.name = name;
        this.type = type;
        System.out.println("Hotel Name: "+this.name);
        System.out.println("Type of Hotel: "+this.type);
    }

}
