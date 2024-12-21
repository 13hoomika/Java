package com.xworkz.hotelapp;

import com.xworkz.hotelapp.hotel.Hotel;

public class MainRunner {
    public static void main(String[] args) {
        System.out.println("Main started");
        Hotel h = new Hotel();
        h.HotelInfo("Radisson Blu","Veg & Non-Veg");

        System.out.println("Main Ended");
    }

}
