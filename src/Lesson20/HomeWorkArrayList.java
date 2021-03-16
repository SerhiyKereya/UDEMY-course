package Lesson20;
import java.util.ArrayList;
import java.util.Collections;

public class HomeWorkArrayList {
    public static ArrayList<String> abc(String ...s){
        ArrayList<String> list1 = new ArrayList<>();
        // Add String to the list
        for (String st:s) {
            // ! means not contain like !=
            // and wouldn't add duplicate values
            if (!list1.contains(st)){
                list1.add(st);
            }
        }
        // sort list
        Collections.sort(list1);

        return list1;
    }
  public static void main(String[] args) {
        // provide String to abc method, it will sort Strings and return ArrayList
      ArrayList<String> list2 = abc("B","D","A","B","C");

      System.out.println(list2);

  }
}