package com.xworkz.theatreapp;

import com.xworkz.theatreapp.pvr.Pvr;

public class TheaterRunner {
     public static void main(String[] args) {
            Pvr pvr = new Pvr();
            pvr.showDetails("PVR","Bengaluru",100);
        }
}
