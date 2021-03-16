package Lesson22;

//parrent super class
public class Human {
    /*//class constructor input parameter n - name
    public Human(String n){
        name = n;
    }*/
    public String name;
    public static int salary = 150;
    //method work
    public void work(){
        System.out.println("hard job");
    }
    //method rest
    public static void rest(){
        System.out.println("relax and enjoy");
    }
}
// child class
class Student extends Human{
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s.name);
        System.out.println(Student.salary);
        s.work();
        Student.rest();
    }
}