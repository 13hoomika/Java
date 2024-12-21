package com.xworkz.runtimepolyapp;

import com.xworkz.runtimepolyapp.child.Child;
import com.xworkz.runtimepolyapp.parent.Parent;

public class ParentChildRunner {
    public static void main(String[] args) {
        //parent ref = new child() --> overriding
        Parent parent = new Child(); //object is created at runtime
        parent.business(); // invokes child class
    }
}
