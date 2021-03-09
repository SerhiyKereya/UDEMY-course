package Lesson20;

import java.util.ArrayList;

public class TestIndexOfArrayList {
    public static void main(String[] args) {
        // new ArrayList list1
        ArrayList<StringBuilder> list1 = new ArrayList<>();
        list1.add(new StringBuilder("hello"));
        list1.add(new StringBuilder("by"));
        list1.add(new StringBuilder("no"));
        list1.add(new StringBuilder("k`moon"));
        //Print list1
        for (StringBuilder sb: list1) {
            System.out.print(sb+ " ");
        }
        System.out.println();
        // it will create new 'by' and not find this new 'by' in list1
        System.out.println(list1.indexOf(new StringBuilder("by")));

    }
}
