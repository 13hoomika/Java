package com.xworkz.stationaryshop;

import com.xworkz.stationaryshop.items.Item;
import com.xworkz.stationaryshop.stationary.Stationary;

public class Runner {
    public static void main(String[] args) {
        Stationary stationary = new Stationary();

        Item item = new Item();
        item.setItemId(1);
        item.setItemName("lighter Pouch Pack ");
        item.setBrand("Flair");
        item.setColour("Multicolor");
        item.setPrice(125.25);

        Item item1 = new Item();
        item1.setItemId(1);
        item1.setItemName("lighter Pouch Pack ");
        item1.setBrand("Flair");
        item1.setColour("Multicolor");
        item1.setPrice(125.25);

        System.out.println(item);
        System.out.println(item1);

        System.out.println(item.hashCode());
        System.out.println(item1.hashCode());

        boolean isSame = item.equals(item1);
        System.out.println(isSame);


    }
}
