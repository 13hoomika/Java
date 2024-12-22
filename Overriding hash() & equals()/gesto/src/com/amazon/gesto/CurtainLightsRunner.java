package com.amazon.gesto;

import com.amazon.gesto.ledlights.CurtainLights;

public class CurtainLightsRunner {
    public static void main(String[] args) {
        CurtainLights curtainLights = new CurtainLights();
        curtainLights.setId(8);
        curtainLights.setBrand("Gesto");
        curtainLights.setOccasion("Christmas, Wedding, Holiday, festival, restaurants, Home, Hotel, Valentine's Day");
        curtainLights.setUsage("Indoor");
        curtainLights.setSpecialFeature("Heat Resistant");
        curtainLights.setPrice(399.00);

        CurtainLights c = new CurtainLights();
        c.setId(8);
        c.setBrand("Gesto");
        c.setOccasion("Christmas, Wedding, Holiday, festival, restaurants, Home, Hotel, Valentine's Day");
        c.setUsage("Indoor");
        c.setSpecialFeature("Heat Resistant");
        c.setPrice(399.00);

        System.out.println(curtainLights);

        System.out.println("curtainLights: "+curtainLights.hashCode());
        System.out.println("c: "+c.hashCode());

        boolean same = curtainLights.equals(c);
        System.out.println(same);
    }
}
