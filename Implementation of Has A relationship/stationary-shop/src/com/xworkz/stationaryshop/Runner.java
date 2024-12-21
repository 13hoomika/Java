package com.xworkz.stationaryshop;

import com.xworkz.stationaryshop.items.Item;
import com.xworkz.stationaryshop.stationary.Stationary;

public class Runner {
    public static void main(String[] args) {
        Stationary stationary = new Stationary();

        Item item = new Item();
        item.setItemId(12345);
        item.setItemName("lighter Pouch Pack ");
        item.setBrand("Flair");
        item.setColour("Multicolor");
        item.setPrice(125.25);

        stationary.addItem(item);
        stationary.getDetails();
    }
}
