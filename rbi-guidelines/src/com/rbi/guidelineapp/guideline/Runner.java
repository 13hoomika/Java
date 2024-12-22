package com.rbi.guidelineapp.guideline;

import com.rbi.guidelineapp.guideline.banks.AxisBangalore;
import com.rbi.guidelineapp.guideline.banks.HdfcBank;
import com.rbi.guidelineapp.guideline.banks.KotakBangalore;
import com.rbi.guidelineapp.guideline.banks.KotakBank;

public class Runner {
    public static void main(String[] args) {
        // abstraction & polymorphism
        //interfaceType ref = new cLassName();
        RBIGuidelines bank1 = new KotakBangalore();
        bank1.knowYourCustomer();
        bank1.notification();

        KotakBank ref = new KotakBangalore();
        ref.savingAcc811();

//  We can not create object/instantiate for abstract method & interface.
        // To instantiate an abstract method -> extend class to another
//        RBIGuidelines bank2 = new AxisBangalore();
//        bank2.aadhaarNumberLinkage();

        //We can not instantiate interface class.
        //RBIGuidelines rbi = new UnionBank();

    }

}
