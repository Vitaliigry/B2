package day04_variables;

public class Olympics {
/*
        class name Olympics

            create a variable for the year
            print the country and year for next couple events
            reassign year value each time. Country name is hard coded

            data:

                China 2022
                France 2024
                Italy 2026

            Look forward to the year $year for the Olympics to be in $location

     */
    public static void main (String [] agrs){
        int year;
        System.out.println("Olympics will be in those locations for upcoming years");
        year = 2022;
        System.out.println("In this year of " + year + " the Olympics will happen in China");
        year = 2026;
        System.out.println("In this year of " + year + " the Olympics will happen in France");
        year = 2030;
        System.out.println("In this year of " + year + " the Olympics will happen in Italy");

    }

}
