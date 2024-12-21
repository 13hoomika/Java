package com.xworkz.sportsclub;

import com.xworkz.sportsclub.cricket.Cricket;
import com.xworkz.sportsclub.sports.Sports;

public class MainRunner {
    public static void main(String[] args) {
        System.out.println("Main started");
        Sports sp = new Cricket();
        sp.Info("RCB",11);
        System.out.println("Main ended");
    }
}
