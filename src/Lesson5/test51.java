package Lesson5;

public class test51 {
    //method summ
        int summ(int a, int b, int c){
            int result = a + b + c;
            return result;
        }
        int arithmeticalMiddle(int a1, int b1, int c1){
            int result2 = summ(a1,b1,c1)/3; // inside method 'arithmMiddle' calling method 'summ'
            return result2;
        }
}
class test52 {
    public static void main(String[] args) {
        test51 t = new test51(); // calling class test51
        int summThreeNumeric = t.summ(1,2,3); // calling method summ
       // System.out.println(summThreeNumeric);
        System.out.println(t.summ(5,10,15)); // print from method summ called by varieble t calling class test51
        System.out.println(t.arithmeticalMiddle(90, 30,3));//var t = class test51 calling method arithmMiddle
    }
}