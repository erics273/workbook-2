package com.pluralsight;

import java.util.Scanner;

public class FullNameApplication {

    static Scanner theScanner = new Scanner(System.in);

    public static void main(String[] args) {

        // Prompt user for name parts
        String firstName = askQuestion("Enter your first name: ");

        String middleName = askQuestion("Enter your middle name (press Enter to skip): ");

        String lastName = askQuestion("Enter your last name: ");

        String suffix = askQuestion("Enter your suffix (press Enter to skip): ");

        //display the name
        displayName(firstName, middleName, lastName, suffix);



    }

    public static String askQuestion(String question){

        System.out.print(question);
        String answer = theScanner.nextLine();

        return answer.trim();
    }

    public static void displayName(String firstName, String middleName, String lastName, String suffix){
        // Build the full name using string concatenation
        String fullName = firstName;

        //check with length just to show how that works
        if (middleName.length() > 0) {
            fullName += " " + middleName;
        }

        fullName += " " + lastName;

        //check with isEmpty
        if (!suffix.isEmpty()) {
            fullName += ", " + suffix;
        }

        // Display the full name
        System.out.println("Your full name is: " + fullName);
    }

}
