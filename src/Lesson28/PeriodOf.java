package Lesson28;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class PeriodOf {
    // static method
    static void changeDuty(LocalDate start, LocalDate finish, Period p){
        LocalDate date1 = start;
        while (date1.isBefore(finish)){
            System.out.println("time to change duty person"+date1);
            date1 = date1.plus(p);
        }
    }

    public static void main(String[] args) {
        LocalDate st = LocalDate.of(2020, Month.FEBRUARY, 1);
        LocalDate fin = LocalDate.of(2021, Month.APRIL, 1);
        Period per = Period.ofMonths(3);

        changeDuty(st, fin, per);
    }
}
