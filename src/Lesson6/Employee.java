package Lesson6;

import com.sun.source.util.SourcePositions;

public class Employee {
    //'this' allow to use biggest constructor3 with default values for unused variables
    Employee(String surname0){
        this(0, surname0, null, 0, 0.0);
    }
    public Employee(int id1, String surname1, String department1, double salary1){
        //'this' allow to use inside constructor1 call for overloaded constructor2
        this(id1,surname1);
        departmentEm=department1;
        salaryEm=salary1;
    }
    protected Employee(int id2, String surname2){
        idEm=id2;
        surnameEm=surname2;
    }
    public Employee(int id3, String surname3, String department3,int age3, double salary3){
        //'this' allow to use inside constructor3 call for overloaded constructor1
        this(id3,surname3,department3,salary3);
        ageEm=age3;
    }

    int idEm; //class variables
    String surnameEm;
    String departmentEm;
    int ageEm;
    double salaryEm;
}
class EmployeeTest {
    public static void main(String[] args) {
        Employee emp0 = new Employee("Mamba");
        System.out.println(emp0.surnameEm);
        Employee emp1 = new Employee(7, "Bond", "MI6", 777);
        System.out.println(emp1.surnameEm);
        Employee emp2 = new Employee(1, "McDonald");
        System.out.println(emp2.surnameEm + " " +emp2.departmentEm);
        Employee emp3 = new Employee(2, "Tesla", " resaurch ",35,1000);
        System.out.println(emp3.surnameEm + emp3.departmentEm + emp3.salaryEm);
    }
}