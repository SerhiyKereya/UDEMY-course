package Lesson27;

public class ErrorRecursive {
    static void abc(){
        System.out.println("abc working");
        abc();
    }

    public static void main(String[] args) {
        abc();
    }
}
