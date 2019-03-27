package com.emailSender.functions;

import static com.emailSender.messages.Messages.*;
import static com.emailSender.functions.SenderEmail.*;

public class ShippingNameTrackingRegion {

    public static String link = POST_MAIN;
    SenderEmail send = new SenderEmail();

    public void sendingMes(String fileName, String email, String name, String tracking, String post) {
        if (post.equals("ukr")) {
            link = POST_UKR;
        }

        send.pushingMes(fileToString(fileName).replace("%1$s", name).replace("%2$s", tracking).replace("%3$s", link), email);
    }

}