package com.amazon.portronics;

import com.amazon.portronics.extensionboard.Portronics;

public class PortronicsRunner {
    public static void main(String[] args) {
        Portronics portronics = new Portronics();
        portronics.setId(5);
        portronics.setBrand("Portronics");
        portronics.setTotalPowerOutlets(4);
        portronics.setVoltage("5 Voltage");

        System.out.println("The extensionboard id: "+portronics.getId());
        System.out.println("The extensionboard brand: "+portronics.getBrand());
        System.out.println("The extensionboard total power outlets: "+portronics.getTotalPowerOutlets());
        System.out.println("The extensionboard voltage: "+portronics.getVoltage());
    }
}
