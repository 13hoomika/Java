package com.amazon.onestore.alarmclock;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class AlarmClock {
    private int id;
    private String brand;
    private String colour;
    private String displayType;
    private String style;
    private String powerSource;
    private String shape;
    private double price;

    @Override
    public String toString(){
        return "Cctv(id: " +this.id +","+" brand: "+this.brand+","+" colour: "+this.colour+","+" displayType: "+ this.displayType +","+" style: "+this.style+","+" powerSource: "+this.powerSource+","+" shape: "+ this.shape+","+" price: "+this.price+")";
    }

    @Override
    public int hashCode() {
        return this.id;
    }

    @Override
    public boolean equals(Object obj) {
        AlarmClock alarmClock = (AlarmClock) obj;
        return this.hashCode() == alarmClock.hashCode();
    }
}

