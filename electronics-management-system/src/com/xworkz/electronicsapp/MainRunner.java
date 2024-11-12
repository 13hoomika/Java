package com.xworkz.electronicsapp;

import com.xworkz.electronicsapp.electronics.ElectronicGadget;
import com.xworkz.electronicsapp.headset.HeadSet;

public class MainRunner {

        public static void main(String[] args) {
            System.out.println("Main started");
            ElectronicGadget eg = new HeadSet();
            eg.getInfo(2999.00);
            System.out.println("Main ended");
        }
}
