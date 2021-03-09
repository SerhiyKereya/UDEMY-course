package Lesson20;

import Lesson11.Car;

import java.util.ArrayList;
import java.util.List;

public class TestArrayList {
    public static void main(String[] args) {
        // next ArrayList can contain any type of collections
        ArrayList list = new ArrayList();
        list.add("hello");
        CarArray c = new CarArray();
        list.add(c);

        // String type ArrayList
        ArrayList <String> list2 = new ArrayList<>(3);
        ArrayList <String> list5 = new ArrayList<>(list2); // ArrayList can contaion another ArrayList
        list2.add("only Strings");
        System.out.println(list2==list5);

        // String type List
        List<String> list3 = new ArrayList<>();
        list2.add("only Strings");
    }
}

class CarArray{}