package Lesson29.Lesson30Lambdas;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PredicateMethods2 {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(3);
        al.add(6);
        al.add(2);
        al.add(7);
        al.add(5);
        al.add(4);
        System.out.println(al);

        //sort method
        al.sort((x, y) -> -x.compareTo(y)); // adding '-' will sort descending
        System.out.println(al);

        //remove if true (al[i] can be divided to 3)
        al.removeIf(element1 -> element1%3==0);
        System.out.println(al);

        // same using Predicate interface
        Predicate<Integer> p = element2 -> element2 %2==0;
        al.removeIf(p);
        System.out.println(al);
    }
}
