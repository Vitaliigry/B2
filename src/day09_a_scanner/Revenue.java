package day09_a_scanner;

import java.util.Scanner;
public class Revenue {

    /*
         Write a program that asks the user to enter a price and quantity and then calculate the revenue.

         Calculation: revenue = price × quantity.

    */
    public static void main(String[] args) {
        //1) First I need to import the package that the scanner class it in
        //2) Then I need to creat an OBJECT of the scanner class

        //if I want to use class from a different package , I need to import it
        // if I want to use anything from that class , I need to creat object to it.

        Scanner input = new Scanner(System.in); // input === is a reference to object.
        System.out.println("Enter the price: $");
        double price = input.nextDouble();
        System.out.println("Enter the quantity: ");
        int quantity = input.nextInt();

        double revenue = price * quantity;

        System.out.println("Revenue: $" + revenue);



    }
}
