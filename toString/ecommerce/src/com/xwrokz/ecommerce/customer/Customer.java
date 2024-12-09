package com.xwrokz.ecommerce.customer;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
//@ToString
public class Customer extends Object {
    private int customerId;
    private String name;
    private long phno;
    private String address;
    private int pincode;

    @Override
    public String toString(){
        return "Customer Info (CustomerId : "+this.customerId+","+
                " name : "+this.name+","+
                " phno : "+this.phno+","+
                " address : "+this.address+","+
                " pincode : "+this.pincode + ")";
    }
    @Override
    public int hashCode() {
        return this.customerId;
    }

    @Override
    public boolean equals(Object obj) {
        Customer customer = (Customer) obj;
        if (this.hashCode() == customer.hashCode())
            return true;
        return false;
    }


}
