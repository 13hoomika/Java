package com.amazon.elitty.eyeliner;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class Eyeliner {
    private int id;
    private String brand;
    private String finishType;

    @Override
    public String toString(){
        return "Eyeliner(id: " +this.id +","+" brand: "+this.brand+","+" finishType: "+this.finishType+")";
    }

    @Override
    public int hashCode() {
        return this.id;
    }

    @Override
    public boolean equals(Object obj) {
        Eyeliner e = (Eyeliner) obj;
        return this.hashCode() == e.hashCode();
    }
}
