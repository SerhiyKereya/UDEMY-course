package Lesson20;

import java.util.ArrayList;

public class TestArrListStringBuilderAppend {
    public static void main(String[] args) {

        // new ArrayList list1
        ArrayList <StringBuilder> list1 = new ArrayList<>();
        StringBuilder sb1 = new StringBuilder("hello");
        StringBuilder sb2 = new StringBuilder("by");
        StringBuilder sb3 = new StringBuilder("what");

        list1.add(sb1);
        list1.add(sb2);
        list1.add(sb3);
        list1.add(new StringBuilder("k`moon")); // second shorter way of adding new StringBuilder

        // Add !!! for each string value in Arraylist list1
        for (int i = 0;i<list1.size();i++){
            list1.get(i).append("!!!");
        }
        // Print list1
        for (StringBuilder sb:list1) {
            System.out.print(sb +" ");
        }
        System.out.println();

        // new ArrayList2
        ArrayList<StringBuilder> list2 = new ArrayList<>();
        StringBuilder sb5 = new StringBuilder("Mykola");
        StringBuilder sb6 = new StringBuilder("Pavlo");

        list2.add(sb5);
        list2.add(sb6);

        // clone list1 to list3
        ArrayList<StringBuilder> list3 = (ArrayList<StringBuilder>)list1.clone();
        // compare reference values of bouth
        System.out.println("list1.get(0)==list3.get(0) - "+(list1.get(0) == list3.get(0)));

        //toArray - method copy values from ArrayList list1 to array1
        StringBuilder[] array1 = (list2.toArray(new StringBuilder[10]));
        for (StringBuilder sb: array1) {
            System.out.print(" " + sb);
        }
        System.out.println();

        // Adding List2 to index 1 of List1 ArrayList
        list1.addAll(1,list2);

        // Print list1
        for (StringBuilder sb:list1) {
            System.out.print(sb + " ");
        }
        System.out.println();

        // Delete index 3 in ArrayList list1
        list1.remove(3);
        for (StringBuilder sb:list1) {
            System.out.print(sb +" ");
        }
        System.out.println();

        // set list2 index 1 to Vasylyna byt not affect list1
        list2.set(1,new StringBuilder("Vasylyna"));

        // add '!' to list2 and it will affect list1 too
        list2.get(0).append("***");

        //print list2
        for (StringBuilder sb:list2) {
            System.out.print(sb +" ");
        }
        System.out.println();

        // Print list1
        for (StringBuilder sb:list1) {
            System.out.print(sb + " ");
        }
        System.out.println();

        // Clear list1
        list1.clear();

        System.out.println(" list one had been cleared  (( ");
        for (StringBuilder sb:list1) {
            System.out.print(sb + " ");
        }
        System.out.println();
    }
}
