package day06_a_arithmetic_operators;

public class CastingExample {
    public static void main(String[] args) {

        short numOne = 40;
        float numTwo = numOne; //shot is smaller then float, implicit casting happens.
        System.out.println(numOne);
        System.out.println(numTwo);

        float num3 = 100.5F;
        short num4 = (short) num3; // float bigger , so we must Explicit cast. Narrowmig casting
        System.out.println(num3);
        System.out.println(num4);



        float nu5 = 300;
        byte nu6 = (byte) nu5;
        short nu7 = (short) nu5;
        System.out.println(nu5);
        System.out.println(nu6);



        char letter = 'A';
        int letterInt = letter;
        System.out.println(letter);
        System.out.println(letterInt);

        System.out.println((int) letter);
        System.out.println((char) letter);

        int let2 = 66;
        char let3 = (char) let2;
        System.out.println(let3);
        System.out.println((char)66); //same way just print statement
        System.out.println((int) '&' );




    }
}
