package Lesson25;

public class Polymorfizm1 {
    public static void main(String[] args) {
        Employee emp1 = new Teacher(); // object type Employee with methods from class Teacher
        Employee emp2 = new Driver();
        Employee emp3 = new Doctor();
        Employee [] array2 = {emp1, emp2, emp3}; // array

        for (Employee emp:array2) { // untill array2 each time emp = emp1, next cicle emp = emp2, next emp = (array2[i])
            emp.work();
        }

        emp1.work(); // overrided method work from Teacher
        emp2.work();
        emp3.work();
    }
}

abstract class Employee{
    void sleep(){ System.out.println("Employee sleps");    }
    abstract void work();
}

class Teacher extends Employee{
    void work(){ System.out.println("Teacher works"); }
}
class Driver extends Employee{
    void work(){ System.out.println("Driver works"); }
}
class Doctor extends Employee{
    void work(){ System.out.println("Doctor works"); }
}
