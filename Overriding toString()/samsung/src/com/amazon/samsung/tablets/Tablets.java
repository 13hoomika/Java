package com.amazon.samsung.tablets;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class Tablets {
    private int id;
    private String brand;
    private String ModelName;
    private String storage;
    private double price;

    @Override
    public String toString(){
        return "Cctv(id: " +this.id +","+" brand: "+this.brand+","+" ModelName: "+this.ModelName+","+" storage: "+this.storage+","+" price: "+ this.price +")";
    }
}
