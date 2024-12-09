package com.xworkz.railwaystation;

import com.xworkz.railwaystation.station.Station;
import com.xworkz.railwaystation.trains.Trains;

public class Runner extends Trains{
    //when accessing protested members extend parent class
    public static void main(String[] args) {
        Station station = new Station();

        Runner t = new Runner();
        t.setTrainId(12);
        t.setTrainName("Rajdhani Express");
        t.setDepartedStation("Bengaluru City (SBC)");
        t.setArrivalStation("Hazrat Nizamuddin (NZM)");
        t.setDepartedTime("12:15 PM");
        t.setArrivalTime("05:00 PM");

        Runner t1 = new Runner();
        t1.setTrainId(12);
        t1.setTrainName("Rajdhani Express");
        t1.setDepartedStation("Bengaluru City (SBC)");
        t1.setArrivalStation("Hazrat Nizamuddin (NZM)");
        t1.setDepartedTime("12:15 PM");
        t1.setArrivalTime("05:00 PM");

//        station.addTrains(t);
//        station.getDetails();

        System.out.println("train1: " + t);
        System.out.println("train2: " +t1);

        System.out.println("train1 hashCode: " + t.hashCode());
        System.out.println("train2 hashCode: " + t1.hashCode());

        boolean isSame = t.equals(t1);
        System.out.println("train1 = train2 : " + isSame);

    }
}
