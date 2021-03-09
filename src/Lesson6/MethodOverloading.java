package Lesson6;

public class MethodOverloading {
    void show(int i1){
        System.out.println(i1);
    }
    void show(int a, int b){
        System.out.println(a);
        System.out.println("int b will wait for better times");
    }
    void  show(boolean b1){
        System.out.println(b1);
    }
    void show(String s1){
        System.out.println(s1);
    }
    void show(String s, int a){
        System.out.println("String: "+ s);
    }
}
class MethodOverloadingTest{
    public static void main(String[] args) {
        MethodOverloading m0 = new MethodOverloading();
        int a = 500;
        m0.show(a);
        boolean b = true;
        m0.show(b);
        String s = "stringi";
        m0.show(s);
        int i2 =12;
        m0.show(s,a);
    }
}