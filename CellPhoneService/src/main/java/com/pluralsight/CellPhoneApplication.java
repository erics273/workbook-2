package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {

    static Scanner theScanner = new Scanner(System.in);

    public static void main(String[] args) {

        //create cellphone
        CellPhone myPhone = new CellPhone();

        //ask the user for the cellphone data
        System.out.println("What is the serial number?");
        String sn = theScanner.nextLine();

        System.out.println("What model is the phone?");
        String model = theScanner.nextLine();

        System.out.println("Who is the carrier?");
        String carrier = theScanner.nextLine();

        System.out.println("What is the phone number?");
        String phoneNumber = theScanner.nextLine();

        System.out.println("WHo is the owner of the phone");
        String owner = theScanner.nextLine();

        //set the cellphone data on the object
        myPhone.setSerialNumber( Integer.parseInt(sn) );
        myPhone.setModel(model);
        myPhone.setCarrier(carrier);
        myPhone.setPhoneNumber(phoneNumber);
        myPhone.setOwner(owner);

        //use the getters to display this information
//        System.out.println("SN: " + myPhone.getSerialNumber());
//        System.out.println("model: " + myPhone.getModel());
//        System.out.println("Carrier: " + myPhone.getCarrier());
//        System.out.println("Phone number: " + myPhone.getPhoneNumber());
//        System.out.println("Owner: " + myPhone.getOwner());



        //create our new phone
        CellPhone burnerPhone = new CellPhone();
        burnerPhone.setPhoneNumber("888-123-4567");
        burnerPhone.setOwner("Bilenie Tilahun");

        System.out.println("-----------info for myPhone--------");
        //use the display method instead
        display(myPhone);

        System.out.println("-----------info for burnerPhone--------");
        //use the display method instead
        display(burnerPhone);

        //have myPhone call the burner
        myPhone.dial(burnerPhone.getPhoneNumber());

        //have the burner call myPhone
        burnerPhone.dial(myPhone.getPhoneNumber());

        //make a new unique phone
        CellPhone thirdPhone = new CellPhone();
        thirdPhone.setOwner("Joanna");
        thirdPhone.setPhoneNumber("555-555-5555");
        thirdPhone.setCarrier("att");
        thirdPhone.setSerialNumber(123);

        thirdPhone.dial("828-514-2334");

        //display info about the thirdPhone
        display(thirdPhone);

        CellPhone fourthPhone = new CellPhone(123, "iphone18", "att", "8285142334", "eric schwartz");

        display(fourthPhone);


    }

    //this method knows how to display the information for a phone
    static void display(CellPhone phone){
        System.out.println("SN: " + phone.getSerialNumber());
        System.out.println("model: " + phone.getModel());
        System.out.println("Carrier: " + phone.getCarrier());
        System.out.println("Phone number: " + phone.getPhoneNumber());
        System.out.println("Owner: " + phone.getOwner());
    }

}
