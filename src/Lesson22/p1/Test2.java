package Lesson22.p1;

import Lesson22.HumanEncapsulation; // import class

public class Test2 {
    public static void main(String[] args) {
        // create object using constructor HumanIncapsulation
        HumanEncapsulation h = new HumanEncapsulation("male");
        h.setName("Petro");
        h.setAge(2300);
        h.setVeight(-75);

        System.out.println(h.getName());
        System.out.println(h.getAge());
        System.out.println(h.getVeight());
    }
}
