package com.xworkz.bookchor.accessprotected;

import com.sun.org.apache.xpath.internal.operations.String;
import com.xworkz.bookchor.cloningbookchore.BookChor;


// to access protected members/variable inherit parent class
public class TooGoodToBeTrue extends BookChor {
    public static void main(String[] args) {
        TooGoodToBeTrue tooGoodToBeTrue = new TooGoodToBeTrue();
        tooGoodToBeTrue.setId(2);
        System.out.println(tooGoodToBeTrue);
    }
}
