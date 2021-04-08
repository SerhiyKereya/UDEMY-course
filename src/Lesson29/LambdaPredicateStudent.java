package Lesson29;

import java.util.ArrayList;
import java.util.function.Predicate; // interface Predicate

public class LambdaPredicateStudent {
}

class StudentP{
    String name;
    char sex;
    int age;
    int course;
    double avgGrade;
    //class constructor
    StudentP(String name, char sex, int age,int course,double avgGrade){
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
    }
}

class StudentInformation2{
    //method printStudent data
    void printStudent(StudentP st){
        System.out.println("Student name: "+ st.name+ ", sex: "+st.sex+", age: "+ st.age+", course: "+ st.course+", avarage grade: "+st.avgGrade);
    }

    //method with students arrayList parameter, and interface Predicate with StudentP parameter
    void testAndPrintStudents(ArrayList<StudentP> StudentPArrayList, Predicate<StudentP> t){
        for (StudentP s: StudentPArrayList) { // till we had students 's' in StudentPArrayList
            if (t.test(s)){ // Predicate interface had one method 'test' can return .... for student 's' (...)
                printStudent(s);
            }
        }
    }

    public static void main(String[] args) {
        ArrayList <StudentP> list = new ArrayList<>();
        StudentP st1 = new StudentP("Mukola", 'm',22,3,8.5); // for char use 'm' not "m"
        StudentP st2 = new StudentP("Dmutro", 'm',19,2,6);
        StudentP st3 = new StudentP("Ivanka", 'f',20,2,7.5);
        StudentP st4 = new StudentP("Vasul", 'm',25,4,7);
        StudentP st5 = new StudentP("Petro", 'm',40,1,5);
        // add students to array list
        list.add(st1);
        list.add(st2);
        list.add(st3);
        list.add(st4);
        list.add(st5);

        //CREATE OBJECT for class StudentInformation2
        StudentInformation2 sti = new StudentInformation2();

        // run method with parameters arrayList 'list' of students,
        // and LAMBDA Expression parameter interface Predicate will implement method -> 'testAndPrintStudents'
        // 'testAndPrintStudents' can return true if student object st.avgGrade >7
        sti.testAndPrintStudents(list, (StudentP st) -> {return st.avgGrade > 7;}); //LAMBDA expression only for interfaces with one method
        System.out.println("-----------------------------");
        sti.testAndPrintStudents(list, st -> st.sex =='f'); // LAMBDA expression can automatically apply object type 'StudentP'
        System.out.println("-----------------------------");
        sti.testAndPrintStudents(list,(StudentP t) -> {return t.course <2;}); // LAMBDA expression allow to use method 'testAndPrintStudents' instead of parameter
        System.out.println("-----------------------------");
        sti.testAndPrintStudents(list,(StudentP t) -> {return t.age > 19 && t.course<4;}); // LAMBDA arrow(->) divide method parameter -> method body
    }
}
