package Lesson10.p4;

// import class A object elements
import Lesson10.p1.A1;
// for B
import Lesson10.p1.p2.B;
import static Lesson10.p1.p2.B.*;
// for C
import Lesson10.p1.p2.p3.C;
// for E
import Lesson10.p4.p5.E;


public class D {
    public static void main(String[] args) {
        //use A1
        A1 testA1 = new A1();
        testA1.a1Int1();
        C testC = new C();
        System.out.println("Variable from class C = "+testC.cInt1);
        E testE = new E();
        System.out.println("Variable from class E = "+ testE.eInt1);
        //print static variable from class B
        System.out.println("static variable from class B = "+ in1 +" "+ str1);
    }
}
