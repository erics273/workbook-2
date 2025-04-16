package com.pluralsight;

import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class FullNameParserApp {

    static Scanner theScanner = new Scanner(System.in);

    public static void main(String[] args) {

        String theName = askQuestion("Enter your full name (first last or first middle last): ");

        // Split the trimmed input into parts
        String[] namePieces = theName.split(" ");

        //display the parsed name
        displayNameFromParts(namePieces);

    }

    public static String askQuestion(String question){

        System.out.print(question);
        String answer = theScanner.nextLine();

        return answer.trim();
    }

    public static void displayNameFromParts(String[] namePartsArray){

        // Handle based on the number of parts
        switch (namePartsArray.length){
            case 2:
                System.out.println("First Name: " + namePartsArray[0]);
                System.out.println("Last Name: " + namePartsArray[1]);
                break;
            case 3:
                System.out.println("First Name: " + namePartsArray[0]);
                System.out.println("Middle Name: " + namePartsArray[1]);
                System.out.println("Last Name: " + namePartsArray[2]);
                break;
            default:
                System.out.println("Invalid name format. Please enter either 'first last' or 'first middle last'.");
        }

    }

}
