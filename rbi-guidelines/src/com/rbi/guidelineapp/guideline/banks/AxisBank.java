package com.rbi.guidelineapp.guideline.banks;

import com.rbi.guidelineapp.guideline.RBIGuidelines;

public abstract class AxisBank implements RBIGuidelines {
    @Override
    public void knowYourCustomer(){
        System.out.println("Axis Bank follow KYC guidelines by RBI");
    }
    @Override
    public void aadhaarNumberLinkage(){
        System.out.println("Axis Bank follow Aadhaar number linkage guidelines by RBI");
    }

}
