package Lesson23;

class X{}
class Y extends X{}

public class HomeWork4 {
    //method abc
    public static void abc(X x, Y y){
        System.out.println("Hello");
    }
    //overloaded method abc
    public static void abc(Y y, X x){
        System.out.println("By");
    }

    public static void main(String[] args) {
        Y a = new Y();
        // you should specify what method to run
        abc((X)a,  a);
    }
}
