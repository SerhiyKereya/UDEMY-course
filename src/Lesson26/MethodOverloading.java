package Lesson26;

public class MethodOverloading {
    MethodOverloading(){
        System.out.println("this is constructor **default");
    }
    MethodOverloading(int a, int b){
        this(); // run overloaded **default constructor
        System.out.println("this is constructor 2");
    }


    // initializer block
    {
        System.out.println("this is initializer block");
    }
    //init block 2
    {
        System.out.println("init block 2 " + "------------------------------");
    }
    // static = runs only one time initializer block
    static {
        System.out.println("this is STATIC= runs one time initializer block");
    }
    //void ghi(int a, int b){ System.out.println("Hello 1");    }
//    void ghi(long a, long b){ System.out.println("Hello 2");    }
   // void ghi(Integer a, Integer b){ System.out.println("Hello 3");    }
    void ghi(int ... a){ System.out.println("Hello 4");    } // var Args of int a

    public static void main(String[] args) {
        MethodOverloading m1 = new MethodOverloading();
        MethodOverloading m2 = new MethodOverloading(3,4);

        m1.ghi(1,2); // by default work as int
    }

}
