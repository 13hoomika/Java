package com.xworkz.runtimepolyapp.parent;

public class Parent {
    public Parent() {
        System.out.println("Parent cons invokes");
    }

    public void business(){
        System.out.println("invoked business() from Parent");
        System.out.println("Import & export");
    }
}

