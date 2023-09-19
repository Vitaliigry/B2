package day07_relational_operators;

public class UpdateVariables {
    public static void main(String[] args) {
        // how many different way we could add 1
        int a = 10;
        a = 10 + 1;
        a = 12;
        a++; // with the help of pre/ post incriments
        a = a + 1;

        //how can i add 10?
        int b = 4;
        b = 4 + 10; // 14
        b = b + 10;  // we create value from b, then add 10 pn top of it. b = 14 + 10
        b += 10; // same as b = b +10;


        int count = 0;
        count += 5; // count = count + 5 --> count = 5;
        System.out.println(count);

        count -=10;
        System.out.println(count);// -5

        count *= 2; // -10

        count /=3; // -10 / 3 = -3;

        count %=2; // -3 % 2 = -1;

    }

}
