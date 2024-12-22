package com.amazon.elitty;

import com.amazon.elitty.eyeliner.Eyeliner;

public class EyelinerRunner {
    public static void main(String[] args) {
        Eyeliner eyeliner = new Eyeliner();
        eyeliner.setId(6);
        eyeliner.setBrand("Elitty");
        eyeliner.setFinishType("Matte");

        Eyeliner e2 = new Eyeliner();
        e2.setId(6);
        e2.setBrand("Elitty");
        e2.setFinishType("Matte");

        System.out.println(eyeliner);

        System.out.println("eyeliner: "+eyeliner.hashCode());
        System.out.println("e2: "+e2.hashCode());

        boolean same = eyeliner.equals(e2);
        System.out.println(same);

    }
}
