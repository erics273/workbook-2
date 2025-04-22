package com.pluralsight;

import java.util.Scanner;

public class LibraryApp {

    static Book[] theBooks = {
            new Book(1, "12345", "Ready Player 1"),
            new Book(2, "23456", "Jurassic Park"),
            new Book(3, "789254", "Alice in Wonderland"),
            new Book(4, "633578", "To Kill a Mocking Bird"),
            new Book(5, "99955585", "Ready Player 2")
    };

    static Scanner theScanner = new Scanner(System.in);

    public static void main(String[] args) {

        boolean appRunning = true;

        while(appRunning) {
            //aske the user what they want to do at the library (main menu)
            int userMainMenuChoice = mainMenu();

            switch (userMainMenuChoice) {

                case 1:
                    //call the view available books method to show the books
                    //store the selection in userBookChoice
                    int userBookChoice = viewAvailableBooks();



                    if(userBookChoice == -1){
                        continue;
                    }

                    //the user wanted to check out a book
                    if (userBookChoice < theBooks.length) {
                        //eat the newline
                        theScanner.nextLine();
                        //Ask them their name
                        System.out.println("What is your name?");
                        String usersName = theScanner.nextLine();

                        //checkout the book
                        theBooks[userBookChoice].checkOut(usersName);

                    }else{
                        System.out.println("invalid book choice");
                        continue;
                    }

                    break;
                case 2:
                    System.out.println("the user wants to see the checked out books");
                    break;
                case 3:
                    System.out.println("the user hates the library and wants to leave");
                    appRunning = false;
                    break;
                default:
                    System.out.println("Invalid Choice");


            }

        }

    }


    static int mainMenu(){

        System.out.println("Welcome to the library:\n");

        System.out.println("What would you like to do?");
        System.out.println("1: View Available Books");
        System.out.println("2: View checkout out Books");
        System.out.println("3: Exit the library");

        return theScanner.nextInt();


    }

    static int viewAvailableBooks(){

        System.out.println("These are the available books!\n");

        //loop over the books and work with each book
        for (int i = 0; i < theBooks.length; i++) {

            //set the current book to a variable so we dont have to deal with "i" anymore
            Book currentBook = theBooks[i];

            if(currentBook.isCheckedOut() == false){
                System.out.println(i + ": " + currentBook.getTitle() + " - " + currentBook.getIsbn());
            }

        }

        //eat the random line
        theScanner.nextLine();

        //would you like to check out a book
        System.out.println("\nWould you like to check out a book? (y/n)");
        String userSelection = theScanner.nextLine();

        //if th user says yes then ask them which book
        if(userSelection.equalsIgnoreCase("y")){
            System.out.println("Please enter the id of the book you want to check out:");
            return theScanner.nextInt();
        }

        //return -1 if no book selected, its easy to test for
        return -1;

    }

}
