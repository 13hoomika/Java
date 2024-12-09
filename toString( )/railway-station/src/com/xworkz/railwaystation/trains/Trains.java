package com.xworkz.railwaystation.trains;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Trains {

    private int trainId;
    private String trainName;
    private String departedStation;
    private String arrivalStation;
    private String departedTime;
    private String arrivalTime;

    protected void setTrainId(int trainId) {
        this.trainId = trainId;
    }

    @Override
    public String toString(){
        return "Train ( id = " + this.trainId + ", " +
                "TrainName = " + this.trainName +
                "Arrival station = " + this.arrivalStation + ", " +
                "DepartedStation = " + this.departedStation + ", " +
                "DepartedTime = " + this.departedTime + ")";
    }

    @Override
    public int hashCode() {
        return trainId;
    }

    @Override
    public boolean equals(Object obj) {
        Trains trains = (Trains) obj;
        if (this.hashCode() == trains.hashCode())
            return true;
        return false;
    }
}
