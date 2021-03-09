package Lesson7;

public class Employee {
    private double salary;
    public String surname;
    int id;

    public void twiceSalary(){
         double result = salary*2;
        System.out.println("twice salary - " + result);
    }
    public void showSurname(){
        System.out.println("Surname - "+surname);
    }
    public void showID(){
        System.out.println("ID - "+ id);
    }

    public Employee(double salary2){
        salary = salary2;
    }
    Employee(String surname2){
        surname = surname2;
    }
    private Employee(double salary3, int id3){
        salary = salary3;
        id = id3;
    }

    public static void main(String[] args) {
        Employee emp0 = new Employee(10,2);
        System.out.println("Emp0 salary - " + emp0.salary);
        System.out.println("Emp0 surname - " + emp0.surname);
        System.out.println("Emp0 ID - " + emp0.id);
        emp0.twiceSalary();
        emp0.showSurname();
        emp0.showID();
    }
}
class EmployeeTest {
    public static void main(String[] args) {
        Employee emp1 = new Employee(100);
        System.out.println("Emp1 surname - " + emp1.surname);
        System.out.println("Emp1 ID - " + emp1.id);
        emp1.twiceSalary();
        emp1.showID();
        emp1.showSurname();
        //

        Employee emp2 = new Employee("Worker");
        System.out.println("Emp2 surname - " + emp2.surname);
        System.out.println("Emp2 ID - " + emp2.id);
        emp2.twiceSalary();
        emp2.showID();
        emp2.showSurname();
    }
}
