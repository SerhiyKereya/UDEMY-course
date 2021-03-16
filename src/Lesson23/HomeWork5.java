package Lesson23;

class X5{
    String s1 = "Hello";
}
class Y5 extends X5{
    boolean bool = false;
}

public class HomeWork5 {
    public static void main(String[] args) {
        X5 x = new Y5();
        //object x from class X5 don't have variable bool
        //System.out.println(x.s1 +" "+ x.bool);
    }
}
