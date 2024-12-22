package com.xworkz.medicalshop.medical;

import com.xworkz.medicalshop.medicine.Medicine;

public class MedicalShop {
    Medicine medicine;
    public boolean addMedicine(Medicine medicine){
        boolean isAdded = false;
        if (medicine != null){
            if (medicine.getMedicineId() > 0 && medicine.getName() != null){
                this.medicine = medicine;
                isAdded = true;
            }else System.out.println("Error: Empty fields");
        }else System.out.println("Medicine details can not be Empty!");
    return isAdded;
    }

    public void getDetails(){
        System.out.println("Medicine Id: " + medicine.getMedicineId());
        System.out.println("Medicine Name: " + medicine.getName());
        System.out.println("Medicine : " + medicine.getBenefit());
        System.out.println("Medicine Id: " + medicine.getDosage());
        System.out.println("Medicine Id: " + medicine.getIngredients());
        System.out.println("Medicine Id: " + medicine.getPrice());
    }
}
