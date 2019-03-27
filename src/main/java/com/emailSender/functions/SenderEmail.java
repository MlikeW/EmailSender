package com.emailSender.functions;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Properties;
import java.util.stream.Stream;

import static com.emailSender.messages.Messages.*;

public class SenderEmail {

    public static int count;

    protected static String fileToString(String fileName) {
        StringBuilder contentBuilder = new StringBuilder();

        try (Stream<String> stream = Files.lines(Paths.get(fileName), StandardCharsets.ISO_8859_1)) {
            stream.forEach(s -> contentBuilder.append(s).append("\n"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        return contentBuilder.toString();
    }

    public void pushingMes(String message, String clientData){

        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");

        String to = clientData;

        Session session = Session.getDefaultInstance(props, new javax.mail.Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(getMyMail(), getMyPassword());
            }
        });

        try {
            Message tempMes = new MimeMessage(session);

            tempMes.setFrom(new InternetAddress(getMyMail()));
            InternetAddress[] address = {new InternetAddress(to)};
            tempMes.setRecipients(Message.RecipientType.TO, address);
            tempMes.setSubject(THEME);
            tempMes.setSentDate(new Date());

            tempMes.setContent(message, "text/html");

            Transport.send(tempMes);
        } catch (MessagingException messex) {
            messex.printStackTrace();
        }
    }

    public static void sendingMes(String file){

        ReaderFromConsole console = new ReaderFromConsole();
        entireMessage entire = new entireMessage();
        List<String> clientMail = new ArrayList<>();

        System.out.println(BORDER + MES_COUNT);
        count = Integer.parseInt(console.read());
        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + MES_EMAIL);
            clientMail.add(console.read());
            System.out.println(BORDER);
        }
        System.err.println(PROCESS);
        entire.sendingMes(file, clientMail);
    }

    public static void sendingMes(){

        ReaderFromConsole console = new ReaderFromConsole();
        ShippingNameTrackingRegion ship = new ShippingNameTrackingRegion();

        List<String> clientMail = new ArrayList<>();
        List<String> clientName = new ArrayList<>();
        List<String> clientTracking = new ArrayList<>();
        List<String> clientRegion = new ArrayList<>();

        System.out.println(BORDER + MES_COUNT);
        count = Integer.parseInt(console.read());
        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + MES_EMAIL);
            clientMail.add(console.read());
            System.out.println((i + 1) + MES_NAME);
            clientName.add(console.read());
            System.out.println((i + 1) + MES_TRACKING);
            clientTracking.add(console.read());
            System.out.println((i + 1) + MES_REGION);
            clientRegion.add(console.read());
            System.out.println(BORDER);
            System.err.println(PROCESS);
            ship.sendingMes(FILE_SHIP, clientMail.get(i), clientName.get(i), clientTracking.get(i), clientRegion.get(i));
        }

    }

}
