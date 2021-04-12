package Lesson31Generics;

public class ParametrizedClass {
    public static void main(String[] args) {
        Info str = new Info("some code to see"); //
        Info <String> str2 = new Info<>("stringggg");
        System.out.println(str+" ok "+str2);

        Info i = new Info(35); // Info parameter type 'T' became int
        Info<Integer> i2 = new Info<>(5);
        System.out.println(i+ " and "+i2);
    }
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
}