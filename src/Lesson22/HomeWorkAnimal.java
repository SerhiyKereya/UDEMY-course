package Lesson22;

//parent class
public class HomeWorkAnimal {
    //default class constructor will print
    HomeWorkAnimal(){
        System.out.println("I am animal");
    }
    int eyes;
    //method drink
    public void drink(){
        System.out.println("Animal drinks");
    }
    //method eat
    public void eat(){
        System.out.println("Amimal eat");
    }
}

//child class
class Pet extends HomeWorkAnimal{
    // defauld constructor will print and set 2 eyes
    Pet(){
        System.out.println("I am pet");
        eyes = 2;
    }
    int tail = 1;
    int paw = 4;
    String petName;

    //method run
    public void run(){
        System.out.println("it runs");
    }
    //method jump
    public void jump(){
        System.out.println("it jumps");
    }
}

//child class for Pet
class Dog extends Pet{
    //class constructor will expect string name and print
    Dog(String name){
        this.petName = name; // use petName variable from parent class
        System.out.println("I am dog and my name is - "+ name);
    }
    //method play
    public void play(){
        System.out.println("Dog plays");
    }
}

//child class for Pet
class Cat extends Pet{
    //class constructor will expect string name and print
    Cat(String name){
        System.out.println("I am cat and my name is - "+ name);
        this.petName = name;
    }
    //method sleep use petName variable from parent class
    public void sleep(){
        System.out.println(petName + " sleep");
    }
}

// class will create objects ant run other class methods
class TestAnimal{
    public static void main(String[] args) {
        Dog d = new Dog("Sirko");
        System.out.println(d.petName + " had "+ d.paw+ " paws");
        Cat c = new Cat("Rudyk");
        c.sleep();
    }
}