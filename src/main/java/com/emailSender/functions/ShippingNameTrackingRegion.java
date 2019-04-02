package com.emailSender.functions;

import java.util.List;

import static com.emailSender.messages.Messages.*;
import static com.emailSender.functions.SenderEmail.*;

public class ShippingNameTrackingRegion {

    public String link = POST_MAIN;
    SenderEmail send = new SenderEmail();

    public void sendingMes(String fileName, String email, String name, String tracking, String post) {
        if (post.equals("ukr")) {
            this.link = POST_UKR;
        }

        send.pushingMes(fileToString(fileName).replace("%1$s", name).replace("%2$s", tracking).replace("%3$s", link), email);
    }

    public void sendingMes(String fileName, List<String> email, List<String> name, List<String> tracking, List<String> post) {
        for (int i = 0; i < email.size(); i++) {
            if (post.equals("ukr")) {
                this.link = POST_UKR;
            }

            send.pushingMes(fileToString(fileName).replace("%1$s", name.get(i)).replace("%2$s", tracking.get(i)).replace("%3$s", link), email.get(i));
        }
    }

}