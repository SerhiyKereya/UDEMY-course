package Lesson7;

public class SecondClass {
    public static void main(String[] args) {
        Employee emp3 = new Employee(300);
        System.out.println("Emp3 surname - " + emp3.surname);
        System.out.println("Emp3 ID - " + emp3.id);
        emp3.twiceSalary();
        emp3.showID();
        emp3.showSurname();
    }
}
