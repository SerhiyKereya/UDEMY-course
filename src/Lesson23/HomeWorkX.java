package Lesson23;

public class HomeWorkX {
    //overloaded constructor
    public HomeWorkX(){        System.out.println("X"); }
    public HomeWorkX(int i){        System.out.println("X"+i);    }

    private boolean abc(){return false;}

    public static void main(String[] args) {
        //class HomeWorkY constructor will print first superclass then child HomeWorkY
        HomeWorkX x = new HomeWorkY(18);

        // print privat method becouse class X object trigger method
        System.out.println(x.abc());
    }
}

class HomeWorkY extends HomeWorkX{
    //overrided constructor
    public HomeWorkY(int i){        System.out.println("Y");    }
    //overrided method - can't override privat 'abc'
    public boolean abc(){return true;}
}
