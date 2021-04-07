package Lesson28;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class FormatterOfTime {
    public static void main(String[] args) {
        LocalDate ld = LocalDate.of(2016, Month.APRIL, 1);
        LocalDateTime ldt = LocalDateTime.of(2016,Month.AUGUST,11,22,3,4);
        LocalTime lt = LocalTime.of(16,40);

        // create own format of Data and Time
        DateTimeFormatter f = DateTimeFormatter.ofPattern("d MMMM, yyyy, HH:mm:ss:nnnnn");
        System.out.println(ldt);
        System.out.println(ldt.format(f));

        DateTimeFormatter f2 = DateTimeFormatter.ofPattern("MM dd yyyy");

        // parse data1 to format 'f2'
        LocalDate data1 = LocalDate.parse("11 22 2013", f2); // string "11 22 2013" should be the same as in ofPattern formatter
        System.out.println(data1);

        LocalDate data2 = LocalDate.parse("2021-11-22"); // standart java Date format can be used without ofPattern formatter
        System.out.println(data2);
    }
}
