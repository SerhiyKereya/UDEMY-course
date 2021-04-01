package Lesson25;

public class DownUpCasting {
    public static void main(String[] args) {
        String [] array1 = {"Hi", "By"};
        Object [] array2 = array1; // UpCasting automatic Object include type String to itself
        String [] array3 = (String[]) array2; // DownCasting 'array3' type String not include all Object types - it needs casting (String[])
    }
}
