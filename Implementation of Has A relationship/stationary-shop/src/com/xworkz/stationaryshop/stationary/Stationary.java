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

    public void getDetails(){
        System.out.println("Item Id: " + item.getItemId());
        System.out.println("Item Name: " + item.getItemName());
        System.out.println("Item Brand: " + item.getBrand());
        System.out.println("Item Color: " + item.getColour());
        System.out.println("Item Price in Rs: " + item.getPrice());
    }
}
