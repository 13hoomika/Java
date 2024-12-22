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

        System.out.println(alarmClock);

    }
}
