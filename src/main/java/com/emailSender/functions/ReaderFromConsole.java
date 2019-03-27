package com.emailSender.functions;

import java.util.Scanner;

public class ReaderFromConsole {

    public String read(){
        String s = "";
        Scanner sc = new Scanner(System.in);
        s = sc.next();
        return s;
    }
}
