package com.emailSender;

import com.emailSender.functions.ReaderFromConsole;

import static com.emailSender.messages.Messages.*;
import static com.emailSender.functions.SenderEmail.*;

/**
 *
 * Created by MlikeW on 26/03/2019
 */

public class Main {

    public static String option;

    public static void main(String[] args) {

        ReaderFromConsole console = new ReaderFromConsole();

        System.out.println(BORDER + WELCOME);

        loop:
        while (true) {
        System.out.print(BORDER + MENU);
        option = console.read();

            switch (option) {
                case "1":
                    sendingMes(FILE_ACCEPT);

                    break;
                case "2":
                    sendingMes();
                    break;
                case "3":
                    sendingMes(FILE_CLARIFY);

                    break;
                case "4":
                    sendingMes(FILE_REVIEW);
                    break;
                default:
                    System.err.print("You just end it :(\n" +
                                     "Good by my darling!");
                    break loop;
            }
        }

    }
}
