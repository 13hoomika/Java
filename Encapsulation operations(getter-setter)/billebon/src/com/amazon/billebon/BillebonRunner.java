package com.amazon.billebon;

import com.amazon.billebon.pillow.Billebon;

public class BillebonRunner {
    public static void main(String[] args) {
        Billebon billebon = new Billebon();
        billebon.setId(2);
        billebon.setBrand("Billebon");
        billebon.setSpecialFeature("portable,portable,portable");
        billebon.setSize("Standard");

        System.out.println("the Neck Pillow ID: " + billebon.getId());
        System.out.println("the Neck Pillow Brand: " + billebon.getBrand());
        System.out.println("the Neck Pillow Special Features: " + billebon.getSpecialFeature());
        System.out.println("the Neck Pillow Size: " + billebon.getSize());
    }

}
