package com.xworkz.bookchor.cloningbookchore;

public class CloneRunner {
    public static void main(String[] args) throws CloneNotSupportedException {
        BookChor bookChor = new BookChor();
        bookChor.setBookId(1);
        bookChor.setName("too good to be true");
        bookChor.setPrice(249.00);

        BookChor bookChor1 = new BookChor();
        bookChor1.setBookId(1);
        bookChor1.setName("too good to be true");
        bookChor1.setPrice(249.00);

        System.out.println("Book0: " + bookChor);
        System.out.println("Book1: " + bookChor1);
        System.out.println("Book0: " + bookChor.hashCode());
        System.out.println("Book1: " + bookChor1.hashCode());

        boolean areSame = bookChor.equals(bookChor1);
        System.out.println(areSame);
        System.out.println("----------------------------");

//  Shallow copy & Deep Copy

        BookChor book1 = new BookChor();
        book1.setBookId(1);
        book1.setName("too good to be true");
        book1.setPrice(249.00);

        // Shallow copy
        System.out.println("-- ShallowCopy --");
        BookChor shallowCopy = book1;
        shallowCopy.setPrice(299.00);

        System.out.println(book1.getPrice());
        System.out.println(shallowCopy.getPrice());

        // Deep copy
        System.out.println("-- DeepCopy --");
        BookChor deepCopy =  (BookChor) book1.clone();
        deepCopy.setPrice(350.00);

        System.out.println(book1.getPrice());
        System.out.println(deepCopy.getPrice());

    }
}
