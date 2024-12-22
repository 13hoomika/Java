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

        AlarmClock a = new AlarmClock();
        a.setId(10);
        a.setBrand("One94Store");
        a.setColour("Copper");
        a.setStyle("Vintage");
        a.setShape("round");
        a.setDisplayType("Analog");
        a.setPowerSource("Battery Powered");
        a.setPrice(299.00);

        System.out.println(alarmClock);

        System.out.println("alarmClock: "+alarmClock.hashCode());
        System.out.println("a: "+a.hashCode());

        boolean same = alarmClock.equals(a);
        System.out.println(same);
    }
}
