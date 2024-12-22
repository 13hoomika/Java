package com.amazon.billebon;

import com.amazon.billebon.pillow.Billebon;

public class BillebonRunner {
    public static void main(String[] args) {
        Billebon billebon = new Billebon();
        billebon.setId(2);
        billebon.setBrand("Billebon");
        billebon.setSpecialFeature("neck support");
        billebon.setSize("Standard");

        Billebon billebon1 = new Billebon();
        billebon1.setId(2);
        billebon1.setBrand("Billebon");
        billebon1.setSpecialFeature("neck support");
        billebon1.setSize("Standard");

        System.out.println(billebon);

        System.out.println("billebon: "+billebon.hashCode());
        System.out.println("billebon1: "+billebon1.hashCode());

        boolean same = billebon.equals(billebon1);
        System.out.println(same);

    }

}
