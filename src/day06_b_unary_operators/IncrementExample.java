package day06_b_unary_operators;

public class IncrementExample {

    public static void main(String[] args) {
        int x = 0;
        System.out.println(x); //0
        x = x + 1; // take the value 0 and add 1 --- 0+1 = 1
        System.out.println(x);

        //in java there is a shorter way to wright x +1 in options: POST-Increment and PRE-Increment
        //POST-Increment
        x++; // this will icrerease value by 1 ---- x+x-- 1+1 = 2
        System.out.println(x);

        x++;
        System.out.println(x);

        //the difference ?

        System.out.println(++x); // pre - increment (it will update x first and then print

        System.out.println(x++); // post - increment (it will print first and then updates)
        System.out.println(x);


        //PRE-incerement
        ++x; // with will increase value by 1.
        System.out.println(x);


    }
}
