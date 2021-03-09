package Lesson16;

public class StringMethods {
    public static void main(String[] args) {
        String s1 = new String("Hello_Habc     h   ");
        System.out.println(s1);

        String s6 = s1.substring(1);
        System.out.println(s1.substring(1,5)); // substring cut all before 1 and after 5 character

        String s3 = s1.trim(); // trim method cut out backspaces '   '
        System.out.println(s3);

        int a = s1.length();
        System.out.println(a);

        char ch1 = s1.charAt(1);
        System.out.println(ch1);

        int i = s1.indexOf("ello");
        System.out.println(i);

        int i2 = s1.indexOf("abcd");
        System.out.println(i2);

        boolean b1 = s1.startsWith("abc", 6); // 6 is where 'abc' starts
        System.out.println(b1);

        boolean b2 = s1.endsWith("abc");
        System.out.println(b2);

        String s4 = s1.replace('H', 'S');
        System.out.println(s4);

        String s5 = s1.toUpperCase();
        System.out.println(s5);

        boolean b3 = s1.contains("HELLO");
        System.out.println(b3);


    }
}
