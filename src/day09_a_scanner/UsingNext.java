package day09_a_scanner;

import java.util.Scanner;

public class UsingNext {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("What is today of the week? ");
        String day = input.nextLine();

        System.out.println("Enter your first name: ");
        String name = input.next();

        System.out.println("Today: " + day);
        System.out.println("First name: " + name);

        System.out.println("Enter your Last name: " );
        String lastName = input.next();

        input.nextLine(); // use ones is enough to solve Enter issue

        System.out.println("Enter your address: ");
        String address = input.nextLine();

        System.out.println("Enter your bank account username: ");
        String userName = input.nextLine();

        System.out.println("Last name: " + lastName);
        System.out.println("Address: " + address);
        System.out.println("Username: " + userName);


    }
}
