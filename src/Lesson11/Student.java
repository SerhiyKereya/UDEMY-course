package Lesson11;

public class Student {

    String name;
    int course;
    double grade;

    Student(String name, int course, double grade){
        this.name = name;
        this.course = course;
        this.grade = grade;
    }

    public static void swap(Student s1, Student s2){
        Student s3 = s1;
        s1 = s2;
        s2 = s3;
    }
    public static void changeName(Student s1){
        s1.name = "Pit";
    }

    public static void main(String[] args) {
        Student st1 = new Student("Petro", 4,9.9);
        Student st2 = new Student("Ivanka", 2,8);
        System.out.println("before swap st1 name - "+ st1.name);
        swap(st1, st2);
        System.out.println("after swap st1 name - "+st1.name);
        changeName(st1);
        System.out.println("after change name - "+ st1.name);
    }


}
