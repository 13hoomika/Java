package com.amazon.portronics.extensionboard;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class Portronics {
    private int id;
    private String brand;
    private int totalPowerOutlets;
    private String voltage;

    @Override
    public String toString(){
        return "Cctv(id: " +this.id +","+" brand: "+this.brand+","+" totalPowerOutlets: "+this.totalPowerOutlets+","+" voltage: "+ this.voltage +")";
    }

    @Override
    public int hashCode() {
        return this.id;
    }

    @Override
    public boolean equals(Object obj) {
        Portronics portronics = (Portronics) obj;
        return this.hashCode() == portronics.hashCode();
    }


}
