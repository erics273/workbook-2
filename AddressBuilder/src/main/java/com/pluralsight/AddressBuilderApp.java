package com.pluralsight;

//got import that scanner thing
import java.util.Scanner;

public class AddressBuilderApp {

    //fire up that dang scanner
    static Scanner theScanner = new Scanner(System.in);

    public static void main(String[] args) {

        //setup some variables
        StringBuilder billingAddress = new StringBuilder();
        StringBuilder shippingAddress = new StringBuilder();

        // greet user and ask for all the information
        System.out.println("Please provide the following information:");

        String fullName = askQuestion("Full name: ");
        System.out.print("\n\n");
        String billingStreet = askQuestion("Billing Street: ");
        System.out.print("\n");
        String billingCity = askQuestion("Billing City: ");
        System.out.print("\n");
        String billingState = askQuestion("Billing State: ");
        System.out.print("\n");
        String billingZip = askQuestion("Billing Zip: ");
        System.out.print("\n");

        System.out.print("\n\n");

        String shippingStreet = askQuestion("Shipping Street: ");
        System.out.print("\n");
        String shippingCity = askQuestion("Shipping City: ");
        System.out.print("\n");
        String shippingState = askQuestion("Shipping State: ");
        System.out.print("\n");
        String shippingZip = askQuestion("Shipping Zip: ");
        System.out.print("\n");

        System.out.print("\n\n");


        //use stringbuilder to build address
        shippingAddress.append("Shipping Address:\n");
        shippingAddress.append(shippingStreet).append("\n");
        shippingAddress.append(shippingCity).append(", ");
        shippingAddress.append(shippingState).append(" ");
        shippingAddress.append(shippingZip);

        billingAddress.append("Billing Address:\n");
        billingAddress.append(billingStreet).append("\n");
        billingAddress.append(billingCity).append(", ");
        billingAddress.append(billingState).append(" ");
        billingAddress.append(billingZip);

        //print out the output
        System.out.println(fullName +"\n\n");
        System.out.println(billingAddress.toString());
        System.out.print("\n\n");
        System.out.println(shippingAddress.toString());


    }

    public static String askQuestion(String question){

        //boolean to use as on/off
        boolean valid = false;

        String answer = "";
        while (!valid) {
            System.out.print(question);
            answer = theScanner.nextLine().trim();

            if(answer.isEmpty()){
                System.out.println("Error: Field cannot be blank");
                continue;
            }

            valid = true;

        }


        return answer;
    }

}
