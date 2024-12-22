package com.xwrokz.ecommerce.customer;

public class Customer {
    private int customerId;
    private String name;
    private long phno;
    private String email;
    private int pincode;



    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public void setPhno(long phno) {
        this.phno = phno;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }

    public String getName() {
        return name;
    }

    public int getCustomerId() {
        return customerId;
    }

    public int getPincode() {
        return pincode;
    }

    public long getPhno() {
        return phno;
    }

    public String getEmail() {
        return email;
    }
}
