package Lesson18;

import java.util.Arrays;

public class ArrayMethods {
    public static void main(String[] args) {
        int array1[] = {1,3,9,0,-8,2,7};

        for (int i =0; i<array1.length; i++){
            System.out.print(array1[i]);
            System.out.print(",");
        }
        System.out.println();

        // sort method
        Arrays.sort(array1);
        for (int i =0; i<array1.length; i++){
            System.out.print(array1[i]);
            System.out.print(",");
        }
        System.out.println();

        // method binarySearch work only with sorted array
        int index1 = Arrays.binarySearch(array1, 1);
        System.out.println("index in array is - "+ index1);

        int index2 = Arrays.binarySearch(array1, 10);
        System.out.println("index in array is - "+ index2); // -7 + -1 = -8
    }
}
