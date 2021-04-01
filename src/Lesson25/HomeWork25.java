package Lesson25;


public class HomeWork25 {
    public static void main(String[] args) {
        AnimalHome swordFish1 = new SwordFish("Swordy");
        AnimalHome pin = new Pingwin("AnimalPingwin");
        AnimalHome lion1 = new Lion("King Lion"); // object type AnimalHome had only 2 methods
        Fish f = new SwordFish("Just Fish");
        Bird b = new Pingwin("Bird Pingwin");
        Mammal m = new Lion("Mammal lion");
        Pingwin pingwin = new Pingwin("True Pingwin");
        Lion lion = new Lion("True lion");
        Speakable speak1 = new Pingwin("SpeakWin ");
        Speakable speak2 = new Lion("Speak Lion");

        AnimalHome [] array1 = {swordFish1, pin, lion1, f,b,m, pingwin,lion}; // array type AnimalHome can contain all except interface speakable objects
        Speakable [] array2 = {speak1, speak2, b, m, pingwin, lion}; // array type Speakable can't contain 'f'-fish - becouse it is not implement interface speakable

        for (AnimalHome an: array1) { // while object 'an' type AnimalHome exist in 'array1'
            if (an instanceof SwordFish){
                System.out.println(an.animalName);
                an.eat();
                an.sleep();
                ((SwordFish) an).swim(); // cast 'an' as SwordFish

                // or we can use one more SwordFish object
                SwordFish s = (SwordFish) an; // new object s = cast to SwordFish all objects of 'an' array1
                s.eat();
                s.sleep();
                s.swim();
                System.out.println("-----------------------------------------");
            }
            else if (an instanceof Pingwin){
                Pingwin p2 = (Pingwin) an; // new object p2 = cast to Pingwin all objects of 'an' array1
                System.out.println(p2.animalName);
                p2.sleep();
                p2.eat();
                p2.speak(); // cast 'an' as
                p2.fly(); // cast 'an' as
                System.out.println("-----------------------------------------");
            }
            else if (an instanceof Lion){
                System.out.println(an.animalName);
                ((Lion) an).speak();  // cast 'an' as
                an.eat();
                an.sleep();
                ((Lion) an).run(); // cast 'an' as
                System.out.println("-----------------------------------------");
            }
        }

        for (Speakable sp: array2) { // while object 'sp' type AnimalHome exist in 'array2'
            if (sp instanceof Pingwin){
                System.out.println(((Pingwin) sp).animalName);
                sp.speak();
                System.out.println("-----------------------------------------");
            }
            else if (sp instanceof Lion){
                Lion l1 = (Lion) sp; // new object l1 = cast to Lion all objects of 'sp' array2
                System.out.println(l1.animalName);
                l1.speak();
                l1.eat();
                l1.run();
                l1.sleep();
                System.out.println("-----------------------------------------");
            }
        }
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

abstract class Bird extends AnimalHome implements Speakable {
    //constructor
    Bird (String name3){
        super(name3); // name2 overright name in the parent class constructor
        this.animalName = name3;
    }

    abstract void fly();
    //override always public interface method
    public void speak(){System.out.println(animalName + " sings"); }
}

abstract class Mammal extends AnimalHome implements Speakable {
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

class SwordFish extends Fish {
    //constructor
    SwordFish(String name5){
        super(name5); // name2 overright name in the parent class constructor
        this.animalName = name5;
    }
    public void swim(){ System.out.println("Swordfish is beautifull fish, wich swim fast ");}
    void eat(){ System.out.println("Swordfish not flasheating fish, it can eat ordinary fish food");    }
}

class Pingwin extends Bird {
    //constructor
    Pingwin(String name6){
        super(name6); // name2 overright name in the parent class constructor
        this.animalName = name6;
    }
    void eat(){ System.out.println("Pingwin likes to eat fish");}
    void fly(){ System.out.println("pingwins don't fly");    }
    void sleep(){ System.out.println("pingwins sleep holding tight to eash other");    }
    public void speak(){  System.out.println("pingwins can't sing song as scvirls"); }
}

class Lion extends Mammal {
    //constructor
    Lion(String name7){
        super(name7); // name2 overright name in the parent class constructor
        this.animalName = name7;
    }
    void eat(){ System.out.println("lion love meet");    }
    void sleep(){ System.out.println("most part of the day lion sleep");    }
    void run(){ System.out.println("Lion is not the fastest cat");    }
}