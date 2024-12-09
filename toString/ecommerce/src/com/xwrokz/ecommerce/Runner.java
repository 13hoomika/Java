package com.xwrokz.ecommerce;

import com.xwrokz.ecommerce.customer.Customer;
import com.xwrokz.ecommerce.flipkart.Flipkart;

public class Runner {
    public static void main(String[] args) {
        Flipkart flipkart = new Flipkart();

        Customer customer = new Customer();
//        System.out.println(customer.toString());
        customer.setCustomerId(1);
        customer.setName("Bhoomika");
        customer.setPhno(9986542103L);
        customer.setAddress("Kuvempunagar 2nd stage, Mysore");
        customer.setPincode(570023);
        System.out.println(customer.hashCode());

        Customer customer1 = new Customer();
//        System.out.println(customer1.toString());
        customer1.setCustomerId(1);
        customer1.setName("Bhoomika");
        customer1.setPhno(9986542103L);
        customer1.setAddress("Kuvempunagar 2nd stage, Mysore");
        customer1.setPincode(570023);
        System.out.println(customer1.hashCode());


        //flipkart.addCustomers(customer);
        // flipkart.getDetails();

        System.out.println(customer);
        System.out.println(customer1);

        boolean areSame = customer.equals(customer1);
        System.out.println(areSame);

    }
}
