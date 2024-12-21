package com.xworkz.laptopapp;

import com.xworkz.laptopapp.hp.HP;
import com.xworkz.laptopapp.laptop.Laptop;

public class MainRunner {
        public static void main(String[] args) {
            System.out.println("Main started");
            Laptop lp = new HP();
            lp.LaptopDetails("HP Victus",62000.50);
            System.out.println("Main ended");
        }

}
