package com.xwrokz.ecommerce.flipkart;

import com.xwrokz.ecommerce.customer.Customer;

public class Flipkart {
    //Has-A-relationship(Composition / Association / ) -> one class dependent on another class / reference with another class
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
        System.out.println("Customer email: " + customer.getEmail());
        System.out.println("Customer pincode: " + customer.getPincode());
    }

    public boolean updateCustomerEmail(String updatedEmail){
        boolean isUpdated = false;
        if (updatedEmail != null){
            customer.setEmail(updatedEmail);
            isUpdated = true;
        }
        return isUpdated;
    }

    public boolean deleteCustomerDetails(){
        boolean isDeleted = false;
        if (customer != null){
            customer = null;
            isDeleted = true;
            System.out.println("customer details deleted");
        }
        return isDeleted;
    }
}
