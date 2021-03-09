package Lesson19;

public class Test2 {
    //method suma with endless amount of int variables
    static void summa(int ... a){ //varargs parameter
        int summa=0;
        for (int i=0; i<a.length; i++){
            summa += a[i];
        }
        System.out.println(summa);
    }

    public static void main(String[] args) {
        summa(1, 4,6,78);
    }
}
