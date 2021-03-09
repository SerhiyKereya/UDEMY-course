package Lesson5;

public class Employee {
    Employee(int id, String surname, int age, double salary, String department){ // class constructor
        surnameEm = surname;
        salaryEm = salary;
        departmentEm = department;
    }
    int idEm; //class variables
    String surnameEm;
    String departmentEm;
    double salaryEm;

    double increaseSalaryTwice(){ //class method
        salaryEm *=2;
        return salaryEm;
    }
}
class EmployeeTest{
    public static void main(String[] args) {
        Employee trainy = new Employee(1,"Trainy",25,500,"IT");
        Employee junior = new Employee(2,"Junior",26,800,"IT");
        trainy.increaseSalaryTwice();
        junior.increaseSalaryTwice();
        System.out.println("Employee: " + trainy.surnameEm + " salary: "+ trainy.salaryEm+ " department: " + trainy.departmentEm);
        System.out.println("Employee: " + junior.surnameEm + " salary: "+ junior.salaryEm+ " department: " + junior.departmentEm);
    }
}
