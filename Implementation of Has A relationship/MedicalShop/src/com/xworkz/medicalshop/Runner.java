package com.xworkz.medicalshop;

import com.xworkz.medicalshop.medical.MedicalShop;
import com.xworkz.medicalshop.medicine.Medicine;

public class Runner {
    public static void main(String[] args) {
        MedicalShop medicalShop = new MedicalShop();
        Medicine medicine = new Medicine();
        medicine.setMedicineId(1234);
        medicine.setName("Cofsils");
        medicine.setBenefit("It provides relief from sore throat caused by bacterial or viral infections");
        medicine.setDosage("One lozenge every 3 hours");
        medicine.setIngredients("2,4-Dichlorobenzyl Alcohol BP, Amylmetacresol BP");
        medicine.setPrice(29.89);

        medicalShop.addMedicine(medicine);
        medicalShop.getDetails();
    }
}
