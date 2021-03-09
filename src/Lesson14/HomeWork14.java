package Lesson14;

public class HomeWork14 {
    static void time(){
        OUTER: for (int hour = 0; hour <= 6; hour++){
            MIDDLE: for (int minute = 0; minute <= 59; minute++){
                if (hour > 1 && minute == 10){
                    break OUTER; // can use return from method 'time'
                    // return
                }
                INNER: for (int sec = 0; sec <= 59; sec++){
                    if (sec*hour > minute){
                        continue MIDDLE; // break INNER do same
                    }
                    System.out.println(hour +":"+ minute +":"+ sec);
                }
            }
        }
    }

    public static void main(String[] args) {
        time();
    }
}
