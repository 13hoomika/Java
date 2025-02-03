package com.xworkz.bookchor.finalkeyword;

// Usage of final keyword
public final class Book {
    private final int bookId;
    private final String name;
    private final double price;

    public Book(int bookId, String name, double price){
        this.bookId = bookId;
        this.name = name;
        this.price = price;
    }

    public int getBookId() {
        return bookId;
    }
    public String getName() {
        return name;
    }

}
