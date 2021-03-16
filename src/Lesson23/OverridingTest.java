package Lesson23;

public class OverridingTest {
    public static void main(String[] args) {
        Employee3 em = new Employee3();
        em.eat();
        //run overrided method
        Teacher3 t = new Teacher3();
        t.eat();
    }
}
class Food{}
class Fruits extends Food{}

class Employee3{
    double salary = 100;
    String name;
    int age;
    int experience;

    //method 'eat' return 'e' object from class 'Food'
    Food eat(){
        System.out.println("employee m..mmmm");
        Food e = new Food();
        return e;
    }
    void sleep(){System.out.println("h..rrrrr"); }
}

class Teacher3 extends Employee3 {
    int amountOfStudents;
    void theach(){System.out.println("teach");}
    //overrided method eat
    //method 'eat' return 'e' object from class 'Food'
    Food eat(){
        System.out.println("teacher uu..mmmm");
        Food e = new Food();
        return e;
    }}