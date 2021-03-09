package Lesson3;

public class homeWork3 {
    public static void main(String[] args) {
        // 16.7
        int i1 = 5;
        int i2 = 11;

        double d1 = 5.5;
        double d2 = 1.3;

        long l2 = 20l;

        double result = 0;
        result = i2/d1 + d2%i1 - l2;
        System.out.println(result);

        //15
        int a = 5;
        a = a-- - --a + ++a + a++ + a;
        System.out.println(a);

        //1
        int b = 8;
        b = ++b - b++ + ++b - --b;
        System.out.println(b);
    }
}
