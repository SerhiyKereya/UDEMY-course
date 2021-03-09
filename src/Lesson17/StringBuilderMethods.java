package Lesson17;

public class StringBuilderMethods {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder(); // by default capacity 16 symbols and will increase automatically if needed
        StringBuilder sb2 = new StringBuilder("Good day!!");
        StringBuilder sb3 = new StringBuilder(50); // capacity 50 from the begining
        StringBuilder sb4 = new StringBuilder("1234");

        // methods of stringBuilder
        System.out.println(sb3.length());
        System.out.println(sb2.charAt(3));
        System.out.println(sb2.indexOf("d", 4));

        //
        String s = sb2.substring(5); // chose all starting from 5 position
        System.out.println(s);
        String s2 = sb2.substring(5, 8); // selects 5-8 symbols
        System.out.println(s2);

        // append - can add value to existing string and REPLACE existing
        StringBuilder sb5 = sb4.append("56");
        sb5 = sb5.append("78").append("90").append(" and more");
        System.out.println("sb4 - " +sb4);
        System.out.println("sb5 - "+ sb5);
        sb2.append(22);
        System.out.println(sb2);
        sb2.append(sb2);
        System.out.println(sb2);

        // insert - same as append but  values added after index
        System.out.println(sb2.insert(sb2.length(), "Hello StringBuilder"));
        System.out.println(sb2);

        // delete from Stringbuilder

        sb2.delete(4,10);
        System.out.println(sb2);

        sb2.deleteCharAt(4);
        System.out.println(sb2);

        // reverse
        sb2.reverse();
        System.out.println(sb2);

        // replace
        sb2.replace(0, 1000, "Lets start sb2 again");
        System.out.println(sb2);

        // capacity
        System.out.println(sb2.capacity());
        System.out.println(sb1.capacity());
        System.out.println(sb3.capacity());

        // indexOf - char number-index
        System.out.println(sb2.indexOf("sb"));
    }
}