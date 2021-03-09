package Lesson5;

public class car {
    car(String colir, String motor){ //constructor for car class with 2 parameters
        color = colir;
        engine = motor;
    }
    String color;
    String engine;
    int speed;

    int gas(int shvidkist){
        speed += shvidkist;
        return speed;
    }
    int brake(int shvidkist){
        speed -= shvidkist;
        return speed;
    }
    void showInfo(){
        System.out.println("Car color: " + color + ", engine type: " + engine + ", current speed: " + speed);
    }
}
class carMove{
    public static void main(String[] args) {
        car c1 = new car("candy green ", "strait 6"); //c1 is a new object of class 'car' with 2 param
     //   c1.color = "candy green ";
     //   c1.engine = "strait 6";
        c1.speed = 60;
        c1.showInfo();
        c1.gas(20);
        c1.showInfo();
        c1.brake(90);
        c1.showInfo();
    }
}