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

        System.out.println(curtainLights);
    }
}
