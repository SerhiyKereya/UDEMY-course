package Lesson23;

public class OverrideMethods {
    //overloaded methods
    void abc(Animal a){ System.out.println("A"); }
    void abc(Mouse m){ System.out.println("M");}

    public static void main(String[] args) {
        OverrideMethods t = new OverrideMethods();

        //variable 'an' had type Animal
        Animal an = new Mouse();
        t.abc(an); // so when 'an' used as parameter it trigger method abc(Animal a)

        // object 'an' had method getName from class Mouse - becouse 'an' equal to type class Mouse
        an.getName();

    }
}

class Animal{
    void getName(){ System.out.println("Animal");}
}

class Mouse extends Animal{
    //overriden method
    @Override
    void getName(){ System.out.println("Mouse"); }
}
