package day12_switch_statements;

import java.util.Scanner;

public class DayOfWeek {
    /*
        Given a day number, find and print the day related to the number

        1- Monday
        2- Tuesday

        6- Saturday
        7- Sunday

        any other number: Not a day
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number related to weekday / 1-7");
        int dayNum = input.nextInt();

        String day = "";
        switch (dayNum){
            case 1:
                day = "Monday";
                break;
            case  2:
                day = "Tuesday";
                break;
            case 3:
                day = "Wed";
                break;
            case 4:
                day = "Thur";
                break;
            case  5:
                day = "Fri";
                break;
            case 6:
            case 7:
                day = "Weekend";
                break;
            default:
                day = "is now valid";
                break;
        }
        System.out.println(day);
    }
}
