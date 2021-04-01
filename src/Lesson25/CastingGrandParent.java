package Lesson25;

public class CastingGrandParent {
    public static void main(String[] args) {
        Test30 t3 = new Test30();
        System.out.println(((Test10)t3).a); // casting GrandParent variable 't3' from class Test10 to class Test30

        ((Test10)t3).abc(); // casting will NOT work, will work method abc from Test30
    }
}

class Test10{
    int a = 5;
    void abc(){ System.out.println("ok1");    }
}

class Test20 extends Test10{
    int a = 10;
    void abc(){ System.out.println("ok2");    }
}

class Test30 extends Test20{
    int a = 15;
    void abc(){ System.out.println("ok3");    }
}