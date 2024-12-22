package com.goodfirms.realestateapp;

public class MainRunner {
    public static void main(String[] args) {

        CommercialSpace space = new Pharma();
        int ref = space.business();
        System.out.println(ref);

    }
}
