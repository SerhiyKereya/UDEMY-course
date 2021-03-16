package Lesson21;

public class BooleanExpressionTest {
    public static void main(String[] args) {
        int a = 4;
        // boolean expression ? "true":"false"
        System.out.println(a<4?"yes":"no");

        // boolean expression if operates same type 'int' can be assagned to variable int
        int b = (a>5)?a++:a--;
        System.out.println("a = "+ a);
    }
}
