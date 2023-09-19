package day09_a_scanner;

import java.util.Scanner;

public class Angles {

    /*
        Write a program that asks the user to enter 3 angle numbers ( can be floating numbers/decimal )
        Determine if the angles make a triangle, which means the angles add to 180.0
        and
        Determine if the angles make a circle, which means the angles add to 360.0
     */
    public static void main(String[] args) {
        System.out.println("Enter three angle degree: ");
        Scanner input = new Scanner(System.in);
        double angelOne = input.nextDouble();
        double angleTwo = input.nextDouble();
        double angleTree = input.nextDouble();

        double total = angelOne+ angleTwo + angleTree;

        boolean isTriangle = total == 180;
        boolean isCircle = total == 360;
        System.out.println("It is a triangle: " + isTriangle);
        System.out.println("It is a circle: " + isCircle);


    }

}
