package Lesson24;

public class HomeWork1 {
    public static void main(String[] args) {
        SwordFish swordFish1 = new SwordFish("Swordy");
        System.out.println(swordFish1.animalName);
        swordFish1.swim();
        swordFish1.eat();
        swordFish1.sleep();


        Speakable sp = new Pingwin("SpeakWin");
        sp.speak();

        AnimalHome lion1 = new Lion("King"); // object type AnimalHome had only 2 methods
        System.out.println(lion1.animalName);
        lion1.eat();
        lion1.sleep();

        Mammal lion2 = new Lion("lion2"); // object type Mammal had run + extend 2 method from AnimalHome and +1 from interface Speakable
        System.out.println(lion2.animalName);
        lion2.eat();
        lion2.speak();
        lion2.run();
        lion2.sleep();
    }
}

abstract class AnimalHome{
    //constructor
     AnimalHome(String name){
         this.animalName = name;
     }

     String animalName;

    //methods
    abstract void eat();
    abstract void sleep();
}

abstract class Fish extends AnimalHome {
    //constructor
    Fish(String name2){
        super(name2); // name2 overright name in the parent class constructor
        this.animalName = name2;
    }

    //void eat(){}
    void sleep(){ System.out.println("Always interesting to watch sleeping fish"); }
    abstract void swim();
}

abstract class Bird extends AnimalHome implements Speakable{
    //constructor
    Bird (String name3){
        super(name3); // name2 overright name in the parent class constructor
        this.animalName = name3;
    }

    abstract void fly();
    //override always public interface method
    public void speak(){System.out.println(animalName + " sings"); }
}

abstract class Mammal extends AnimalHome implements Speakable{
    //constructor
    Mammal(String name4){
        super(name4); // name2 overright name in the parent class constructor
        this.animalName = name4;
    }

    abstract void run();
}

interface Speakable {
    default void speak(){ System.out.println(" somebody speaks"); };
}

class SwordFish extends Fish{
    //constructor
    SwordFish(String name5){
        super(name5); // name2 overright name in the parent class constructor
        this.animalName = name5;
    }
    public void swim(){ System.out.println("Swordfish is beautifull fish, wich swim fast ");}
    void eat(){ System.out.println("Swordfish not flasheating fish, it can eat ordinary fish food");    }
}

class Pingwin extends Bird{
    //constructor
    Pingwin(String name6){
        super(name6); // name2 overright name in the parent class constructor
        this.animalName = name6;
    }
    void eat(){ System.out.println("Pingwin likes to eat fish");}
    void fly(){ System.out.println("pingwins don't fly");    }
    void sleep(){ System.out.println("pingwins sleep holding tight to eash other");    }
    void speek(){  System.out.println("pingwins can't sing song as scvirls"); }
}

class Lion extends Mammal{
    //constructor
    Lion(String name7){
        super(name7); // name2 overright name in the parent class constructor
        this.animalName = name7;
    }
    void eat(){ System.out.println("lion love meet");    }
    void sleep(){ System.out.println("most part of the day lion sleep");    }
    void run(){ System.out.println("LIon is not the fastest cat");    }
}