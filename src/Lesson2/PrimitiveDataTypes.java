package Lesson2;

public class PrimitiveDataTypes {
    public static void main(String [] args){
        byte b1 = 10; // from -128 to 127

        short s1 = 15;
        short s2 = 0;
        short s3 = -20;

        int i1 = 500;
        int i2 = 0B111100; //binary
        int i3 = 074; // octa
        int i4 = 0x3C; //hexadecimal
        int i5 = 1_000_000; // underscore for big number redability

        long l1 = 1000;
        long l2 = 10000000000000L; // Long type

        float f1 = (float) 3.14;
        float f2 = 2.6F;
        float f3 = 2.0f;

        double d1 = 1.55;

        char c1 = 'a';
        char c2 = 'A';
        char c3 = 500;
        char c4 = '\u1234';

        boolean bool1 = false;
        boolean bool2 = true;

        System.out.println(b1);

    }

}
