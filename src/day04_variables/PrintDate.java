package day04_variables;

public class PrintDate {
      /*
        Task:
            declare and assign 3 variables
            the month number, the day number, and year number

            print the date in the following format:
                month/day/year

     */

    public static void main (String [] agrs){

        int month = 9;
        int day = 7; // if you start you numbers with 0 it will not show it in output.
        int year = 2023;

        //int month, day, year

        System.out.println(month +"/"+ day + "/" + year);
        System.out.println(month +"."+ day + "." + year);
        System.out.println(month +"-"+ day + "-" + year); // hyphen, dash
        System.out.println(month +"|"+ day + "|" + year); // pipe, vertical bar



    }
}
