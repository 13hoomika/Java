package com.amazon.delinza.drone;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class Drone {
    private int id;
    private String brand;
    private String ageRange;
    private double price;

    @Override
    public String toString(){
        return "Drone(id: " +this.id +","+" brand: "+this.brand+","+" ageRange: "+this.ageRange+","+" price: "+ this.price +")";
    }
}