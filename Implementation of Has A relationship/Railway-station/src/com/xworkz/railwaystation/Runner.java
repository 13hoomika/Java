package com.xworkz.railwaystation;

import com.xworkz.railwaystation.station.Station;
import com.xworkz.railwaystation.trains.Trains;

public class Runner {
    public static void main(String[] args) {
        Station station = new Station();

        Trains t = new Trains();
        t.setTrainId(12);
        t.setTrainName("Rajdhani Express");
        t.setDepartedStation("Bengaluru City (SBC)");
        t.setArrivalStation("Hazrat Nizamuddin (NZM)");
        t.setDepartedTime("12:15 PM");
        t.setArrivalTime("05:00 PM");

        station.addTrains(t);
        station.getDetails();
    }
}
