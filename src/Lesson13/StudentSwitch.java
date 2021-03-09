package Lesson13;

public class StudentSwitch {
    public static void main(String[] args) {
        switch ("Monday"){
            case "Monday":

            case "Tuesday":

            case "Wensday":

            case "Thursday":

            case "Friday":
                System.out.println("work till 18 o'clock");
                break;
            case "Suturday":
                System.out.println("work till 14 o'clock");
                break;
            case "Sunday":
                System.out.println("weekend no work");
                break;
            default:
                System.out.println("entered wrong day of the week");
                break;
        }
    }
}
