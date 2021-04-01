package Lesson27;

public class Exception1 {
    public static void main(String[] args) {
        Animal ani = new Tiger(); // 'ani' will have 1-st priority variables from Animal and overridden methods from Tiger class
        System.out.println(ani.a); // will print variables from Animal class
        System.out.println(ani.b); // static 'b' from Animal class
        ani.abc(); //overridden method from Tiger class
        ani.def(); // it works - static parent method from Animal class
    }
}

class Animal{
    int a = 5;
    static int b = 10;
    void abc(){ System.out.println("non static metod 'abc' from class Animal");    }
    static void def(){ System.out.println("static metod 'abc' from class Animal");    }
}

class Tiger extends Animal{
    int a = 15;
    static int b = 20;
    void abc(){ System.out.println("non static metod 'abc' from class Tiger");    }
    static void def(){ System.out.println("static metod 'abc' from class Tiger");    }
}