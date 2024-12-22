package com.amazon.elitty;

import com.amazon.elitty.eyeliner.Eyeliner;

public class EyelinerRunner {
    public static void main(String[] args) {
        Eyeliner eyeliner = new Eyeliner();
        eyeliner.setId(6);
        eyeliner.setBrand("Elitty");
        eyeliner.setFinishType("Matte");

        System.out.println("The Eyeliner id is: " + eyeliner.getId());
        System.out.println("The Eyeliner brand is: " +eyeliner.getBrand());
        System.out.println("The Eyeliner finish type is: " +eyeliner.getFinishType());
    }
}
