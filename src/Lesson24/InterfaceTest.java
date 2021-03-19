package Lesson24;

public class InterfaceTest {
    public static void main(String[] args) {
        // interface can't create Objects - same as abstract class
        // Help_able h = new Help_able();

        // object 'h' has only methods from Help_able interface adn Driver class
        Help_able h = new Driver();
        //System.out.println(h.salary); can't use variable salary from parrent class
        h.fightFire("snow");
        h.provideHelp();
        }
    }


// parrent class (or super class)
class Employee{
    double salary = 100;
    String name;
    int age;
    int experience;
    void eat(){System.out.println("m..mmmm");}
    void sleep(){System.out.println("h..rrrrr"); }
}

// class can have endless amount of interfaces
class Driver extends Employee implements Help_able,Swim_able{
    String carPorpouse;
    void drive(){System.out.println("drr nn dn dnn");}
    //overwrite abstract method 'provideHelp' add public access modifier
    public void provideHelp(){System.out.println("Driver provide first aid help"); }
    public void fightFire(String t){System.out.println("Driver fight fire with "+ t); } // mandatory String form interface method
    public void swim(){System.out.println("Driver swim"); }
}

// Interface can have only abstract  public methods
// intervace can have only constant variable (any variable always be final static)
interface Help_able{
    public abstract void provideHelp(); // interface methods always abstract and public
    void fightFire(String fireTool); // interface methods always abstract and public // String became mandatory for all Method implementations
    int a = 10;
}

interface Swim_able{
    void swim(); // abstract method
}