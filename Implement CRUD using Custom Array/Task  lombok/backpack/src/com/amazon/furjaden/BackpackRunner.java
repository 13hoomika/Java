package com.amazon.furjaden;

import com.amazon.furjaden.backpack.Backpack;

public class BackpackRunner {
    public static void main(String[] args) {
        Backpack backpack = new Backpack();
        backpack.setId(1);
        backpack.setBrand("Fur Jarden");
        backpack.setCareInstructions("Hand Wash Only");
        backpack.setCountryOfOrigin("India");

        System.out.println("The backpack ID is: " + backpack.getId());
        System.out.println("The backpack Brand is: " + backpack.getBrand());
        System.out.println("The backpack Care Instructions are: " + backpack.getCareInstructions());
        System.out.println("The backpack Country Origin is: " + backpack.getCountryOfOrigin());
    }
}
