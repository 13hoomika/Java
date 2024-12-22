package com.rbi.guidelineapp.guideline.banks;

import com.rbi.guidelineapp.guideline.RBIGuidelines;

public abstract class KotakBank implements RBIGuidelines{
    // interface
    @Override
    public void knowYourCustomer(){
        System.out.println("Kotak Bank follow KYC guidelines by RBI");
    }
    @Override
    public void serviceCharge() {
        System.out.println("Kotak Bank follow Service Charges guidelines by RBI");
    }
    @Override
    public void aadhaarNumberLinkage() {
        System.out.println("Kotak Bank follow Aadhaar number linkage guidelines by RBI");
    }

    // abstract methods
    public abstract void savingAcc811();

    public void KotakBank(){

    }
}
