package Lesson12;

public class Ternary {
    void maximum (int i1, int i2, int i3){
        if (i1>i2 && i2>i3){
            System.out.println("maximum - "+i1);
        }
        else if (i2>i1 && i2>i3){
            System.out.println("maximum - "+i2);
        }
        else {
            System.out.println("maximum - "+i3);
        }
    }

    public static void main(String[] args) {
        Ternary t = new Ternary();
        t.maximum(3,55,9);
        int a = 10;
        int b = 2;

        // Ternary operator
        int max  = (a>b) ? a:b;
        System.out.println("maximum ternary - "+max);
    }
}

