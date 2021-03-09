package Lesson9;

public class Homework2 {
    int a = 1;
    static int b = 2;
    void abc(final int a){
        System.out.println(b);
        System.out.println(Homework2.b);
        System.out.println(this.a);
        System.out.println(a);
    }

    public static void main(String[] args) {
        Homework2 h = new Homework2();
        h.abc(3);
    }
}
