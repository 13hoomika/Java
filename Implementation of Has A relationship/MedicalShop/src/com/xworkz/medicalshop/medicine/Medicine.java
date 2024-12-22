package com.xworkz.medicalshop.medicine;

public class Medicine {
    private int medicineId;
    private String name;
    private String benefit;
    private String  ingredients;
    private String  dosage;
    private double price;

    public void setPrice(double price) {
        this.price = price;
    }

    public void setBenefit(String benefit) {
        this.benefit = benefit;
    }

    public void setDosage(String dosage) {
        this.dosage = dosage;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public void setMedicineId(int medicineId) {
        this.medicineId = medicineId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public int getMedicineId() {
        return medicineId;
    }

    public String getBenefit() {
        return benefit;
    }

    public String getDosage() {
        return dosage;
    }

    public String getIngredients() {
        return ingredients;
    }

    public String getName() {
        return name;
    }
}
