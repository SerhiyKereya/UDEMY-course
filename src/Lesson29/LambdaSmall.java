package Lesson29;

public class LambdaSmall {
    static void def(Test5 t){                  //method 'def' with parameter 'Test5' interface t
        System.out.println(t.abc("Hello")); //object 't' use interface method 'abc'
    }

    public static void main(String[] args) {
        def(x -> x.length());  //LAMBDA method 'def' use as parameter interface object 'x' which is String and apply to it method x.length
    }
}

interface Test5 {
    int abc (String s); // interface method
}