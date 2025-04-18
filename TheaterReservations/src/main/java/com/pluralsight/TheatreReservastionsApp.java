package com.pluralsight;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TheatreReservastionsApp {

    //create the scanner
    static Scanner theScanner = new Scanner(System.in);

    //crete the date formatters
    static DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("MM/d/yyyy");

    public static void main(String[] args) {

        // Prompt for full name
        String fullName = askQuestion("Please enter your name: ");


        // Prompt for date
        String dateInput = askQuestion("What date will you be coming (MM/dd/yyyy): ");


        // Prompt for number of tickets
        int ticketCount = Integer.parseInt(askQuestion("How many tickets would you like? "));

        //display output
        displayOutput(fullName, dateInput, ticketCount);

    }

    public static String askQuestion(String question){
        System.out.print(question);
        String answer = theScanner.nextLine();

        return answer.trim();
    }

    public static void displayOutput(String name, String showDate, int numTickets){

        //deal with first and last name
        String[] nameParts = name.split(" ");
        String fullNameFormatted = nameParts[nameParts.length - 1] +", " + nameParts[0];

        //Handle dates
        LocalDate date = LocalDate.parse(showDate, inputFormatter);

        //build output
        String output = numTickets + " ticket" ;
        output  += (numTickets == 1) ? " " : "s ";
        output += "reserved for " + date;
        output += " under " + fullNameFormatted;

        // Display confirmation
        System.out.println(output);


    }

}
