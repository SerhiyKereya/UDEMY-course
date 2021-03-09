package Lesson20;

import java.util.ArrayList;

public class TestIndexOfArrayList2 {
    public static void main(String[] args) {
        // new ArrayList list1
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("hello");
        list1.add(new String("by"));
        list1.add(new String("no"));
        list1.add(new String("k`moon"));
        list1.add("no");

        //Print list1
        for (String sb: list1) {
            System.out.print(sb+ " ");
        }
        System.out.println();
        // it will create new 'by' and find this new 'by' in list1 on index 1
        System.out.println("indexOf 'no' - " + list1.indexOf(new String("no")));

        // last indexOf no
        System.out.println(list1.lastIndexOf("no"));

        // list size
        System.out.println(list1.size());

        // check if list is epmpty
        System.out.println(list1.isEmpty());

        //toString print list1
        System.out.println(list1.toString());
    }
}
