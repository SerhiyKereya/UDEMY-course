package Lesson11;

public class Employee {
    public String name;
    public double salary;
    Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
    }
    public double multiply(double a){
        a = a * 2;
        return a;
    }
    public double twoSalaries(){
        salary = salary*2;
        return salary;
    }
}
class EmployeeTest{
    public static void main(String[] args) {
        Employee emp1 = new Employee("Vasyl",100.55);
        double d = emp1.multiply(emp1.salary);
        System.out.println("new salary is - "+ d);
        System.out.println("old salary - "+ emp1.salary);
        emp1.twoSalaries();
        System.out.println("two salaries will be "+ emp1.salary);
    }
}
