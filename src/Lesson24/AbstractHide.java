package Lesson24;

public class AbstractHide {
    public static void main(String[] args) {
        // for Abstract class can't create object
        // Figure f = new Figure();

        Figure f1 = new Square();
        // will show side quantity 0 from Figure compiletime binding
        System.out.println(f1.sideQuantity);
        // will show square area from runtime binding
        f1.area();
    }
}

// abstract class can't be 'final' becouse it can't be inherited
// abstract used for parrent class with some empty templates Methods
abstract class Figure{
    //abstract class had constructor as usual
    int sideQuantity = 0;
    //abstract Methods don't have body={}
    abstract void perimeter();
    abstract void area();
    // Method
    void showInfo(){System.out.println("This is figure");}
}

class Square extends Figure{
    int sideQuantity = 4;
    int side1 = 10;
    // child class should have all abstract methods
    public void perimeter(){
        System.out.println("Square perimeter - "+ 4*side1);
    }
    public  void area(){
        System.out.println("Square area - "+ side1*side1);
    }
}

class Rectangle extends Figure{
    int sideQuantity = 4;
    int side1 = 10;
    int side2 = 20;
    // child class should have all abstract methods
    public void perimeter(){
        System.out.println("Rectangle perimeter - "+ 2*side1+2*side2);
    }
    public  void area(){
        System.out.println("Rectangle area - "+ side1*side2);
    }
}