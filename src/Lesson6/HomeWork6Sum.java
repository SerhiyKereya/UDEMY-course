package Lesson6;

public class HomeWork6Sum {
    int totalSum = 0;
    int sum(int a, int b, int c, int d){
        totalSum += a+b+c+d;
        System.out.println("total sum = " + totalSum);
        return totalSum;
    }
    int sum(int a, int b, int c){
        totalSum += a+b+c;
        System.out.println("total sum = " + totalSum);
        return totalSum;
    }
    int sum(int a, int b) {
        totalSum += a + b;
        System.out.println("total sum = " + totalSum);
        return totalSum;
    }
    int sum(int a) {
        totalSum += a;
        System.out.println("total sum = " + totalSum);
        return totalSum;
    }
    int sum() {
        System.out.println("total sum = " + totalSum);
        return totalSum;
    }
}
class SumTest{
    public static void main(String[] args) {
        HomeWork6Sum s1 = new HomeWork6Sum();
        s1.sum(1,2,3,4);
        HomeWork6Sum s2 = new HomeWork6Sum();
        s2.sum(1,2,3);
        HomeWork6Sum s3 = new HomeWork6Sum();
        s3.sum(1,2);
        HomeWork6Sum s4 = new HomeWork6Sum();
        s4.sum(1);
        HomeWork6Sum s5 = new HomeWork6Sum();
        s5.sum();
    }
}