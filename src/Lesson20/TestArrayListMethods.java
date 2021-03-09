package Lesson20;

import java.util.ArrayList;
import java.util.SplittableRandom;

public class TestArrayListMethods {
    public static void main(String[] args) {
        ArrayList <String> list = new ArrayList<>();
        list.add("hi");
        list.add("by");
        list.add("ok");
        list.add("nooo");
        // cycle will print all from ArrayList list
        for (String s:list) {
            System.out.print(s+ " ");
        }
        System.out.println();
        System.out.println(list.get(3));

        // method set will replace data in ArrayList 3-rd cell
        list.set(3, "Yeees");
        for (String s:list) {
            System.out.print(s+ " ");
        }
        System.out.println();
    }
}
