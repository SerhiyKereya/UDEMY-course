package Lesson18;

public class ArraysTest1 {
    public static void main(String[] args) {

        // Array DECLARATION
        int [][] array1;
        String [] array2;
        double [] [] array3;

        // Array ALLOCATION = fix length
        array1 = new int[3][1]; // Allowed to allocate only first length of array -- BUT got EXCEPTION when run
        array2 = new String[3];
        array3 = new double [4][2];

        System.out.println(array1.length);

        // Array initialization
        array1[0][0] = 5;

        array2[0] = "Hi";
        array2[1] = "Good by";
        array2[2] = "how are you";

        array3[0][0] = 3.14;
        array3[0][1] = 3.14;
        array3[1][0] = 3;

        array3[1][1] = array1[0][0];

        System.out.println(array3[1][1]);

    }
}
