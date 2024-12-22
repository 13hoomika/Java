package com.amazon.furjaden;

import com.amazon.furjaden.backpack.Backpack;

public class BackpackRunner {
    public static void main(String[] args) {
        Backpack backpack = new Backpack();
        backpack.setId(1);
        backpack.setBrand("Fur Jarden");
        backpack.setCareInstructions("Hand Wash Only");
        backpack.setCountryOfOrigin("India");

        System.out.println(backpack);

    }
}
