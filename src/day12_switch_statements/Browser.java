package day12_switch_statements;

import java.util.Scanner;

public class Browser {
    public static void main(String[] args) {
        System.out.println("Enter Your Browser: ");

        Scanner input = new Scanner(System.in);
        String browser = input.nextLine(); //in case we have multiple words
        System.out.println("Enter your URL: ");
        String url = input.nextLine();

        switch (browser) {
            case "Chrome":
            case "chrome":
                System.out.println("Opening " + url + "in the " + browser + " browser.");
                System.out.println("Loading....");
                break;
            case "Edge":
            case "edge":
                System.out.println("Opening " + url + "in the " + browser + " browser");
                System.out.println(" Loading....");
                break;
            case "Safari":
            case "safari":
                System.out.println("Opening " + url + "in the " + browser + " browser.");
                System.out.println("Loading....");
                break;
            case "Firefox":
            case "firefox":
                System.out.println("Opening " + url + " in the " + browser + " browser.");
                System.out.println("Loading....");

            default:
                System.out.println(browser + " is not valid");
        }



    }
}
