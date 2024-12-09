package com.xworkz.stationaryshop.stationary;

import com.xworkz.stationaryshop.items.Item;

public class Stationary {
    Item item;
    public boolean addItem(Item item){
        boolean isAdded = false;

        if (item != null){
            if (item.getItemId() > 0 && item.getItemName() != null){
                this.item = item;
                isAdded = true;
            }else System.out.println("Error: id and name are empty");
        }else System.out.println("Item can not be empty!!");

     return isAdded;
    }
}
