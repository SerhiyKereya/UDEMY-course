package Lesson29;

import java.util.ArrayList;
import java.util.function.Predicate;

public class HomeWork29 {
}

class Employee{
    String name;
    String department;
    double salary;
    //class constructor
    Employee(String name, String department,double salary){
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
}

class EmployeeInformation2{
    //method printEmployee data
    void printEmployee(Employee em){
        System.out.println("Employee name: "+ em.name+ ", department: "+em.department+", salary: "+ em.salary);
    }

    //method with students arrayList parameter, and interface Predicate with Employee parameter 't'
    void filteringEmployees(ArrayList<Employee> EmployeeArrayList, Predicate<Employee> t){
        for (Employee s: EmployeeArrayList) { // till we had students 's' in EmployeeArrayList
            if (t.test(s)){ // Predicate interface had one method 'test' can return .... for student 's' (...)
                printEmployee(s);
            }
        }
    }

    public static void main(String[] args) {
        ArrayList <Employee> list = new ArrayList<>();
        Employee em1 = new Employee("Mukola", "market",22000); // for char use 'm' not "m"
        Employee em2 = new Employee("Dmutro", "market",9000);
        Employee em3 = new Employee("Ivanka", "Ivanka",2000.5);
        Employee em4 = new Employee("Dr. Vasul", "dev",2500);
        Employee em5 = new Employee("Petro", "dev",4000);
        // add employees to array list
        list.add(em1);
        list.add(em2);
        list.add(em3);
        list.add(em4);
        list.add(em5);

        //CREATE OBJECT for class EmployeeInformation2
        EmployeeInformation2 emi = new EmployeeInformation2();

        // run method with parameters arrayList 'list' of students,
        // and LAMBDA Expression parameter interface Predicate will implement method -> 'filteringEmployees'
        // 'filteringEmployees' can return true if employee object em.department == "dev"
        System.out.println("Empoloyees from Development department");
        emi.filteringEmployees(list, (Employee em) -> {return em.department == "dev" && em.salary<4000;}); //LAMBDA expression only for interfaces with one method
        System.out.println("-----------------------------");
        emi.filteringEmployees(list, em -> {return em.name.startsWith("D") && em.salary!=2500;}); // LAMBDA expression can automatically apply object type 'Employee'
        System.out.println("-----Name same as Department ----------------------------");
        emi.filteringEmployees(list,(Employee t) -> {return t.name.endsWith(t.department);}); // LAMBDA expression allow to use method 'testEmployees' instead of parameter
        System.out.println("-----------------------------");
        emi.filteringEmployees(list,(Employee t) -> {return t.department == "dev" && t.salary <4000;}); // LAMBDA arrow(->) divide method parameter -> method body
    }
}

