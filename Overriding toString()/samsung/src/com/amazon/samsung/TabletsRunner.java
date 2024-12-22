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

        System.out.println(tablets);
    }
}
