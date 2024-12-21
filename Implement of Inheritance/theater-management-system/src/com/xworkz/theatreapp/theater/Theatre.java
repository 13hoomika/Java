package com.xworkz.theatreapp.theater;

public class Theatre {

    public Theatre() {
        System.out.println("Theatre default constructor is invoked");
    }

    public void showDetails(String name, String location, int capacity) {
        System.out.println("Theatre Name: " + name);

        if (location != null && !location.isEmpty()) {
            System.out.println("Location: " + location);
        } else {
            System.out.println("Location is not specified.");
        }

        if (capacity > 0) {
            System.out.println("Capacity: " + capacity);
        } else {
            System.out.println("Invalid capacity specified.");
        }
    }
}

