package com.amazon.onestore;

import com.amazon.onestore.alarmclock.AlarmClock;

public class AlarmClockRunner {
    public static void main(String[] args) {
        AlarmClock alarmClock = new AlarmClock();
        alarmClock.setId(10);
        alarmClock.setBrand("One94Store");
        alarmClock.setColour("Copper");
        alarmClock.setStyle("Vintage");
        alarmClock.setShape("round");
        alarmClock.setDisplayType("Analog");
        alarmClock.setPowerSource("Battery Powered");
        alarmClock.setPrice(299.00);

        System.out.println("Clock id: " + alarmClock.getId());
        System.out.println("Clock brand: " + alarmClock.getBrand());
        System.out.println("Clock color: " + alarmClock.getColour());
        System.out.println("Clock display type: " + alarmClock.getDisplayType());
        System.out.println("Clock style: " + alarmClock.getStyle());
        System.out.println("Clock shape: " + alarmClock.getShape());
        System.out.println("Clock power source: " + alarmClock.getPowerSource());
        System.out.println("Clock price: " + alarmClock.getPrice());


    }
}
