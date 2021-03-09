package Lesson13;

public class Month {

    int monthNumber;
    Month(int monthNumber){
        this.monthNumber = monthNumber;
    }
    public static void showMonthAmountOfDays(int monthNumber){
        switch (monthNumber){
            default:
                System.out.println("Month number "+monthNumber+" not exist");
                break;
            case 1:
                System.out.println("month "+monthNumber+ " had 30 days");
                break;
            case 2:
                System.out.println("month "+monthNumber+ " had 28 days");
                break;
            case 3:
                System.out.println("month "+monthNumber+ " had 31 days");
                break;
        }

    }
    public static void main(String[] args) {

        Month m1 = new Month(-56);
        m1.showMonthAmountOfDays(m1.monthNumber);
        Month m2 = new Month(3);
        m2.showMonthAmountOfDays(m2.monthNumber);

    }
}
