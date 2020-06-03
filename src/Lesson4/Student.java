package Lesson4;

public class Student {
        int studID;
        String name;
        String lastName;
        int year;
        double mathAvarage;
        double economyAvarage;
        double langAvarage;

    double calculatePrintStudentAvarageMark(Student st){
        double stAvMark = (st.economyAvarage+st.mathAvarage+st.langAvarage)/3;
        System.out.println(st.name +" student average mark - "+ stAvMark);
        return stAvMark;
    }
}
class StudentTest {
    public static void main(String[] args) {
        // 3 new objects crated for class Student
        Student smartStudent = new Student();
        Student strongStudent = new Student();
        Student dumbStudent = new Student();


        // assigning variables for class Student objects
        smartStudent.name = "Geek";
        smartStudent.mathAvarage = 5;
        smartStudent.economyAvarage = 5;
        smartStudent.langAvarage = 5;
        //System.out.println(smartStudent.name +" student avarage mark - "+ ((smartStudent.mathAvarage + smartStudent.economyAvarage + smartStudent.langAvarage)/3));

        strongStudent.name = "Strong";
        strongStudent.mathAvarage = 4;
        strongStudent.economyAvarage = 3;
        strongStudent.langAvarage = 4;
        //System.out.println(strongStudent.name +" student avarage mark - "+ ((strongStudent.mathAvarage + strongStudent.economyAvarage + strongStudent.langAvarage)/3));

        dumbStudent.name = "Dumb";
        dumbStudent.mathAvarage = 1;
        dumbStudent.economyAvarage = 1;
        dumbStudent.langAvarage = 2;
        //System.out.println(dumbStudent.name +" student average mark - "+ ((dumbStudent.mathAvarage + dumbStudent.economyAvarage + dumbStudent.langAvarage)/3));

        //call method calculatePrintStudentAvarageMark
        smartStudent.calculatePrintStudentAvarageMark(smartStudent);
        strongStudent.calculatePrintStudentAvarageMark(strongStudent);
        dumbStudent.calculatePrintStudentAvarageMark(dumbStudent);
    }
}
