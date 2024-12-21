package com.amazon.samsung;

import com.amazon.samsung.tablets.Tablets;

public class TabletsRunner {
    public static void main(String[] args) {
        Tablets tablets = new Tablets();
        tablets.setId(9);
        tablets.setBrand("Samsung");
        tablets.setModelName("Galaxy Tab A9+");
        tablets.setStorage("128 GB");
        tablets.setPrice(20999.00);

        System.out.println("Tablet id: " + tablets.getId());
        System.out.println("Tablet brand: " + tablets.getBrand());
        System.out.println("Tablet model name: " + tablets.getModelName());
        System.out.println("Tablet memory storage: " + tablets.getStorage());
        System.out.println("Tablet price: " + tablets.getPrice());
    }
}
