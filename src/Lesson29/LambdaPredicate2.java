package Lesson29;

import java.util.ArrayList;
import java.util.function.Predicate;

public class LambdaPredicate2 {
}

class StudentP2{
    String name;
    char sex;
    int age;
    int course;
    double avgGrade;
    //class constructor
    StudentP2(String name, char sex, int age,int course,double avgGrade){
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
    }
}

class StudentInformation3{
    //method printStudent data
    void printStudent(StudentP2 st){
        System.out.println("Student name: "+ st.name+ ", sex: "+st.sex+", age: "+ st.age+", course: "+ st.course+", avarage grade: "+st.avgGrade);
    }

    //method with students arrayList parameter, and interface Predicate with StudentP2 parameter
    void testAndPrintStudents(ArrayList<StudentP2> StudentP2ArrayList, Predicate<StudentP2> t){
        for (StudentP2 s: StudentP2ArrayList) { // till we had students 's' in StudentP2ArrayList
            if (t.test(s)){ // Predicate interface had one method 'test' can return .... for student 's' (...)
                printStudent(s);
            }
        }
    }

    public static void main(String[] args) {
        ArrayList <StudentP2> list = new ArrayList<>();
        StudentP2 st1 = new StudentP2("Mukola", 'm',22,3,8.5); // for char use 'm' not "m"
        StudentP2 st2 = new StudentP2("Dmutro", 'm',19,2,6);
        StudentP2 st3 = new StudentP2("Ivanka", 'f',20,2,7.5);
        StudentP2 st4 = new StudentP2("Vasul", 'm',25,4,7);
        StudentP2 st5 = new StudentP2("Petro", 'm',40,1,5);
        // add students to array list
        list.add(st1);
        list.add(st2);
        list.add(st3);
        list.add(st4);
        list.add(st5);

        //CREATE OBJECT for class StudentInformation3
        StudentInformation3 sti = new StudentInformation3();

        for (StudentP2 s: list) {
            System.out.println(s.name); // print all students names
        }
        //LAMBDA expression
        System.out.println("-----------------------------------");
        list.removeIf(x->x.name.endsWith("a")); //'x' is a Student -> method body x.name.endsWith("a") // if its true remove it from 'list'
        for (StudentP2 s: list) {
            System.out.println(s.name); // print all students names
        }

    }
}
