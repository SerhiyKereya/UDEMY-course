package Lesson18;

public class ArrayInitializationCycle {

    public static void main(String[] args) {

        // Array DECLARATION
        String[] array1;

        // Array ALLOCATION = fix length
        array1 = new String[3];

        // Array initialization
        for (int i = 0; i<array1.length; i++){
            array1[i] = "Hello" + i;
            System.out.println(array1[i]);
        }

        // Array Declaration and Allocation
        int[][] array2 = new int[3][]; // second length will be allocated further

        // Array ALLOCATION for second length
        array2[0] = new int[5];
        array2[1] = new int[2];
        array2[2] = new int[7];

        // Array initialization for both dimension length
        for (int i = 0; i< array2.length; i++){
            for (int j = 0; j< array2[i].length; j++){
                array2[i][j] = i+j;
                System.out.print(array2[i][j]);
            }
            System.out.println();
        }
    }
}
