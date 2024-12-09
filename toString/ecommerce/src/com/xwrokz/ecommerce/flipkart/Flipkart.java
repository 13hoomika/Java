package com.xwrokz.ecommerce.flipkart;

import com.xwrokz.ecommerce.customer.Customer;

public class Flipkart {
    Customer customer;
    public  boolean addCustomers(Customer customer){
        boolean isAdded = false;
        if (customer != null){
            if (customer.getCustomerId() > 0 && customer.getName() != null){
                this.customer = customer;
                isAdded = true;
            }
        }
    return isAdded;
    }

    public void getDetails(){
        System.out.println("Customer id: " + customer.getCustomerId());
        System.out.println("Customer name: " + customer.getName());
        System.out.println("Customer phone number: " + customer.getPhno());
        System.out.println("Customer address: " + customer.getAddress());
        System.out.println("Customer pincode: " + customer.getPincode());
    }
}
