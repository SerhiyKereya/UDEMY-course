package Lesson8;

public class Student {
    String name;
    public int course;
    public static int count;// static variable belongs to class not to object and not initialized in each object
    public static int testImport = 66;
    int a;

    public Student(int course2, String name2){
        count++;
        name = name2;
        course = course2;
        System.out.println("Student # "+count+" "+name+" created");
    }
    public static void showStudentCount(){
        System.out.println("We used - "+count+" students");
    }
    public void showInfo(){
        System.out.println("Welcome to the club student");
    }
    void abc(){ //non static method can use all variables
        a++;
        count++;
    }
    static void abcd(){ //static method can't use non static variables a++;
        Student st2 = new Student(1,"Brehlo");
        st2.a++;
        count++;
    }
    public static void main(String[] args) {
        Student st1 = new Student(2, "Pyatochkin");
        System.out.println(count);
        showStudentCount();// static method can be used directly without object
        st1.showStudentCount();
        abcd();
        st1.abc();
    }
}
class StudentTest{
    public static void main(String[] args) {
        Student st1 = new Student(2, "Vovk");
        Student st2 = new Student(3, "Korop");
        Student st3 = new Student(3, "Marichka");

        System.out.println(st3.name); // name belongs to object st3
        System.out.println(Student.count); // count belongs to class Student
        System.out.println(st2.count); // and can be called from object too
        Student.showStudentCount();
        st2.showStudentCount();
    }
}