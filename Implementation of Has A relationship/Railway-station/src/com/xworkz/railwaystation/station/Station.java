package com.xworkz.railwaystation.station;

import com.xworkz.railwaystation.trains.Trains;

public class Station {
    Trains trains;
    public boolean addTrains(Trains trains){
        boolean isAdded = false;

        if (trains != null){
            if ( trains.getTrainId() > 0 &&
                    trains.getArrivalStation() != null
                    && trains.getDepartedStation() != null){
               this.trains = trains;
               isAdded = true;
            }else System.out.println("Error: empty fields not accepted");
        }else System.out.println("trains details can not be empty!");

        return isAdded;
    }

    public void getDetails(){
        System.out.println("Train ID: " + trains.getTrainId());
        System.out.println("Train Name: " + trains.getTrainName());
        System.out.println("Train Name: " + trains.getDepartedStation());
        System.out.println("Train ID: " + trains.getArrivalStation());
        System.out.println("Train ID: " + trains.getDepartedTime());
        System.out.println("Train ID: " + trains.getArrivalTime());
    }
}
