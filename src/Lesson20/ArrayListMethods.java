package Lesson20;

import Lesson7.A;

import java.util.ArrayList;

public class ArrayListMethods {
    public static void main(String[] args) {
        // ArrayList without specified type
        ArrayList arrayList1 = new ArrayList();
        arrayList1.add("one");
        arrayList1.add("two");
        arrayList1.add("thre");
        arrayList1.add("four");
        arrayList1.add("five");
        //foreach sycle with type Object
        for (Object o:arrayList1) {
            // declaring String type for Object 'o' working with arraylist1 and finding its length
            System.out.println("Number - '"+ o + "' had length = "+ ((String)o).length());
        }
    }
}
