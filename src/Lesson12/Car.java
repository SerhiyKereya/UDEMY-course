package Lesson12;

public class Car {
    int engineHorsepower;
    int doorAmount;

    Car ( int engineHorsepower, int doorAmount){
        this.engineHorsepower = engineHorsepower;
        this.doorAmount = doorAmount;
    }
}

class CarTest {
    public static void main(String[] args) {
        Car c1 = new Car(201, 4);
        Car c2 = new Car(200, 5);

        if (c1.engineHorsepower > c2.engineHorsepower) {
            if (c1.doorAmount > c2.doorAmount) {
                System.out.println("first car is more powerful, and has more doors");
            }
            else {
                System.out.println("first car is more powerful, but had less doors");
            }
        }
        else {
            System.out.println("first car is less powerfull");
        }
    }
}
