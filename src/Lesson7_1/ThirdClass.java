package Lesson7_1;

import Lesson7.Employee;

public class ThirdClass {
    public static void main(String[] args) {
        Lesson7.Employee emp4 = new Lesson7.Employee(400);
        System.out.println("Emp4 surname - " + emp4.surname);
        emp4.twiceSalary();
        emp4.showID();
        emp4.showSurname();
    }
}
