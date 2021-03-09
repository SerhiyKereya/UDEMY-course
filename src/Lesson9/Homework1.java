package Lesson9;

public class Homework1 {
    int a;
    public static void main(String[] args) {
        Homework1 h1 = new Homework1();
        h1.a = 10;
        Homework1 h2 = new Homework1();
        Homework1 h3 = new Homework1();
        Homework1 h4 = new Homework1();
        Homework1 h5 = new Homework1();
        Homework1 h6 = new Homework1();
        Homework1 h7 = new Homework1();
        h7.a = 7;
        Homework1 h8 = new Homework1();
        h1=h2=h3=h4=h5=h6 = null;

        //System.out.println(h1.a);
        System.out.println(h7.a);

    }
}
