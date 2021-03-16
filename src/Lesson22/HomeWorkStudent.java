package Lesson22;

public class HomeWorkStudent    {

    //Encapsulation for privat variable 'name'
    private StringBuilder name;
        public StringBuilder getName() {
            return name;
        }
        public void setName(StringBuilder name) {
            if (name.length()>2){
                this.name = name;
            }
        }
    //Encapsulation
    private int course;
        public int getCourse() {
            return course;
        }
        public void setCourse(int course) {
            if (course>0 && course<=4){
                this.course = course;
            }
        }
    //Encapsulation
    private int grade;
        public int getGrade() {
            return grade;
        }
        public void setGrade(int grade){
            if (grade>0 && grade<=10)
            this.grade = grade;
        }
   //method print Student parameters
    public void showInfo(){
        System.out.println("Student Name - " + getName()+". Course "+getCourse()+". Grade - "+getGrade());
    }
}
class HomeWorkStudentTest{
    public static void main(String[] args) {
        HomeWorkStudent s = new HomeWorkStudent();
        s.setName(new StringBuilder("Kavun"));
        s.setCourse(3);
        s.setGrade(9);
        s.showInfo();

        HomeWorkStudent s2 = new HomeWorkStudent();
        s2.setName(new StringBuilder("Agrus"));
        s2.setCourse(9);
        s2.setGrade(77);
        s2.showInfo();
    }
}