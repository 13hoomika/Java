package com.xworkz.bookchor.cloningbookchore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BookChor implements Cloneable{
    private int bookId;
    private String name;
    private double price;
    protected int id; //used in TooGoodToBeTrue class in diff pkg (accessprotedceted)

    protected void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString(){
        return "BookChor {Id = " + this.bookId + ", book name = " + this.name + ", price = " + this.price + "}";
    }

    @Override
    public int hashCode(){
        return this.bookId;
    }

    @Override
    public boolean equals(Object obj){
        BookChor bookChor = (BookChor) obj;
        if (this.bookId == bookChor.bookId)
            return true;
        return false;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
