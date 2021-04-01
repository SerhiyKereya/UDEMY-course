package Lesson27;

public class CastingException {
    public static void main(String[] args) {
        Doctor d = new Doctor();
        Teacher t = new Teacher();
        Employee [] array1 = {d,t}; // array of Employee class objects
        Teacher t2 = (Teacher)array1[0]; // trying appoint to t2 value of array1[0] casted to Teacher class
    }
}
class Employee{}
class Doctor extends Employee{}
class Teacher extends Employee{}
