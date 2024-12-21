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

        System.out.println("the curtain light id: " + curtainLights.getId());
        System.out.println("the curtain light brand: " + curtainLights.getBrand());
        System.out.println("the curtain light usage: " + curtainLights.getUsage());
        System.out.println("the curtain light occasion: " + curtainLights.getOccasion());
        System.out.println("the curtain light special feature: " + curtainLights.getSpecialFeature());
        System.out.println("the curtain light price: " + curtainLights.getPrice());

    }
}
