package Lesson20;

import java.util.ArrayList;
import java.util.List;
import java.util.SplittableRandom;

public class TestArrayListMethods {
    public static void main(String[] args) {
        ArrayList <String> list1 = new ArrayList<>();
        list1.add("hi");
        list1.add("by");
        list1.add("ok");
        list1.add("nooo");
        // cycle will print all from ArrayList list
        for (String s:list1) {
            System.out.print(s+ " ");
        }
        System.out.println();
        System.out.println(list1.get(3));

        // method set will replace data in ArrayList 3-rd cell
        list1.set(3, "Yeees");
        for (String s:list1) {
            System.out.print(s+ " ");
        }
        System.out.println();

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("hi");
        list2.add("by");
        list2.add("YES");

        //removeAll method will remove list1 strings from list2
       // list2.removeAll(list1);
        System.out.println("list2 - "+ list2);

        //retainAll method will remove list1 strings from list2
        list1.retainAll(list2);
        System.out.println("list1 - " + list1);

        // sublist created from part of Arraylist
        List<String> sublist1 = list1.subList(0,1);
        // add 'shit' to sublist also add to list1
        sublist1.add("shit");
        System.out.println("list1 - " + list1);
        System.out.println("sublist1 - "+sublist1);

        //List.of - create List3 - is unmodifyible
        List<String> list3 = List.of("uno", "twa", "trio");
        System.out.println("list 3 - " + list3);
       // list3.add("blyat");

        // List.copyOf create unmodifieble list4
        List<String> list4 = List.copyOf(list1);
        System.out.println("list4 - "+ list4);

    }
}
