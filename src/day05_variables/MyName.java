package day05_variables;

public class MyName {
    public static void main (String [] args){
         /*
            create a class MyName
            create a main method
            create multiple char variables, one for each letter of your name
            print your name
                print each letter in a different line
                print your name in the same line
     */
        char first = 'V';
        char second = 'i';
        char tree = 't';
        char four = 'a';
        char five = 'l';
        char six = 'i';
        char seven = 'i';

        System.out.println(first);
        System.out.println(second);
        System.out.println(tree);
        System.out.println(four);
        System.out.println(five);
        System.out.println(six);

        System.out.println(first + second + tree + four + five+six);
        System.out.println("My name is:" + first + second + tree + four + five + six);
        String myName = "" + first + second + tree + four + five + six;
        System.out.println("My Name is "+ myName);

    }
}
