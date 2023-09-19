package day09_b_if_statement;

import java.util.Scanner;

public class CheckHunger {
    /*
       Task:

           boolean variable isHungry

           if the person is hungry,print: You are hungry, so I will get some food for you

           if the person is not hungry, print: Great, then practice java

    */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("are you hungry, enter True or False: ");
        boolean isHungry = input.nextBoolean();
        if (isHungry) {
            System.out.println("you are hungry, get some food");
        } else {
            System.out.println("Great, practice Java");
        }
    }
}

