package Lesson27;

public class ErrorRecursive {
    static void abc(){ // endless method
        System.out.println("abc working");
        abc();
    }

    public static void main(String[] args) {
        abc();
    }
}
