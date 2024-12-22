package com.amazon.indigenoushoney;

import com.amazon.indigenoushoney.honey.Honey;

public class HoneyRunner {
    public static void main(String[] args) {
        Honey honey = new Honey();
        honey.setId(7);
        honey.setBrand("Indigenous Honey");
        honey.setFlavour("Wild Honey");

        System.out.println("The Honey Id: " + honey.getId());
        System.out.println("The Honey Brand: " + honey.getBrand());
        System.out.println("The Honey Flavour: " + honey.getFlavour());
    }

}
