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

        for (Employee e:array2) {
            if (e instanceof Driver){ // if Employee type object 'e' has relation to Driver
                System.out.println(((Driver) e).carBrend); // cast Driver methods variable to Employee type Object 'e'
            }
        }
        emp1.work(); // overrided method work from Teacher
        emp2.work();
        emp3.work();

        System.out.println(emp1 instanceof Employee);
        System.out.println(emp1 instanceof Teacher);
        System.out.println(emp1 instanceof Driver); // check if object emp1 belongs to class Driver no - false
        System.out.println(emp1 instanceof Help_Able); // check if object emp1 belongs to interface Help_Able
        String s1 = null;
        System.out.println(s1 instanceof String); //=false s1 is null, null is not a String
        System.out.println(array2 instanceof Object); // true
        System.out.println(emp1 instanceof Object); // true Object is parent for all Objects
    }
}

abstract class Employee{
    void sleep(){ System.out.println("Employee sleps");    }
    abstract void work();
}

class Teacher extends Employee implements Help_Able{
    void work(){ System.out.println("Teacher works"); }
    public void help(){System.out.println("Teacher helps");}
}
class Driver extends Employee{
    String carBrend = "Luxury";
    void work(){ System.out.println("Driver works"); }
}
class Doctor extends Employee{
    void work(){ System.out.println("Doctor works"); }
}
interface Help_Able{
    void help();
}