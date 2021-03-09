package Lesson11;

public class Car {
    String color;
    String engine;
    int doorNumber;

    Car(String color, String engine, int doorNumber){
        this.color = color;
        this.engine = engine;
        this.doorNumber = doorNumber;
    }
}
class CarTest {

    public static void carDoorTuning(Car c){
        c.doorNumber = 2;
    }

    public static void carColorSwap(Car ca1, Car ca2){
        String color3 = ca1.color;
        ca1.color= ca2.color;
        ca2.color = color3;
    }

    public static void main(String[] args) {
        Car c1 = new Car("blue dolphine", "Big Block", 4);
        Car c2 = new Car("red flame", "tiny one", 3);
        System.out.println("original c1 car door number - "+ c1.doorNumber);
        carDoorTuning(c1);
        System.out.println("coupe style tunned c1 car door number - "+ c1.doorNumber);
        System.out.println("Original c1 color - "+ c1.color);
        System.out.println("Original c2 color - "+ c2.color);
        carColorSwap(c1, c2);
        System.out.println("swapped c1 color - "+ c1.color);
        System.out.println("swapped c2 color - "+ c2.color);
    }
}
