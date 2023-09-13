package day03_comments_escape_sequence;

public class TabAndNextLine {
    public static void main(String[] args) {

        // The followsing are about \t - tab
        System.out.println("This is not tabbed");
        System.out.println("\tThis is tabbed 1 time"); // this is tabbed 1 time
        System.out.println("    This is not tabbed"); // 4 space is equal 1 tab
        System.out.println("\t\tThis is tabbed 2 times");

        // The following are about \n - new line
        System.out.println("1) Got to store ");
        System.out.println("2) grab Milk");
        System.out.println("3) Pay Cashier");


        System.out.println("\n1) Got to store \n2) grab milk \n3) Pay Cashier");

        System.out.println("");

    }
}
