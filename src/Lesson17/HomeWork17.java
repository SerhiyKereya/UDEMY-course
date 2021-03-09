package Lesson17;

public class HomeWork17 {
    static boolean ravenstvo(StringBuilder sb1, StringBuilder sb2){
        boolean theyEqual = (sb1==sb2);
        return theyEqual;
    }

    public static void main(String[] args) {
        StringBuilder sb3 = new StringBuilder("hello");
        StringBuilder sb4 = new StringBuilder("Good buy");
        StringBuilder sb5 = sb3;
        StringBuilder sb6 = new StringBuilder("hello");

        System.out.println(sb3 +"="+ sb4 + " - " + ravenstvo(sb3, sb4));

        System.out.println(sb3 +"="+ sb5 + " - " + ravenstvo(sb5, sb3));

        System.out.println(sb3 +"="+ sb6 + " - " + ravenstvo(sb3, sb6));

    }
}
