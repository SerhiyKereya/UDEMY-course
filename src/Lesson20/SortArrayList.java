package Lesson20;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class SortArrayList {
    public static void main(String[] args) {
        String s1 = "A";
        String s2 = "B";
        String s3 = "C";
        String s4 = "D";
        ArrayList<String> list1 = new ArrayList<>();
        list1.add(s2);
        list1.add(s1);
        list1.add(s4);
        list1.add(s3);
        System.out.println(list1);

        // sort ArrayList list1
        Collections.sort(list1);
        System.out.println(list1);

        // equals compare Arraylists
        ArrayList<String> list2 = list1;
        System.out.println(list2.equals(list1));

        //iterator go through all list iterations
        Iterator<String> it = list1.iterator();
        while (it.hasNext()){
            System.out.println("iteator print - "+ it.next());
        }
    }
}
