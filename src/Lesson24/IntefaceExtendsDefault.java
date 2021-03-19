package Lesson24;

public class IntefaceExtendsDefault {
    public static void main(String[] args) {
        Z z = new Z();
        z.abc();
        z.def();
        z.def2();
    }
}

interface I1{ void abc();}
// interface can extend other interface it will use methods from it
interface  I2 extends I1{void cde();}

interface D1 {
    void abc(); // interface mathods always public
    // default method should have body
    default void def(){ System.out.println("this is default method"); }
    default void def2(){System.out.println("this is one more default method");}
}

class Z implements D1{
    @Override
    public void abc() { System.out.println("override interface method"); }

    @Override // default method can be overriden
    public void def() { System.out.println("ouch"); }
}