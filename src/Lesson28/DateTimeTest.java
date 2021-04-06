package Lesson28;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DateTimeTest {
    public static void main(String[] args) {
        System.out.println(LocalDate.now()+ " today is ");
        //System.out.println(LocalTime.now());
        //System.out.println(LocalDateTime.now());
        LocalDate dt1 = LocalDate.now();
        System.out.println(dt1.getDayOfWeek()+ " is current day of the week");
        // DateTimeFormatter will format data to some standart
        System.out.println(dt1.format(DateTimeFormatter.ISO_WEEK_DATE)+ " - current week number and day");
        // one more format
        System.out.println(dt1.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT))+ " - return short FormatStyle of date");

        // create object with date
        LocalDate date1 = LocalDate.of(2021,05,6);
        System.out.println("date1 = "+date1);
        LocalDate date2= date1.plusDays(59999);
        System.out.println("date1 + 59999 days= "+date2);
        //method chaining
        date1 = date1.plusDays(3).minusMonths(4).plusWeeks(43).plusYears(2);
        System.out.println("date1 + chaining methods = "+date1);
        //comparison Dates
        System.out.println(date1.isAfter(date2) +" dates comparison");

        LocalDate date3 = LocalDate.of(2021, Month.APRIL,23); // can use class Month with constanta APRIL for easier
        //System.out.println(date3);

        LocalTime lt1 = LocalTime.of(20,45);
        //System.out.println(lt1);
        LocalTime lt2 = LocalTime.of(20,45,59,2);
        System.out.println(lt2+ "= lt2 time with nanoseconds");

        LocalDateTime ldt1 = LocalDateTime.of(2021,Month.FEBRUARY,3,4,5,6,7);
        //System.out.println(ldt1);
        LocalDateTime ldt2 = LocalDateTime.of(date1,lt2);
        System.out.println(ldt2 + " = date1 + lt2");

    }
}
