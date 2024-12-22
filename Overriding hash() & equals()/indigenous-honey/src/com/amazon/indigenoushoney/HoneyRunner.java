package com.amazon.indigenoushoney;

import com.amazon.indigenoushoney.honey.Honey;

public class HoneyRunner {
    public static void main(String[] args) {
        Honey honey = new Honey();
        honey.setId(7);
        honey.setBrand("Indigenous Honey");
        honey.setFlavour("Wild Honey");

        Honey h = new Honey();
        h.setId(7);
        h.setBrand("Indigenous Honey");
        h.setFlavour("Wild Honey");

        System.out.println(honey);

        System.out.println("honey: "+honey.hashCode());
        System.out.println("h: "+h.hashCode());

        boolean same = honey.equals(h);
        System.out.println(same);
    }

}
