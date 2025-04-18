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
        System.out.println("SN: " + myPhone.getSerialNumber());
        System.out.println("model: " + myPhone.getModel());
        System.out.println("Carrier: " + myPhone.getCarrier());
        System.out.println("Phone number: " + myPhone.getPhoneNumber());
        System.out.println("Owner: " + myPhone.getOwner());


    }

}
