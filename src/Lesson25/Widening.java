package Lesson25;

public class Widening {
    public static void main(String[] args) {
        byte b = 10;
        int a = b; // widening byte became int

        System.out.println(7); // 7 had default type int
        byte b2 = 3; // int '3' applys to byte 'b2'

        final int i1 = 3;
        short s2 = i1; // allowed to narrow int to short becouse final=constanta

        byte i2 = 5;
        long l = 1234567890;
        // i2 = i2*l; // can't write this way 'int' can't be multiplied to 'long'
        i2 *= l; // the same but work // 'l' converted to byte and then multiplied and equals // automatic casting
        int i3 = (int)(i2*l); // Down casting to int
        System.out.println(i2);
        byte i4 = i2;
    }
}
