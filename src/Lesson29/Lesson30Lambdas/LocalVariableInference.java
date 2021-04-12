package Lesson29.Lesson30Lambdas;

import java.util.ArrayList;

public class LocalVariableInference {
    public static void main(String[] args) {
        TestInferenceType tit = new TestInferenceType();
        var tit2 = new TestInferenceType(); // var = TestInferenceType, so during compilation will be changeged to class TestInferenceType

        var i = 10; // during compilation will be chsnged to int
        var w = 1.5f; // during compilation will be changed to float
        var array = new String[]{"a", "b"}; // during compilation will be changed to ArrayList

        Object obj1 = "Hello";
        var obj2 = obj1; // inference type will apply Object type

        ArrayList<String > a1 = new ArrayList<>();
        for (var s: a1) {System.out.println(s); } // can use 'var' in foreach loop compiler will change it to ArrayList

        var result = abc(); // result will be double format
    }
    //method
    static double abc(){return 3.14;} // var can't be used in  method statement it should be double, int float ...
}

class TestInferenceType{
}

// functional interface - can have only one functional method
interface I {
    void abc(); // one abstract functional method

    default void def(){}; // but can cave any amount default and static methods
    static void def2(){};
}
