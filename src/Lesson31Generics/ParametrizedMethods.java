package Lesson31Generics;

import java.util.ArrayList;

public class ParametrizedMethods {
    public static void main(String[] args) {
        ArrayList<Integer> al1 = new ArrayList<>();
        al1.add(10);
        al1.add(20);
        al1.add(30);
        ArrayList<String> al2 = new ArrayList<>();
        al2.add("a");
        al2.add("b");
        al2.add("c");
        int i = GenericsMethod.getSecondElement(al1);
        System.out.println(i);
        String s = GenericsMethod.getSecondElement(al2);
        System.out.println(s);
    }
}

class GenericsMethod{
    //method getSecondElement with unspecified type T
    public static<T> T getSecondElement(ArrayList<T> tArrayList){ // second T is mandatory and declares what type should be returned
        return tArrayList.get(1);
    }
}
