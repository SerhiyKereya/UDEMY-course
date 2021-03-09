package Lesson14;

public class Test2forHours {
    public void time(){

        OUTER: for (int hour = 0; hour <= 23; hour++){
            System.out.println("beginning of OUTER loop");

            INNER: for (int minute = 0; minute <= 59; minute++){

                if (minute == 0){
                    System.out.println(hour +":"+ "00");
                    continue INNER;
                }

                System.out.println(hour + ":" + minute);

                if (minute ==30) {
                     break INNER;
                }
            }

            System.out.println("end of OUTER loop");
        }
    }

    public static void main(String[] args) {
        Test2forHours t = new Test2forHours();
        t.time();
    }
}
