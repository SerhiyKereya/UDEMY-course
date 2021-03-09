package Lesson2;

public class homeWork2 {
    public static void main(String[] args) {
        byte b1 = 12;
        byte b2 = 0b00001100;
        byte b3 = 014;
        byte b4 = 0xC;
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);

        short s1 = 1300;
        short s2  = 0b10100010100;
        short s3 = 02424;
        short s4 = 0x514;
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);

        int i1 = 0;
        int i2 = 0b00000000;
        int i3 = 00;
        int i4 = 0x0;
        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);
        System.out.println(i4);

        long l1 = 123456789L;
      //  long l2 = 0b111010110111100110100010101‬; //
        long l3 = 0726746425L;
        long l4 = 0x75BCD15L;
        System.out.println(l1);
        //System.out.println(l2);
        System.out.println(l3);
        System.out.println(l4);

        char c1 = 'a';
        char c2 = 99;
        char c3 = '\u1000';
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

        boolean bool1 = 1==5;
        boolean bool2 = 5==5;
        System.out.println(bool1);
        System.out.println(bool2);
    }
}