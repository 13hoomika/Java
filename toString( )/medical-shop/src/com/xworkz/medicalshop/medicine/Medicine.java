package com.xworkz.medicalshop.medicine;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Medicine {
    private int medicineId;
    private String name;
    private String benefit;
    private String  ingredients;
    private String  dosage;
    private double price;

    @Override
    public String toString(){
        return "Medicine ( id = " + this.medicineId + ", " +
                "name = " + name + ", " +
                "benefit = "+this.benefit +", " +
                "ingredients = "+this.ingredients + ", "  +
                "dosage = "+this.dosage +", " +
                "price = "+this.price + ")";
    }

    @Override
    public int hashCode(){
        return medicineId;
    }

    @Override
    public boolean equals(Object obj){
        Medicine medicine = (Medicine) obj;
        if(this.hashCode() == medicine.hashCode())
            return true;
        return false;
    }
}
