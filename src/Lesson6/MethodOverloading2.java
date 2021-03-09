package Lesson6;

import com.sun.source.util.SourcePositions;

import java.net.SocketTimeoutException;

public class MethodOverloading2 {
    public int sum(int i1, int i2){
        return i1+i2;
    }
    protected String sum(String s1, String s2){
        return s1+s2;
    }
}
class MethodOverloadingTest2{
    public static void main(String[] args) {
        MethodOverloading2 m2 = new MethodOverloading2();
        int a = m2.sum(3,4);
        System.out.println("sum = " + a);
        System.out.println(m2.sum("hello ","my overloaded string"));
    }
}