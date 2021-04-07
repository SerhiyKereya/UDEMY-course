package Lesson29;

import java.util.ArrayList;

public class NotLambdaStudent {
}

class Student{
    String name;
    char sex;
    int age;
    int course;
    double avgGrade;
    //class constructor
    Student(String name, char sex, int age,int course,double avgGrade){
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
    }
}

class StudentInfo{
    //method printStudent data
    void printStudent(Student st){
        System.out.println("Student name: "+ st.name+ " sex: "+st.sex+" age: "+ st.age+" course: "+ st.course+" avarage grade: "+st.avgGrade);
    }

    //method print bigger Grade students
    void printStudentsOverThisGrade(ArrayList<Student> studentArrayList, double avgGrade){
        for (Student s: studentArrayList) { // while we had students 's' in studentArrayList
            if (s.avgGrade > avgGrade){
                printStudent(s); // print students with over avgGrade rating
            }
        }
    }

    //method print smaller Grade students
    void printStudentsUnderThisGrade(ArrayList<Student> studentArrayList, double avgGrade){
        for (Student s: studentArrayList) { // while we had students 's' in studentArrayList
            if (s.avgGrade < avgGrade){
                printStudent(s); // print students with under avgGrade rating
            }
        }
    }

    //method print bigger Age students
    void printStudentsOverAge(ArrayList<Student> studentArrayList, int age){
        for (Student s: studentArrayList) { // while we had students 's' in studentArrayList
            if (s.age > age){
                printStudent(s); // print students with bigger age
            }
        }
    }

    //method print under Age students
    void printStudentsUndrAge(ArrayList<Student> studentArrayList, int age){
        for (Student s: studentArrayList) { // while we had students 's' in studentArrayList
            if (s.age < age){
                printStudent(s); // print students with bigger age
            }
        }
    }

    //method print students with chosen sex
    void printStudentsSex(ArrayList<Student> studentArrayList, char sex){
        for (Student s: studentArrayList) { // while we had students 's' in studentArrayList
            if (s.sex == sex){
                printStudent(s); // print students with certain sex
            }
        }
    }

    //method print mixed conditions students
    void printStudentsMixConditions(ArrayList<Student> studentArrayList, double avgGrade, int age, char sex){
        for (Student s: studentArrayList) { // while we had students 's' in studentArrayList
            if (s.avgGrade > avgGrade && s.age < age && s.sex == sex){
                printStudent(s); // print students
            }
        }
    }

    public static void main(String[] args) {
        ArrayList <Student> list = new ArrayList<>();
        Student st1 = new Student("Mukola", 'm',22,3,8.5); // for char use 'm' not "m"
        Student st2 = new Student("Dmutro", 'm',19,2,6);
        Student st3 = new Student("Ivanka", 'f',20,2,7.5);
        Student st4 = new Student("Vasul", 'm',25,4,7);
        Student st5 = new Student("Petro", 'm',40,1,5);
        // add students to array list
        list.add(st1);
        list.add(st2);
        list.add(st3);
        list.add(st4);
        list.add(st5);

        //CREATE OBJECT for class StudentInfo
        StudentInfo sti = new StudentInfo();
        // run method
        sti.printStudentsOverThisGrade(list, 7);
        System.out.println("-----------------------------");
        sti.printStudentsUnderThisGrade(list,7);

    }
}