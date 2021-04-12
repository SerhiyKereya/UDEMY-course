package Lesson29.Lesson30Lambdas;

import java.util.ArrayList;
import java.util.function.Supplier;
import java.util.function.Consumer;

public class CarSupInt {
    String model;
    String color;
    double engineSize;
    //constructor
    CarSupInt(String model, String color, double engineSize){
        this.model = model;
        this.color = color;
        this.engineSize = engineSize;
    }

    // here we Override default method 'toString' will return combined data String
    public String toString(){
        return "Our car is - " +model+ ", with color: "+ color +", engine vol: "+ engineSize +"l";
    }
}

class test10 {
    //method for Supplier interface
    public static ArrayList<CarSupInt> createThreeCars(Supplier<CarSupInt> carSupplier){ // parameter list had Supplier interface
        ArrayList<CarSupInt> a1 = new ArrayList<>(); // create ArrayList<CarSupInt> object 'a1'
        for (int i = 0; i<3; i++){
            a1.add(carSupplier.get()); // interface Supplier had object carSupplier which had only one method 'get'
        }
        return a1; // method createThreeCars return ArrayList 'a1'
    }

    //method for Consumer interface with 2 parameters car, Consumer
    public static void changeCar(CarSupInt car, Consumer<CarSupInt> consumer){
        consumer.accept(car); //Consumer interface method 'accept'
    }

    public static void main(String[] args) {
        // create object ourCar using method createThreeCars - creating 3 objects of 'CarSupInt' and adding them to ArrayList ourCar
        //with parameter Supplier Interface using LAMBDA expression to provide parameters to CarSupInt class constructor
        ArrayList<CarSupInt> ourCar = createThreeCars(() -> new CarSupInt("Mercedes", "Red",6.3));

        System.out.println("our car: "+ ourCar ); // hidden Use default method toString overriden!!! to print 3 identical objects from ArrayList 'ourCar'
        System.out.println("toString default method: "+ ourCar.toString()); // the same as first just example to show default method 'toString'

        // Lambda expression Consumer interface, method changeCar get ourCar[0], and as parameter2 of the method accept Consumer interface
        //interface method 'accept' apply new parameters to ourCar[0]
        changeCar(ourCar.get(0), car-> {car.color = "Pink"; car.model = "Honda Jazz"; car.engineSize = 1.5;}); //
        System.out.println("new car is "+ ourCar);

        //Consumer interface method 'accept' SECOND
        Consumer<CarSupInt> consumer2 = car2 -> { // object car2 created for auto detected class CarSupInt
            car2.color = "blue";
            car2.engineSize = 4;
            System.out.println("second way to use Consumer inteface : " + car2);
        };
        consumer2.accept(ourCar.get(1)); // consumer2 use interface method 'accept' and apply data provided for consumer2 object
        System.out.println("again our cars "+ ourCar);
    }
}