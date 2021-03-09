package Lesson8;

public class Test1 {
    public final int a;
    Test1 (){
        a = 5;
    }
    Test1(boolean b){
        a = 10;
    }
    public static void main(String[] args) {
        Test1 t = new Test1(true);
        //t.a = t.a * 2;
        System.out.println(t.a);
    }
}
