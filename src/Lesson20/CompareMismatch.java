package Lesson20;

import java.util.Arrays;

public class CompareMismatch {
    public static void main(String[] args) {
        int [] array1 = {1, 2, 3, 4, 5};
        int [] array2 = {1, 2, 3, 5};

        char [] array3 = {'a','b', 'c', 'd', 'e','f'};
        char [] array4 = {'a','b', 'c', 'z'};
//compare array1 to array2
        System.out.println(Arrays.compare(array3, array4));

        //mismatch show index of first difference
        System.out.println(Arrays.mismatch(array3, array4));
    }
}
