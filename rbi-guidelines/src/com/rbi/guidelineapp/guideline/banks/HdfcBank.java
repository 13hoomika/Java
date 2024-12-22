package com.rbi.guidelineapp.guideline.banks;

import com.rbi.guidelineapp.guideline.RBIGuidelines;

public class HdfcBank implements RBIGuidelines {

    @Override
    public void serviceCharge() {
        System.out.println("Hdfc Bank follow Service Charges guidelines by RBI");
    }

    @Override
    public void knowYourCustomer() {
        System.out.println("Hdfc Bank follow KYC guidelines by RBI");
    }

    @Override
    public void aadhaarNumberLinkage() {
        System.out.println("Hdfc Bank follow Aadhaar number linkage guidelines by RBI");
    }

    @Override
    public void SwissBank() {

    }
}
