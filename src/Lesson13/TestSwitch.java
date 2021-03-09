package Lesson13;

public class TestSwitch {

}
class Student{

    int grade;

    Student(int grade){
        this.grade=grade;
    }

    public static void main(String[] args) {
        Student st1 = new Student(4);

        switch (st1.grade){
            case 1:
                System.out.println("Disaster");
                break;
            case 2:
                System.out.println("Horible");
                break;
            case 3:
                System.out.println("Ok");
                break;
            case 4:
                System.out.println("Good");
                break;
            default:
                System.out.println("wrong grade");
                break;
        }

    }
}
