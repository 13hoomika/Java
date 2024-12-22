package com.amazon.billebon.pillow;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class Billebon {
    private int id;
    private String brand;
    private String specialFeature;
    private String size;

    @Override
    public String toString(){
        return "Billebon(id: " +this.id +","+" brand: "+this.brand+","+" specialFeature: "+this.specialFeature+","+" size: "+ this.size +")";
    }

    @Override
    public int hashCode() {
        return this.id;
    }

    @Override
    public boolean equals(Object obj) {
        Billebon billebon = (Billebon) obj;
        return this.hashCode() == billebon.hashCode();
    }

}
