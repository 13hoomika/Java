package com.xworkz.furnitureapp;
import com.xworkz.furnitureapp.furnitures.Furniture;

public class MainRunner {
        public static void main(String[] args) {
            System.out.println("Main started");
            Furniture furn  = new Furniture();
            furn.Details(12,378.99);
            System.out.println("Main ended");
    }
}
