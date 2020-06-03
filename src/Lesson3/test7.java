package Lesson3;

public class   test7 {
    public static void main(String[] args) {

        boolean a = true;
        boolean b = false;

        //System.out.println(!a);

        int i1 = 1;
        int i2 = 2;
        int i3 = 3;
        int i4 = 4;

        boolean c = !(i1<i2); // not false = true
        boolean d = i1>i2 && i3++==i4; // true and - then skipped by java
        boolean e = i1<i2 || i3++==i4; // true or - doesn't matter skipped by java
        boolean f = i1<i2 | i3++==i4; // true or and continue to run after |

        System.out.println(f);
        System.out.println(i3);

        boolean b1 = false;
        boolean b2 = true;
        boolean b3 = true;
        boolean b4 = true;

        System.out.println(b1^b2^b3^b4);
    }
}
