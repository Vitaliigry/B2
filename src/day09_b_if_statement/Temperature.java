package day09_b_if_statement;

import java.util.Scanner;

public class Temperature {


    /*

    Task:
        ask the user to enter the temperature

        if the temperature is above or equal to 70
            print: Its a nice day
                   Go outside, but with your laptop to code java
        if the temperature if less than 70
            print: Its too cold
                   Code more java
     */
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.println("Enter the temperature: ");
        int temp = key.nextInt(); // dynamicly getting from user
        //int = 50; // manually changing the value . Hard Coded.
        //boolean result = temp >= 70;
        if (temp >=70){
            System.out.println("It is nice day");
            System.out.println("Go outside");



        }else {
            System.out.println("Its too cold");
            System.out.println("Code more Java");
        }



    }
}
