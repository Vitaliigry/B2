package day11_if_statements;

import java.util.Scanner;

/*
inputs:
    declare and assign a 4 digit pin code
    declare and assign the last 4 digits of ssn: 1234

    declare and assign expected values for both
        example expected:
            pin: 1234
            ssn: 8213

outputs:

        when the pincode and ssn match the expected print:
            Authentication successful

        when the pincode or ssn are not correct print:
            Authentication failed

        when the pincode was not correct print:
            incorrect pin code

        when the ssn is not correct print:
            invalid ssn
 */
public class LoginApp {
    public static void main(String[] args) {

        int myPincode = 1234;
        int mySSN = 8213;

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to ATM! \n\tPlease enter your PIN CODE:");
        int enterPincode = input.nextInt();

        System.out.println("\tPlease, enter last 4 of ssn: ");
        int enterSSN = input.nextInt();

        if (enterPincode == myPincode && enterSSN == mySSN) {
            System.out.println("\n\tAuthentication successful");

        } else {
            System.out.println("]\n\tAuthentication failed");
            if (enterPincode != myPincode) {
                System.out.println("Invalid Pincode");
            }

            if (enterSSN != mySSN) {
                System.out.println("Invalid SSN");
            }


        }

    }
}