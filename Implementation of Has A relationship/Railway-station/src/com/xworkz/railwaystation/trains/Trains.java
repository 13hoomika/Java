package com.xworkz.railwaystation.trains;

public class Trains {

    private int trainId;
    private String TrainName;
    private String DepartedStation;
    private String ArrivalStation;
    private String departedTime;
    private String ArrivalTime;

    public void setTrainId(int trainId) {
        this.trainId = trainId;
    }

    public void setTrainName(String trainName) {
        TrainName = trainName;
    }

    public void setArrivalStation(String arrivalStation) {
        ArrivalStation = arrivalStation;
    }

    public void setArrivalTime(String arrivalTime) {
        ArrivalTime = arrivalTime;
    }

    public void setDepartedStation(String departedStation) {
        DepartedStation = departedStation;
    }

    public void setDepartedTime(String departedTime) {
        this.departedTime = departedTime;
    }

    public int getTrainId() {
        return trainId;
    }

    public String getArrivalStation() {
        return ArrivalStation;
    }

    public String getArrivalTime() {
        return ArrivalTime;
    }

    public String getDepartedStation() {
        return DepartedStation;
    }

    public String getDepartedTime() {
        return departedTime;
    }

    public String getTrainName() {
        return TrainName;
    }

}
