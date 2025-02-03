package com.xworkz.bookchor.exceptionhandling;

import com.xworkz.bookchor.cloningbookchore.BookChor;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionRunner {
    public static void main(String[] args) {
        System.out.println("Main started");

        System.out.println("--- Exception Handling ---");

        //from UI -> BE  String/text
        String n = "234"; // 78S9
        int num = Integer.parseInt(n); //  NumberFormatException
        System.out.println("String converted to int: " + num);

        String ph = "9887456324";
        long phno = Long.parseLong(ph);
        System.out.println("String to long Phno: " + phno);

        System.out.println("-- Array Exception handling-- ");
        try {
            int arr[] = new int[1];
            arr[0] = 23;
            arr[1] = 29;
            System.out.println(arr[0] );
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Size is full!!");
        }

        //scanner
        System.out.println("------- Scanner class -------");

        Scanner scanner = new Scanner(System.in);

        BookChor book = new BookChor();

            System.out.println("Your Book Id: ");
            int id = scanner.nextInt();
            book.setBookId(id);

        try {
            System.out.println("Enter Book: ");
            scanner.nextLine(); // write nextLine() twice
            String name = scanner.nextLine();  // for string with space b/w words use nextLine(), for single word i/p we use next()
            book.setName(name);


            System.out.println("Enter Book Price: ");
            double price = scanner.nextDouble();
            book.setPrice(price);
        }
        catch (InputMismatchException e) {
            System.out.println(" Input Mismatch!!");
        }

        System.out.println("Book info: " + book); // toString

        System.out.println("Main ended");
    }
}
