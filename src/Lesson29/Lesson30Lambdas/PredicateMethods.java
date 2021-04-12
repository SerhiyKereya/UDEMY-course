package Lesson29.Lesson30Lambdas;

import java.util.List;

public class PredicateMethods {
    public static void main(String[] args) {

        //traditional way of printing list
        List <String> list = List.of("salo", "m'yaso", "kobasa", "Supa gut");
        for (String s: list) {
            System.out.println(s);
        }
        // lambda expression way of printing list
        list.forEach(s -> System.out.println(s)); //

    }
}
