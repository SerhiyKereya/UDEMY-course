package Lesson15;

public class TimeDoWhile {
    public static void main(String[] args) {

        int hour = 24;

        OUTER:
        do {
            int minute = 0;

            INNER:
            while (minute<60){
                System.out.println(hour +":"+ minute);
                minute++;
            }
            hour++;
        }
        while (hour<24);
    }
}
