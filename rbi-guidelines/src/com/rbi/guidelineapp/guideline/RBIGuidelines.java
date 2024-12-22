package com.rbi.guidelineapp.guideline;

public interface RBIGuidelines extends SwissBank,WorlBank {
    // Abstract methods & by default they are public
    void knowYourCustomer();
    void serviceCharge();
    void aadhaarNumberLinkage();

    public default void notification(){
        System.out.println("default method");
    }
//    public static void notification(){
//        System.out.println("static method");
//    }
}
