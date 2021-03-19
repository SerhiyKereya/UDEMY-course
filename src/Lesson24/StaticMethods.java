package Lesson24;

public class StaticMethods implements A{
    public static void main(String[] args) {
        StaticMethods sm = new StaticMethods();
        // sm.abc(); can't call static interface method this way

        // to use static method call use interface directly
        A.abc();
    }
}

interface A{
    static void abc(){
        System.out.println("this is static method");
    };

}
