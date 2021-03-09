package Lesson19;

public class Test3 {
    public static void main(String[] args) {
        int[] array = {0, 5, 4, 1};
        int summa = 0;

        for (int a : array) { // foreach loop
            System.out.print(a + " ");
            summa +=a;
        }
        System.out.println();
        System.out.println(summa);
    }
}
