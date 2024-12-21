package com.xwrokz.ecommerce;

import com.xwrokz.ecommerce.customer.Customer;
import com.xwrokz.ecommerce.flipkart.Flipkart;

public class Runner {
    public static void main(String[] args) {
        Flipkart flipkart = new Flipkart();

        Customer customer = new Customer();
        customer.setCustomerId(123);
        customer.setName("Bhoomika");
        customer.setPhno(9986542103L);
        customer.setEmail("bhoomika@gmail.com");
        customer.setPincode(570023);

        flipkart.addCustomers(customer);
        flipkart.updateCustomerEmail("bcp1@gmail.com");
        flipkart.deleteCustomerDetails();
        flipkart.getDetails();


    }
}
