package Lesson22;

public class Human2 {

    //constructor
    Human2(String n, String s){
        this.name = n; // this object name apply constructor n
        this.surname = s;
    }

    //overloaded constructor
    Human2(String n){
        name = n;
    }

    String name;
    String surname;
}

class Student2 extends Human2{
    //default constructor for class Student2
    Student2() {
        this(5);
        System.out.println("Hello");
    }

    // overloaded constructor
    Student2(int i){
        super("Petro"); //default constructor for parrent=super class
    }

    public static void main(String[] args) {
        Student2 s = new Student2();
    }
}