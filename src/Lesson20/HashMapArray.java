package Lesson20;

import java.util.HashMap;
import java.util.Map;

public class HashMapArray {
    public static void main(String[] args) {
        //Map array do not support duplicates - first Integer work as key
        Map<Integer, String> map1 = new HashMap<>();
        map1.put(777, "Ivanka");
        map1.put(778, "Vovk");
        map1.put(779,"Marichka");
        map1.put(780, "Petryk");
        map1.put(781,"Ivanka");
        System.out.println("map = "+ map1);
    }
}
