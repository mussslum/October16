package org.example;

public class Gmail implements MailService{
    @Override
    public void send() {
        System.out.println("Mail sent by Gmail");
        // dev environment
    }
}
