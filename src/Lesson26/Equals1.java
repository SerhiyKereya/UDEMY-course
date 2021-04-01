package Lesson26;

import java.util.ArrayList;

public class Equals1 {
    public static void main(String[] args) {
        Car c1 = new Car("blue", "i6");
        Car c2 = new Car("red", "V8");
        Car c3 = new Car("green", "V6");
        Car c4 = new Car("green", "V6");

        System.out.println(c3.equals(c4));

        ArrayList<Car> list = new ArrayList<>();
        list.add(c1);
        list.add(c2);
        list.add(c3);

        System.out.println(list); //by default added toString method
        System.out.println(list.toString());
    }
}

class Car {
    String color;
    String engine;
//class constructor
    Car(String colorCar, String engineCar){
        this.color = colorCar;
        this.engine = engineCar;
    }
    // overrided deafult method 'equals' can return 'true' or 'false'
    public boolean equals(Object obj){
        if (obj instanceof Car){
            Car car2 = (Car) obj; // casting 'obj' to Car type object
            return (color.equals(car2.color) && engine.equals(car2.engine)); //
        }
        else return false;
    }

    //overriden method 'toString'
    public String toString(){
        return "Car with color "+ color + " and with engine "+ engine;
    }
}