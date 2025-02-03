package com.xworkz.bookchor.finalkeyword;

// final Book class can't extend i.e, inherit
public class BookRunner {
    public static void main(String[] args) {
        Book book = new Book(1,"Almond",349.00);
//        book.set --> can not modify final variables
        System.out.println(book.getName());

    }
}
