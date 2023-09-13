package day04_variables;

public class Fruits {
    public static void main(String[] args) {


        int apples = 50;
        int grapes = 100;
        int bananas = 150;

        // int apples = 50, grapes = 100, bananas = 150; --- you can declare it in this way if
        // all this Three variables have same data

    System.out.println("This is how many apples we have"+apples);
    //+ --- means addition
        // It is called CONCATENATION
        System.out.println("grapes:"+grapes);
        System.out.println("bananas:"+ bananas);

        System.out.println("I sold some apples - 10 apples sold");
        apples = 30;
        System.out.println("Apples after I sold: " + apples);

        int price = 150;
        System.out.println("The price of my 30 apple is 150"); // Hard coded.
        System.out.println("The price of my " + apples + " apple is " + price);  // Dynamic

        System.out.println(apples);

    }
}
