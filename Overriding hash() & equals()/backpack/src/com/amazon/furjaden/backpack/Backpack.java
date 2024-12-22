package com.amazon.furjaden.backpack;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class Backpack {
    private int id;
    private String brand;
    private String careInstructions;
    private String countryOfOrigin;

    @Override
    public String toString(){
        return "Backpack(id: " +this.id+" brand: "+this.brand+" careInstructions: "+this.careInstructions+" countryOfOrigin: " + this.countryOfOrigin +")";
    }

    @Override
    public int hashCode() {
        return this.id;
    }

    @Override
    public boolean equals(Object obj) {
        Backpack backpack = (Backpack) obj;
        return this.hashCode() == backpack.hashCode();
    }

}
