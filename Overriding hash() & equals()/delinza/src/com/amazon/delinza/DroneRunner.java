package com.amazon.delinza;

import com.amazon.delinza.drone.Drone;

public class DroneRunner {
    public static void main(String[] args) {
        Drone drone = new Drone();
        drone.setId(5);
        drone.setBrand("Delinza");
        drone.setAgeRange("Adult");
        drone.setPrice(8499.99);

        Drone d2 = new Drone();
        d2.setId(5);
        d2.setBrand("Delinza");
        d2.setAgeRange("Adult");
        d2.setPrice(8499.99);


        System.out.println(drone);

        System.out.println("drone: "+drone.hashCode());
        System.out.println("drone1: "+d2.hashCode());

        boolean same = drone.equals(d2);
        System.out.println(same);
    }
}
