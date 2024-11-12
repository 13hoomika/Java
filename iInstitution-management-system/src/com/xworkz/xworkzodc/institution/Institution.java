package com.xworkz.xworkzodc.institution;

public class Institution {
    private String batchCode;
    private int noOfTrainee;

    public Institution() {
        System.out.println("Institute default constructor");
    }
    public void Details(String batchCode,int noOfTrainee){
        this.batchCode = batchCode;
        this.noOfTrainee = noOfTrainee;
        System.out.println("Batch No: " + batchCode);
        System.out.println("Number of Trainee: " + noOfTrainee);
    }

}
