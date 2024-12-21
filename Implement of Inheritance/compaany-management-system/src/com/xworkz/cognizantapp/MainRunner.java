package com.xworkz.cognizantapp;

import com.xworkz.cognizantapp.cognizant.Cognizant;
import com.xworkz.cognizantapp.company.Company;

public class MainRunner {
    public static void main(String[] args) {
        System.out.println("Main started");
        Company com = new Cognizant();
        com.companyInfo("Cognizant");
        System.out.println("Main ended");
    }
}