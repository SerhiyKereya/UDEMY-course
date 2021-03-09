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
        s1.name = s2.name;
        s2.name = s3.name;
    }
    public static void changeName(Student s1){
        s1.name = "Pit";
    }
    public static void main(String[] args) {
        Student st1 = new Student("Petro", 4,8);
        Student st2 = new Student("Petro", 5,8); //Ivanka
        System.out.println("before swap st1 name - "+ st1.name);
       // swap(st1, st2);
        System.out.println("after swap st1 name - "+st1.name);
        //changeName(st1);
        System.out.println("after change st1 name - "+ st1.name);
        //homeWork
        StudentTest.compareStudents(st1,st2);
        StudentTest.showStudentDifference(st1, st2);
    }
}
class StudentTest{

    public static void compareStudents(Student s1, Student s2){
        if (s1.name.equals(s2.name) && s1.course==s2.course && s1.grade == s2.grade){
            System.out.println("Student s1 equals to s2");
        }
        else {
            System.out.println("Student st1 not equals to st2");
        }
    }

    static void showStudentDifference(Student s1, Student s2){
        if (s1.name.equals(s2.name) && s1.course == s2.course && s1.grade == s2.grade){
            System.out.println("Student st1 had same Name, course and grade as st2");
        }
        else if (s1.name.equals(s2.name) && s1.course == s2.course && s1.grade != s2.grade) {
            System.out.println("Student st1 had same name and same course as st2, but different grade ");
        }
        else if (s1.name.equals(s2.name) && s1.course != s2.course && s1.grade != s2.grade){
            System.out.println("Student st1 had same name as st2, but different course and grade");
        }
        else if (s1.name.equals(s2.name) && s1.course != s2.course && s1.grade == s2.grade){
            System.out.println("Studeent st1 had same name and grade as st2, but different course");
        }
        else if (s1.name != s2.name && s1.course == s2.course && s1.grade != s2.grade){
            System.out.println("Student st1 had same course as st2, and different name and grade");
        }
        else if (s1.name != s2.name && s1.course != s2.course && s1.grade == s2.grade){
            System.out.println("Student st1 had same grade, and different name and course");
        }
        else {
            System.out.println("Student st1 had different name course and grade");
        }
    }
}
