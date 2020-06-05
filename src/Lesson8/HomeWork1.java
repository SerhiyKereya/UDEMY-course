package Lesson8;

public class HomeWork1 {
    int a;
    int b;
    int c;
    //class constructor
    HomeWork1(int a1, int b1, int c1){
        a = a1;
        b = b1;
        c = c1;
    }
    int multyply(int result){
        result = a*b*c;
        return result;
    }
    void divide(){
        System.out.println(a +"/"+ b +"="+ a/b +"+"+ a%b +"/"+ b);
    }
}
class HomeWorkTest1{
    public static void main(String[] args) {
        HomeWork1 h0 = new HomeWork1(7,5,3);
        int m = h0.multyply(1);
        System.out.println(h0.a +"*"+ h0.b +"*"+ h0.c +"="+ m);
        h0.divide();
    }
}
