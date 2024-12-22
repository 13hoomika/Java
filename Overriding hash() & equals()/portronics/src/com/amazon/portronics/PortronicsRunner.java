package com.amazon.portronics;

import com.amazon.portronics.extensionboard.Portronics;

public class PortronicsRunner {
    public static void main(String[] args) {
        Portronics portronics = new Portronics();
        portronics.setId(4);
        portronics.setBrand("Portronics");
        portronics.setTotalPowerOutlets(4);
        portronics.setVoltage("5 Voltage");

        Portronics p = new Portronics();
        p.setId(4);
        p.setBrand("Portronics");
        p.setTotalPowerOutlets(4);
        p.setVoltage("5 Voltage");

        System.out.println(portronics);

        System.out.println("obj1: "+portronics.hashCode());
        System.out.println("obj2: "+p.hashCode());

        boolean same = portronics.equals(p);
        System.out.println(same);
    }
}
