package Lesson25;

public class Casting {
    public static void main(String[] args) {
        Employee2 emp1 = new Teacher2(); // object type Employee with methods from class Teacher
        Employee2 emp2 = new Driver2();
        Employee2 emp3 = new Doctor2();

        Doctor2 d2 = (Doctor2)emp3; // casting to be able to add Doctor2 Data type 'specialization' String to object Employee2
        System.out.println(d2.specialization);
        d2.heal();
        System.out.println(((Teacher2)emp1).task); // casting to be able to add 'task' to Object Employee2 emp1= fell like a Teacher2

        Help_Able2 h = new Teacher2(); // object 'h' type Help_Able interface
        h.help();
        ((Teacher2)h).work(); //cast Teacher2 to 'h' in order to run method 'work' wich is not in interface Help_Able2 // DownCasting
    }
}

class Employee2{
    void sleep(){ System.out.println("Employee sleps");    }
}
class Doctor2 extends Employee2{
    String specialization = "Surgery";
    void heal(){ System.out.println("Doctor works"); }
}
class Teacher2 extends Employee2 implements Help_Able2{
    String task = "math";
    void work(){ System.out.println("Teacher works"); }
    public void help(){System.out.println("Teacher helps");}
}
class Driver2 extends Employee2{
    void work(){ System.out.println("Driver works"); }
}

interface Help_Able2{
    void help();
}
