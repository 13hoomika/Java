package com.amazon.billebon;

import com.amazon.billebon.pillow.Billebon;

public class BillebonRunner {
    public static void main(String[] args) {
        Billebon billebon = new Billebon();
        billebon.setId(2);
        billebon.setBrand("Billebon");
        billebon.setSpecialFeature("neck support");
        billebon.setSize("Standard");

        System.out.println(billebon);

    }

}
