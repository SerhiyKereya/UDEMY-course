package Lesson29;

import java.util.ArrayList;

public class LambdaStudent {
}

class Student3{
    String name;
    char sex;
    int age;
    int course;
    double avgGrade;
    //class constructor
    Student3(String name, char sex, int age,int course,double avgGrade){
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
    }
}

class StudentInformation{
    //method printStudent data
    void printStudent(Student3 st){
        System.out.println("Student name: "+ st.name+ ", sex: "+st.sex+", age: "+ st.age+", course: "+ st.course+", avarage grade: "+st.avgGrade);
    }

    //method with students arrayList parameter, and interface StudentChecksInterface parameter
    void testAndPrintStudents(ArrayList<Student3> Student3ArrayList, StudentChecksInterface sc){
        for (Student3 s: Student3ArrayList) { // till we had students 's' in Student3ArrayList
            if (sc.testStudent(s)){ // boolean method 'testStudents' can return true or false only. for student 's' (true when s.avgGrade > 8)
                printStudent(s);
            }
        }
    }

    public static void main(String[] args) {
        ArrayList <Student3> list = new ArrayList<>();
        Student3 st1 = new Student3("Mukola", 'm',22,3,8.5); // for char use 'm' not "m"
        Student3 st2 = new Student3("Dmutro", 'm',19,2,6);
        Student3 st3 = new Student3("Ivanka", 'f',20,2,7.5);
        Student3 st4 = new Student3("Vasul", 'm',25,4,7);
        Student3 st5 = new Student3("Petro", 'm',40,1,5);
        // add students to array list
        list.add(st1);
        list.add(st2);
        list.add(st3);
        list.add(st4);
        list.add(st5);

        //CREATE OBJECT for class StudentInformation
        StudentInformation sti = new StudentInformation();

        // run method with parameters arrayList 'list' of students,
        // and LAMBDA Expression parameter interface StudentChecksInterface will implement method -> 'testStudent'
        // 'testStudent' can return true if student object st.avgGrade >7
        sti.testAndPrintStudents(list, (Student3 st) -> {return st.avgGrade > 7;}); //LAMBDA expression only for intefaces with one method
        System.out.println("-----------------------------");
        sti.testAndPrintStudents(list, (Student3 st) -> {return st.sex =='f';}); // LAMBDA allow to use method 'testStudent' instead of parametr
        System.out.println("-----------------------------");
        sti.testAndPrintStudents(list,(Student3 st) -> {return st.course <2;}); // LAMBDA expression
        System.out.println("-----------------------------");
        sti.testAndPrintStudents(list,(Student3 st) -> {return st.age > 19 && st.course<4;}); // LAMBDA expression
    }
}

interface StudentChecksInterface{
    //method
    boolean testStudent(Student3 s);
}