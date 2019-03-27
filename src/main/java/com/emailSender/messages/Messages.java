package com.emailSender.messages;

public class Messages {


    private static final String MY_MAIL = ""; //put here your email
    private static final String MY_PASSWORD = ""; //put here password to your email

    public static final String BORDER = "___________________________________________________\n";

    public static final String WELCOME = "Welcome Stranger!";
    public static final String MENU = "Here is what can I do:\n" +
            "1. Accept order;\n" +
            "2. Ship package;\n" +
            "3. Asking for problems with shipping;\n" +
            "4. Asking for review.\n" +
            "Any other button -- exit.\n" + BORDER +
            "Please choose a kind of your future message:  ";
    public static final String PROCESS = "Processing...";

    public static final String THEME = "Your order in SHOPBAGsUA store on Etsy.";

    public static final String POST_MAIN = "http://ukrposhta.ua/en/vidslidkuvati-forma-poshuku";
    public static final String POST_UKR = "https://tools.usps.com/go/TrackConfirmAction_input";

    public static final String MES_COUNT = "How many emails you will use?";
    public static final String MES_EMAIL =    " - email: ";
    public static final String MES_NAME =     " - name: ";
    public static final String MES_TRACKING = " - tracking: ";
    public static final String MES_REGION = " - region (\"ukr\"-ukrposhta, else-USPS): ";

    public static String getMyMail(){
        return MY_MAIL;
    }

    public static String getMyPassword(){
        return MY_PASSWORD;
    }

    public static final String FILE_ACCEPT = "src/main/java/com/emailSender/files/Accept.txt";
    public static final String FILE_REVIEW = "src/main/java/com/emailSender/files/reviewCareInstruction.txt";
    public static final String FILE_CLARIFY = "src/main/java/com/emailSender/files/Clarify.txt";
    public static final String FILE_SHIP = "src/main/java/com/emailSender/files/Shipping.txt";
}
