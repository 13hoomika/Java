package com.amazon.indigenoushoney.honey;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class Honey {
    private int id;
    private String brand;
    private String flavour;

    @Override
    public String toString(){
        return "Honey(id: " +this.id +","+" brand: "+this.brand+","+" modelName: "+this.flavour+")";
    }

    @Override
    public int hashCode() {
        return this.id;
    }

    @Override
    public boolean equals(Object obj) {
        Honey h = (Honey) obj;
        return this.hashCode() == h.hashCode();
    }
}
