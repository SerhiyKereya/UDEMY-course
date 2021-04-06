package Lesson27;

import java.lang.*;

public class MethodThrowException {
}

class Airplane{
    String state = "waiting"; // possible values --- 'waiting' --- 'in the air' --- 'canceled'

    public void fly(){ // method fly
        state = "in the air";
        System.out.println("Plane flying");
    }

    public void waiting(){ //method waiting
        if (state.equals("in the air")){
            throw new IllegalStateException("Plane already in the air");
        }
        state = "waiting";
        System.out.println("The plane waiting to fly");
    }
    public static void main(String[] args) {
        Airplane a = new Airplane();
        a.waiting();
        a.fly();
        a.waiting(); // will throw IllegalStateException
    }
}
