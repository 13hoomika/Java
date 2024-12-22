package com.amazon.furjaden;

import com.amazon.furjaden.backpack.Backpack;

public class BackpackRunner {
    public static void main(String[] args) {
        Backpack backpack = new Backpack();
        backpack.setId(1);
        backpack.setBrand("Fur Jarden");
        backpack.setCareInstructions("Hand Wash Only");
        backpack.setCountryOfOrigin("India");

        Backpack backpack1 = new Backpack();
        backpack1.setId(1);
        backpack1.setBrand("Fur Jarden");
        backpack1.setCareInstructions("Hand Wash Only");
        backpack1.setCountryOfOrigin("India");

        System.out.println(backpack);
        System.out.println("backpack: "+backpack.hashCode());
        System.out.println("backpack1: "+backpack.hashCode());

        boolean same = backpack.equals(backpack1);
        System.out.println(same);

    }
}
