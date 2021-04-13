package Lesson31_Generics;

public class ParametrizedClass {
    public static void main(String[] args) {
        Info str1 = new Info("some code to see"); //
        Info <String> str2 = new Info<>("stringggg");
        System.out.println(str1+" ok "+str2);

        String s = str2.getValue1();

        Info i = new Info(35); // Info parameter type 'T' became int
        Info<Integer> i2 = new Info<>(5);
        System.out.println(i+ " and "+i2);

        Integer in = i2.getValue1();
    }

    // problem with Generics method overloading
//    public void abc(Info<String> info){
//        String s = info.getValue1();
//    }
//    public void abc(Info<Integer> info){
//        Integer in = info.getValue1();
//    }
}

// class with type T - unspecified (type place holder)
class Info <T> {
    private T value1; // variable value1 with type T - later could have many types

    // class constructor
    public Info(T value1){
        this.value1 = value1;
    }

    //overriding default toString method
    public String toString(){
        return "{( " +value1+ " )}";
    }

    //method getValue1 T - unspecified (type T place holder)
    public T getValue1(){
        return value1;
    }
}

//Problem with class method(with Generics) overriding
//class Parent {
//    public void abc(Info<String> info){
//        String s = info.getValue1();
//    }
//}
//
//class Child extends Parent{
//    public void abc(Info<Integer> info){
//        `Integer i = info.getValue1();
//    }
//}