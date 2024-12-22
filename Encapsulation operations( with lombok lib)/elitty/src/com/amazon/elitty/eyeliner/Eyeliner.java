package com.amazon.elitty.eyeliner;

public class Eyeliner {
    private int id;
    private String brand;
    private String finishType;

    public Eyeliner() {
        System.out.println("Default constructors invoked");
    }
    //setter

    public void setId(int id) {
        this.id = id;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setFinishType(String finishType) {
        this.finishType = finishType;
    }
    //getter

    public int getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public String getFinishType() {
        return finishType;
    }
}
