package com.xworkz.apolloapp.hospital;

public class Hospital {
    public Hospital() {
        System.out.println("Hospital default constructor is invoked");
    }

    public void Patents(String name, String location, int beds) {
        System.out.println("Hospital Name: " + name);

        if (location != null) {
            System.out.println("Location: " + location);
        } else {
            System.out.println("Location is not specified.");
        }

        if (beds > 0) {
            System.out.println("Total beds: " + beds);
        } else {
            System.out.println("Bed capacity can not be zero ");
        }

    }

}
