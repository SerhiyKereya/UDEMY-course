package Lesson29;

import java.util.ArrayList;

public class NotLambdaStudents2 {
}

class Student2{
    String name;
    char sex;
    int age;
    int course;
    double avgGrade;
    //class constructor
    Student2(String name, char sex, int age,int course,double avgGrade){
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
    }
}

class StudentInfo2{
    //method printStudent data
    void printStudent(Student2 st){
        System.out.println("Student name: "+ st.name+ ", sex: "+st.sex+", age: "+ st.age+", course: "+ st.course+", avarage grade: "+st.avgGrade);
    }

    //method with students arrayList parameter, and interface StudentChecks parameter
    void testAndPrintStudents(ArrayList<Student2> student2ArrayList, StudentChecks sc){
        for (Student2 s: student2ArrayList) { // till we had students 's' in student2ArrayList
            if (sc.testStudent(s)){ // boolean method testStudents can return true or false only. for student 's' (true when s.avgGrade > 8)
                printStudent(s);
            }
        }
    }


    public static void main(String[] args) {
        ArrayList <Student2> list = new ArrayList<>();
        Student2 st1 = new Student2("Mukola", 'm',22,3,8.5); // for char use 'm' not "m"
        Student2 st2 = new Student2("Dmutro", 'm',19,2,6);
        Student2 st3 = new Student2("Ivanka", 'f',20,2,7.5);
        Student2 st4 = new Student2("Vasul", 'm',25,4,7);
        Student2 st5 = new Student2("Petro", 'm',40,1,5);
        // add students to array list
        list.add(st1);
        list.add(st2);
        list.add(st3);
        list.add(st4);
        list.add(st5);

        //CREATE OBJECT for class StudentInfo2
        StudentInfo2 sti = new StudentInfo2();
        // create object for class that implement interface
        FindStudentsOverGrade fsog = new FindStudentsOverGrade();
        FindStudentsUnderGrade fsug = new FindStudentsUnderGrade();
        FindStudentsBySex fsbs = new FindStudentsBySex();

        // run method
        sti.testAndPrintStudents(list, fsog); // arrayList 'list' of students, interface FindStudentsOverGrade will filter over 8
        System.out.println("-----------------------------");
        sti.testAndPrintStudents(list,fsug);
        System.out.println("-----------------------------");
        sti.testAndPrintStudents(list,fsbs);
    }
}

interface StudentChecks{
    //method
    boolean testStudent(Student2 s);
}

class FindStudentsOverGrade implements  StudentChecks{
    //override interface method as public
    public boolean testStudent(Student2 s){
        return s.avgGrade > 8; //
    }
}

class FindStudentsUnderGrade implements  StudentChecks{
    //override interface method as public
    public boolean testStudent(Student2 s){
        return s.avgGrade < 7; //
    }
}

class FindStudentsBySex implements  StudentChecks{
    //override interface method as public
    public boolean testStudent(Student2 s){
        return s.sex == 'f'; //
    }
}