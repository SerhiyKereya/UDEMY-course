package Lesson3;

public class test3 {
    public static void main( String [] args){
        int a = 10;
        int b = 3;

        int c = a/b;
        double d = a%b;

//        System.out.println(c);
//        System.out.println(d);

        int x = 5;
        int y = 3;
        int z2 = x - ++y;
        int z = x - y++;

        System.out.println(z);
        System.out.println(y);
        System.out.println(z2);
    }
}
