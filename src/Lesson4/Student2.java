package Lesson4;

public class Student2 {
        int studID;
        String name;
        String surName;
        int course;
        double mathAvarage;
        double economyAvarage;
        double langAvarage;
        //Class constructor all
    Student2( int id1, String name1, String surName1, int course1, double mathAvarage1, double economyAvarage1, double langAvarage1){
        studID = id1;
        name = name1;
        surName = surName1;
        course = course1;
        mathAvarage = mathAvarage1;
        economyAvarage = economyAvarage1;
        langAvarage = langAvarage1;
    }
    Student2(int id2, String name2, String surName2, int course2){
        this(id2, name2, surName2, course2, 0,0,0);
    }
    Student2(){}

    double calculatePrintStudentAvarageMark2(Student2 st){
            double stAvMark = (st.economyAvarage+st.mathAvarage+st.langAvarage)/3;
            System.out.println(st.name +" student average mark - "+ stAvMark);
            return stAvMark;
    }
}
class StudentTest2 {
    // method should not be in main????
    double calculatePrintStudentAvarageMark3(Student2 st2){
        double stAvMark2 = (st2.economyAvarage+st2.mathAvarage+st2.langAvarage)/3;
        System.out.println(st2.name +" student average mark metod#2- "+ stAvMark2);
        return stAvMark2;
    }
        public static void main(String[] args) {

            // 3 new objects crated for class Student
            Student2 smartStudent2 = new Student2(1, "Smart", "ienko", 3);
            Student2 strongStudent2 = new Student2(2,"Strong2", "20",3,3,3,3);
            Student2 dumbStudent2 = new Student2(3,"Dumb3","3",3,1,1,1);


            // assigning variables for class Student objects
            //smartStudent2.name = "Geek";
            smartStudent2.mathAvarage = 5;
            smartStudent2.economyAvarage = 5;
            smartStudent2.langAvarage = 5;
            //System.out.println(smartStudent.name +" student avarage mark - "+ ((smartStudent.mathAvarage + smartStudent.economyAvarage + smartStudent.langAvarage)/3));

            strongStudent2.name = "Strong";
            strongStudent2.mathAvarage = 4;
            strongStudent2.economyAvarage = 3;
            strongStudent2.langAvarage = 4;
            //System.out.println(strongStudent.name +" student avarage mark - "+ ((strongStudent.mathAvarage + strongStudent.economyAvarage + strongStudent.langAvarage)/3));

            dumbStudent2.name = "Dumb";
           // dumbStudent2.mathAvarage = 1;
            //dumbStudent2.economyAvarage = 1;
            //dumbStudent2.langAvarage = 2;
            //System.out.println(dumbStudent.name +" student average mark - "+ ((dumbStudent.mathAvarage + dumbStudent.economyAvarage + dumbStudent.langAvarage)/3));

            //call method calculatePrintStudentAvarageMark
            smartStudent2.calculatePrintStudentAvarageMark2(smartStudent2);
            strongStudent2.calculatePrintStudentAvarageMark2(strongStudent2);
            dumbStudent2.calculatePrintStudentAvarageMark2(dumbStudent2);
            System.out.println();
            //creating Object result to be able call method inside class
            StudentTest2 result = new StudentTest2();
            result.calculatePrintStudentAvarageMark3(smartStudent2);
            result.calculatePrintStudentAvarageMark3(strongStudent2);
            result.calculatePrintStudentAvarageMark3(dumbStudent2);
        }
}
