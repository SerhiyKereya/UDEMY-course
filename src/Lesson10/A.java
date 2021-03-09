package Lesson10;

import Lesson9.*; // import all classes from package
import Lesson8.*;
//import static Lesson8.Student.count; // import one static variable
  import static Lesson8.Student.*; // import all static variable

import java.lang.*;// default statement it is always imported

public class A {
    static int count = 99;
    public static void main(String[] args) {
        java.lang.String str = new java.lang.String( "bla bla bla");

        //Student st1 = new Student(4, "Granny");
        //System.out.println(st1.course);
        System.out.println(Student.count); // use static variable from different package
        System.out.println(count); // by default use static variable from its own class
        System.out.println(testImport);
    }
}
