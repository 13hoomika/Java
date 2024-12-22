package com.amazon.delinza;

import com.amazon.delinza.drone.Drone;

public class DroneRunner {
    public static void main(String[] args) {
        Drone drone = new Drone();
        drone.setId(5);
        drone.setBrand("Delinza");
        drone.setAgeRange("Adult");
        drone.setPrice(8499.99);

        System.out.println("The drone Id: " + drone.getId());
        System.out.println("The drone Brand: " + drone.getBrand());
        System.out.println("The drone Age Range: " + drone.getAgeRange());
        System.out.println("The drone Price: " + drone.getPrice());
    }
}
