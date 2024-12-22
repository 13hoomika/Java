package com.google.gmailapp.gmail;

import com.google.gmailapp.GmailInterface;
import com.google.gmailapp.compose.Mail;

import java.util.Arrays;

public class Gmail implements GmailInterface {

    Mail inbox[] = new Mail[5];
    int index = 0;

    @Override
    public boolean saveMail(Mail compose) {
        boolean isMailSaved = false;
        if (index < this.inbox.length) {
            this.inbox[index++] = compose;
            isMailSaved = true;
        } else {
            System.out.println("Inbox is full!! Cannot save the mail.");
        }
        return isMailSaved;
    }

    //Get All Mails
    @Override
    public void getAllMails() {
        System.out.println("************ INBOX ********************");
        for (Mail mail : inbox) {
            if (mail != null) {
                System.out.println("Mail ID: " + mail.getId());
                System.out.println("To: " + mail.getTo());
                System.out.println("From: " + mail.getFrom());
                System.out.println("Subject: " + mail.getSubject());
                System.out.println("Body: " + mail.getBody());
                System.out.println("Document Attached: " + mail.isDocAttached());
                System.out.println("-------------------------------------------------");
            }
        }
    }

    // find inbox mail
    @Override
    public Mail getInboxById(int mailId) {
        System.out.println("----------- getInboxById -----------");
        Mail mailFound = null;
        for (Mail mid : inbox) {
            if (mid != null && mid.getId() == mailId) {
                mailFound = mid;

                System.out.println("Mail ID: " + mid.getId());
                System.out.println("To: " + mid.getTo());
                System.out.println("From: " + mid.getFrom());
                System.out.println("Subject: " + mid.getSubject());
                System.out.println("Body: " + mid.getBody());
                System.out.println("Document Attached: " + mid.isDocAttached());
                System.out.println("--------------------------");
            }
            //else System.out.println("No mail found with ID: " + id); // loop
        }
        if (mailFound == null)
            System.out.println("No mail found with ID: " + mailId);
        return mailFound;
    }

    @Override
    public Mail getInboxByFrom(String from) {
        System.out.println("----------- getInboxByFrom -----------");
        Mail mailFound = null;
        for (Mail mfrom : inbox) {
            if (mfrom != null && mfrom.getFrom() == from) {
                mailFound = mfrom;

                System.out.println("Mail ID: " + mfrom.getId());
                System.out.println("From: " + mfrom.getFrom());
                System.out.println("To: " + mfrom.getTo());
                System.out.println("Subject: " + mfrom.getSubject());
                System.out.println("Body: " + mfrom.getBody());
                System.out.println("Document Attached: " + mfrom.isDocAttached());
                System.out.println("--------------------------");
            }
            //else System.out.println("No mail found with ID: " + id); // loop
        }
        if (mailFound == null)
            System.out.println("Mail not found with: " + from);
        return mailFound;
    }

    @Override
    public Mail getInboxByTo(String to) {
        System.out.println("----------- getInboxByTo -----------");
        Mail mailFound = null;
        for (Mail mto : inbox) {
            if (mto != null && mto.getTo() == to) {
                mailFound = mto;

                System.out.println("Mail ID: " + mto.getId());
                System.out.println("From: " + mto.getFrom());
                System.out.println("To: " + mto.getTo());
                System.out.println("Subject: " + mto.getSubject());
                System.out.println("Body: " + mto.getBody());
                System.out.println("Document Attached: " + mto.isDocAttached());
                System.out.println("--------------------------");
            }
            //else System.out.println("No mail found with ID: " + id); // loop
        }
        if (mailFound == null)
            System.out.println("Mail not found with: " + to);
        return mailFound;
    }

    @Override
    public Mail getInboxBySub(String sub) {
        System.out.println("----------- getInboxBySub -----------");
        Mail mailFound = null;
        for (Mail mSub : inbox) {
            if (mSub != null && mSub.getSubject() == sub) {
                mailFound = mSub;

                System.out.println("Mail ID: " + mSub.getId());
                System.out.println("From: " + mSub.getFrom());
                System.out.println("To: " + mSub.getTo());
                System.out.println("Subject: " + mSub.getSubject());
                System.out.println("Body: " + mSub.getBody());
                System.out.println("Document Attached: " + mSub.isDocAttached());
                System.out.println("--------------------------");
            }
            //else System.out.println("No mail found with ID: " + id); // loop
        }
        if (mailFound == null)
            System.out.println("Mail not found with: " + sub);
        return mailFound;
    }

    @Override
    public Mail getToByFrom(String from){
        System.out.println("----------- getToByFrom -----------");
        Mail mailReturn = null;
        for (Mail mFrom : inbox){
            if (mFrom != null && mFrom.getFrom() == from){
                mailReturn = mFrom;

                System.out.println("Mail ID: " + mFrom.getId());
                System.out.println("From: " + mFrom.getFrom());
                System.out.println("To: " + mFrom.getTo());
                System.out.println("Subject: " + mFrom.getSubject());
                System.out.println("Body: " + mFrom.getBody());
                System.out.println("Document Attached: " + mFrom.isDocAttached());
                System.out.println("--------------------------");
            }
        }
        if ( mailReturn== null)
            System.out.println("Mail not found with: " + from);
        return mailReturn;
    }

    @Override
    public Mail getFromByTo(String to){
        System.out.println("----------- getFromByTo -----------");
        Mail mailReturn = null;
        for (Mail mTo : inbox){
            if (mTo != null && mTo.getTo() == to){
                mailReturn = mTo;

                System.out.println("Mail ID: " + mTo.getId());
                System.out.println("From: " + mTo.getFrom());
                System.out.println("To: " + mTo.getTo());
                System.out.println("Subject: " + mTo.getSubject());
                System.out.println("Body: " + mTo.getBody());
                System.out.println("Document Attached: " + mTo.isDocAttached());
                System.out.println("--------------------------");
            }
        }
        if (mailReturn == null)
        System.out.println("Mail not found with: " + to);
        return mailReturn;
    }

    @Override
    public boolean updateSubByFrom(String from,String updatedSubject){
        System.out.println("----------- updateSubByFrom -----------");
        boolean isSubUpdated = false;
        for (Mail mSub : inbox){
            if (mSub != null && mSub.getFrom() == from ){
                mSub.setSubject(updatedSubject);
                isSubUpdated = true;
                System.out.println("is updated: " + isSubUpdated);

                System.out.println("To: " + mSub.getTo());
                System.out.println("Subject: " + mSub.getSubject());
            }
        }
        if (isSubUpdated == false)
            System.out.println(from + " Not Found");
        return isSubUpdated;
    }

    @Override
    public boolean deleteToById(int Id){
        System.out.println("----------- deleteToById -----------");
        boolean isDeleted = false;
        int newIndex= 0;

        for(int start = 0; start < this.inbox.length ; start++){
            Mail curMail = this.inbox[start];

            if(curMail != null && curMail.getId() != Id){
                this.inbox[newIndex++] = curMail;
            }else isDeleted = true;
        }
        inbox = Arrays.copyOf(inbox,newIndex);
        System.out.println("Mail deleted " + isDeleted);

        if (!isDeleted){
            System.out.println("Mail not Found");
        }else System.out.println("MAil " + Id + " deleted successfully");
        return isDeleted;
    }
}
