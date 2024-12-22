package com.amazon.gesto.ledlights;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class CurtainLights {
    private int id;
    private String brand;
    private String usage;
    private String specialFeature;
    private String occasion;
    private double price;

    @Override
    public String toString(){
        return "CurtainLights(id: " +this.id +","+" brand: "+this.brand+","+" usage: "+this.usage+","+" specialFeature: "+ this.specialFeature+","+" occasion: "+this.occasion+","+" price: "+ this.price +")";
    }
}
