# EmailSender
This **_EmailSender_** can help you to send emails to your client through _Gmail_.

## **files** 
Folder consists from html-templates of 4 types of messages
* _Accept.txt_ (when you take an order in progress)
* _Shipping.txt_ (after shipping this order; also later in this template, you will be able to enter clients name, tracking number, link   for a postal provider)
* _Clarifying.txt_ (to clarify with client about receiving order and satisfying it)
* _reviewCareInstruction.txt_(ask client to leave a review about your store and care instruction of leather products)
    
## **Messages.class:**
Here you have to input email and password of your post;
Theme of your messages; links for postal providers;
Html-templates files paths; and all output messages.

## **ReaderFromConsole.class**
**read():** it will read menu-options, number of emails, client-email, client-name, tracking from console (now, without any input check).

## **Class SenderEmail.class:**
**fileToString(String fileName):** reverse txt files with html-template to String;
**pushingMes(String message, String clientData):** _Gmail_ configuration of sending messages through Gmail server;
**sendingMessages():** send two types of messages:
* *sendingMessages(String file)* -- use file path, and send this file to email (for Accept, Clarifying and reviewCareInstruction)
* *sendingMessages()* -- use name, tracking, link of postal provider, input it in _Shipping.txt_-template, and send this file to email.
                                  
## **EntireMessage.class:**
*sendingMes(String fileName, List<String> clientMail)* -- it takes template path, list of clients email, and for every element from list, using _pushingMes_ send same template, to each email.
## **ShippingNameTrackingRegionclass:**
*sendingMessages(String fileName, String email, String name, String tracking, String post)* -- it takes name, tracking, link for postal provider, choose a link of postal provider, re-create template, and give it to _pushingMes_.
    
###### **Update-(31/03/2019)** ######
Move folder **files** with messages templates to main project folder, so now much easier to make a **.jar**(it needs your templates, so it has to be near them and in folder **files**) file :)