package Lesson26;

import java.util.ArrayList;

public class Wrapped {
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>(); // ArrayList with reference data type <Integer>
        list.add(5); // auto boxing primitive 5 converted to reference <Integer>

        Integer b = new Integer(10);
        int c = b; // unboxing Integer b converted to int c
        System.out.println(c);

        // parsing integrated method parse
        String s1 = "50";
        String s2 = "3.14";
        int i1 = Integer.parseInt(s1); // parsing String "50" to int
        System.out.println(i1);
        double d1 = Double.parseDouble(s2); // parse double
        System.out.println(d1);


    }
}
