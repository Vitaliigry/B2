package day03_comments_escape_sequence;

public class Test {
    public static void main(String[] args) {

        // company name

        String name = "\n\tLOOP ACADEMY";

        String name2 = "\n\tThank you" + " for teaching";

        // company profit per year
        int money = 2500000;
        double TAX = 45000.237698;

        // employee paid per hour ( by department )
        byte marketing = 35;
        float engineers = 85.43f;
        double networking = 128.50;
        double developers = 250.34;

        System.out.println(name);
        System.out.println("\n\n");
        System.out.println(money);
        System.out.println(TAX);
        System.out.println(marketing);
        System.out.println(engineers);
        System.out.println(networking);
        System.out.println(developers);
        System.out.println(name2);
    }
}
