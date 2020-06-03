package Lesson5;

public class Human {
    //reference data type variables 'name' 'car' 'bA'
    String name;
    Car3 car;
    BankAccount bA;

    void info(){
        System.out.println("Owner name: " + name + ", car color: " + car.color + car.engine + ", Bank account balance: " + bA.balance);
    }
}

class HumanTest{
    public static void main(String[] args) {
        Human h = new Human();
        h.name = "Dmutro"; // variable 'name' from class Human to object 'h'
        h.car = new Car3("gray mosquito ", "700hp"); // variable 'car' from class Human call class 'Car3' and set values to object 'h'
        h.bA = new BankAccount(007, -50.99); // varieble bA from class Human call class BankAccount constructor to object 'h'
        h.info(); // call method 'info'
        h.bA.refillBankAccount(999); // call method refillBankAccount from variable bA to object 'h'
        h.info();
        h.bA.withdrawBankAccount(100.01);
        h.info();
    }
}

class Car3{
    Car3(String c, String e){ // this is constructor with 2 param for class 'Car3'
        color = c;
        engine = e;
    }
    String color;
    String engine;
}

class BankAccount{
    BankAccount(int id2, double balance2){ // this is constructor with 2 param for class
       // id = id2;
        balance = balance2;
    }
    //int id;
    double balance;

    //method refill adding refillSumm to balance
    double refillBankAccount(double refillSumm){
        balance = balance + refillSumm;
        return balance;
    }
    // method withdrawal from balance
    double withdrawBankAccount(double withdrawSumm){
        balance = balance - withdrawSumm;
        return balance;
    }
}
