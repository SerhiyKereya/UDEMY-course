package Lesson8;

public class HomeWork1 {

    static int multyply(int a, int b, int c){
        int result = a*b*c;
        return result;
    }
    static void divide(int a, int b){
        System.out.println(a +"/"+ b +"="+ a/b +"+"+ a%b +"/"+ b);
    }
}
class HomeWorkTest1{
    public static void main(String[] args) {
        System.out.println("1*5*9="+ HomeWork1.multyply(1, 5, 9));
        HomeWork1.divide(7,5);
        HomeWork1.divide(-8,-3);
    }
}
