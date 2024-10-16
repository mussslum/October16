package org.example;

public class Hotmail implements MailService{
    @Override
    public void send() {
        System.out.println("Mail sent by Hotmail");
    }
}
