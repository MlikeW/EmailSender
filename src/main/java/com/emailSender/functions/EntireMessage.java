package com.emailSender.functions;

import java.util.List;

import static com.emailSender.functions.SenderEmail.*;

public class EntireMessage {

    SenderEmail send = new SenderEmail();

    public void sendingMes(String fileName, List<String> clientMail) {

        String message = fileToString(fileName);
        clientMail.forEach(mail -> send.pushingMes(message, mail));
    }
}
