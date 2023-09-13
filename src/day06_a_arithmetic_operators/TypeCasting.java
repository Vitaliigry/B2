package day06_a_arithmetic_operators;

public class TypeCasting {
    public static void main(String[] args) {

        byte b = 40;
        int i = b; // the byte value is automaticaly converted to int, cuz bite is smaller then int

        System.out.println(b);
        System.out.println(i);

        int i2 = 100;
        byte b2 = (byte) i2; // int is bigger then byte, so we must CAST it - (byte)

        System.out.println(i2);
        System.out.println(b2);

        int i3 = 500;
        long l1 = i3; // Im goinf from small - big.

        long l2 = 200;
        int i4 = (int) l2;

        System.out.println(l2);
        System.out.println(i4);

        double d = 50;
        int i5 = (int) d;
        System.out.println(d);



        // WIth number outside the Range
        int i6 = 404;
        byte b4 = (byte) i6;
        System.out.println(i6);
        System.out.println(b4);

        System.out.println();
        double d3 = 45.56;
        int i7 = (int)d3;
        System.out.println(d3);
        System.out.println(i7);

    }
}
