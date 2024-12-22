package com.google.gmailapp;

import com.google.gmailapp.compose.Mail;

public interface GmailInterface {
    public Mail getInboxById(int mailId);
    public boolean saveMail(Mail compose);
    public void getAllMails();
    public Mail getInboxByFrom(String from);
    public Mail getInboxByTo(String to);
    public Mail getInboxBySub(String sub);
    public Mail getToByFrom(String from);
    public Mail getFromByTo(String to);
    public boolean updateSubByFrom(String from,String updatedSubject);
    public boolean deleteToById(int Id);

}

