package Lesson8;

public class HomeWork2 {
    final static double pi = 3.14;

    double calcCircleArea(int radius){
        double area = pi*radius*radius;
        return area;
    }
    static double calcCircleLenght(int radius){
        double circleLenght = pi*radius*2;
        return circleLenght;
    }
    void showCircleData(int radius){
        System.out.println("circle radius - "+ radius);
        System.out.println("circle area = "+ calcCircleArea(radius));
        System.out.println("circle lenght = "+ calcCircleLenght(radius));
    }
}
class HomeWorkTest2{
    public static void main(String[] args) {
        HomeWork2 hw = new HomeWork2();
        hw.showCircleData(10);
        System.out.println(hw.calcCircleArea(5)+" is circle area for radius - 5");
        System.out.println(HomeWork2.calcCircleLenght(4)+"is circle lenght for radius - 4 ");
    }
}