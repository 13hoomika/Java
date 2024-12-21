package com.xworkz.runtimepolyapp.child;

import com.xworkz.runtimepolyapp.parent.Parent;

public class Child extends Parent {
    public Child() {
        System.out.println("Child cons invokes");
    }

    //in order to override parent class , method signature must be same
    @Override
    public void business(){
        super.business(); // calling parent business()
        System.out.println("invoked business() from Child");
        System.out.println("Software Company");
    }
}
