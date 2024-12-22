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

        Tablets t = new Tablets();
        t.setId(9);
        t.setBrand("Samsung");
        t.setModelName("Galaxy Tab A9+");
        t.setStorage("128 GB");
        t.setPrice(20999.00);

        System.out.println(tablets);

        System.out.println("obj1: "+tablets.hashCode());
        System.out.println("obj2: "+t.hashCode());

        boolean same = tablets.equals(t);
        System.out.println(same);
    }
}
