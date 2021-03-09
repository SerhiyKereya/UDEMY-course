package Lesson9;

public class Car {
    static int count;
    String color;
    String engine;
    int a;

    Car(String color, String engine){
        this.count++;
        this.color = color;
        this.engine = engine;
        boolean a;
    }
    public void showColor(){
        System.out.println(color);
        this.changeColor("Crazy red");
    }
    public void changeColor(String color3){
        int price = 5000;
        this.color = color3;
        System.out.println("Car Color changed to "+color);
        this.color = color3;
        price += 1000;
    }

    public static void main(String[] args) {
        Car c = new Car("gray", "i4");
        System.out.println(c.color);
        c.changeColor("Deep black");
    }
}
