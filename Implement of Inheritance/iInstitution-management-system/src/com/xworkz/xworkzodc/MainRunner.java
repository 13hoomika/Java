package com.xworkz.xworkzodc;

import com.xworkz.xworkzodc.institution.Institution;
import com.xworkz.xworkzodc.xworkz.Xworkz;

public class MainRunner {
    public static void main(String[] args) {
        System.out.println("Main started");
        Institution ins = new Xworkz();
        ins.Details("GO19ROM",9);
        System.out.println("Main ended");
    }

}
