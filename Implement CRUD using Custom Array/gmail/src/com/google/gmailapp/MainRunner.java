package com.google.gmailapp;

import com.google.gmailapp.compose.Mail;
import com.google.gmailapp.gmail.Gmail;

public class MainRunner {
    public static void main(String[] args) {
        
        Mail mail1 = Mail.builder().id(1)
                .from("dev@gmail.com")
                .to("bhoomika@gmail.com")
                .subject("Assignment")
                .body("Implement CRUD using Custom Array")
                .isDocAttached(true)
                .build();

        Mail mail2 = Mail.builder()
                .id(2)
                .from("github@gmail.com")
                .to("bcp@gmail.com")
                .subject("Token expiration")
                .body("Your GitHub account token has expired, the application will need to create a new token.")
                .isDocAttached(false)
                .build();

        Mail mail3 = Mail.builder()
                .id(3)
                .from("github@gmail.com")
                .to("bcp@gmail.com")
                .subject("Notice of Absence")
                .body("This is to inform you that you were absent from the Java session today")
                .isDocAttached(false)
                .build();

        Mail mail4 = Mail.builder()
                .id(4)
                .from("google@gmail.com")
                .to("karan@gmail.com")
                .subject("Security alert").build();

        // Save mails to inbox
        Gmail gmail = new Gmail();
        gmail.saveMail(mail1);
        gmail.saveMail(mail2);
        gmail.saveMail(mail3);
        gmail.saveMail(mail4);

//        System.out.println("************ All Mails ********************");
//        gmail.getAllMails();

        System.out.println("************ Search Mail ********************");
        gmail.getInboxById(2);
        gmail.getInboxById(5);

        System.out.println("----------- getInboxByFrom -----------");
        gmail.getInboxByFrom("google@gmail.com");

        System.out.println("----------- getInboxByTo -----------");
        gmail.getInboxByTo("bhoomika@gmail.com");

        System.out.println("----------- getInboxBySub -----------");
        gmail.getInboxBySub("Assignment");

        System.out.println("----------- getToByFrom -----------");
        gmail.getToByFrom("google@gmail.com");

        System.out.println("----------- getFromByTo -----------");
        gmail.getFromByTo("bcp@gmail.com");

        System.out.println("----------- updateSubByFrom -----------");
        gmail.updateSubByFrom("dev@gmail.com","CRUD Operation with OOP");

        System.out.println("************ INBOX ********************");
        gmail.getAllMails();

        System.out.println("----------- deleteToById -----------");
        gmail.deleteToById(4);

        System.out.println("************ INBOX ********************");
        gmail.getAllMails();
    }
}
