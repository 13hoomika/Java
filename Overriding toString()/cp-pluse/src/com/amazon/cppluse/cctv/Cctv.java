package com.amazon.cppluse.cctv;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class Cctv {
    private int id;
    private String brand;
    private String modelName;
    private String connectivityTechnology;

    @Override
    public String toString(){
        return "Cctv(id: " +this.id +","+" brand: "+this.brand+","+" modelName: "+this.modelName+","+" connectivityTechnology: "+ this.connectivityTechnology +")";
    }
}