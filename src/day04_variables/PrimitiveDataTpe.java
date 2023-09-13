package day04_variables;

public class PrimitiveDataTpe {

    public static void main (String [] args){

        byte age = 60; // I declare a variable called age which has int data type and number 50 is assigned to ot
        System.out.println("50"); //hardcoded - you have to change it manually

        System.out.println("age"); //here age is not variable

        System.out.println(age); //Dynamically - we are using age variable to make pur code dynamic

        System.out.println("jajajajajaja");
        System.out.println(age);

        //byte age2 = 95; // in java you cant use declare Same Variable name more than ONCE

       // age=100 // Since we are NOT DEclaration it again , we can use the same variable name. it will resign the value

       // Byte age2= 950; // primitive data type byte cant hold 950 because it is out or the range that byte cant hold

        short year; //just declare the variable
        year = 2023; // we Assigned a value to year variable

        int addressNumber = 234235453;


        long bigNumber;
        bigNumber = 9345345876876876L;


        //long year;  //Even if you have a DIFFERENT Data type, you can not use the SAME variable name more than ONCE in the same BLOCK OF CODE


    }
}
