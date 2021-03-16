package Lesson23;

public class EmployeTest {

    // public method 'abc' with return type Object - Object is parent for all types in Java
    public Object abc(){
        //inside method can return any type of object
        return new String("i can return any type of object");
    }

    public static void main(String[] args) {
        Doctor d = new Doctor();
        Teacher t = new Teacher();
        Driver dr = new Driver();
        Employee e = new Employee();

        //variable 'emp1' type Employee link to object type Doctor
        Employee emp1 = new Doctor();
        Employee emp2 = new Teacher();
        Employee emp3 = new Driver();
        // can't do vice versa
       // Driver d2 = new Employee();

        //print employe salary
        System.out.println(emp1.salary);
        //emp1 can't use method heal form child class
        //System.out.println(emp1.heal);
    }
}

// parrent class (or super class)
class Employee{
    double salary = 100;
    String name;
    int age;
    int experience;
    void eat(){System.out.println("m..mmmm");}
    void sleep(){System.out.println("h..rrrrr"); }
}
// child class extends=had all variables and methods of the parrent
class Doctor extends Lesson23.Employee {
    String specialization;
    void heal(){System.out.println("heal");}
}
// child class of Employee
class Teacher extends Lesson23.Employee {
    int amountOfStudents;
    void theach(){System.out.println("teach");}
}

class Driver extends Lesson23.Employee {
    String carPorpouse;
    void drive(){System.out.println("drr nn dn dnn");}
}
