package Lesson22;

public class Inheritage {
    public static void main(String[] args) {
        // create new object 'doc' using class Doctor
        Doctor doc = new Doctor();
        doc.name="Petro"; // class Doctor object Doc can use Employee atributes
        doc.age=50;
        doc.experience=25;
        doc.heal();
        doc.sleep();
    }
}

// parrent class (or super class)
class Employee{
    String name;
    int age;
    int experience;
    void eat(){System.out.println("m..mmmm");}
    void sleep(){System.out.println("h..rrrrr"); }
}
// child class extends=had all variables and methods of the parrent
class Doctor extends Employee{
    String specialization;
    void heal(){System.out.println("heal");}
}
// child class of Employee
class Teacher extends Employee{
    int amountOfStudents;
    void theach(){System.out.println("teach");}
}

class Driver extends Employee{
    String carPorpouse;
    void drive(){System.out.println("drr nn dn dnn");}
}