package Lesson28;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class HomeWork28 {

    //date Template 1 used for working hours
    DateTimeFormatter workHoursDataFormat = DateTimeFormatter.ofPattern("YYYY, MMMM-dd !! HH:mm");

    // date Template 2 used for rest hours
    DateTimeFormatter restHoursDataFormat = DateTimeFormatter.ofPattern("HH:mm, dd/MMM/YY");

    //method workShift
    void workShift(LocalDateTime ldtStart, LocalDateTime ldtFinish, Period perOfWork, Duration durOfRest){
        do {
            System.out.println("");
            System.out.print("Working from: " + ldtStart.format(workHoursDataFormat));
            ldtStart = ldtStart.plus(perOfWork);
            System.out.print(" Till: "+ ldtStart.format(workHoursDataFormat));

            System.out.println("");
            System.out.print("Rest time is frorm: "+ ldtStart.format(restHoursDataFormat));
            ldtStart = ldtStart.plus(durOfRest);
            System.out.print(" till: "+ldtStart.format(restHoursDataFormat));
        }
        while (ldtStart.isBefore(ldtFinish));
    }

    public static void main(String[] args) {
        //create object for our method
        HomeWork28 worker1 = new HomeWork28();
        //set date time period and duration variables
        LocalDateTime ldtStart = LocalDateTime.of(2021, Month.APRIL,7,00,00);
        LocalDateTime ldtFinish = LocalDateTime.of(2021, Month.APRIL,7,00,00);
        Period perOfWork = Period.of(0,0,1);
        Duration durOfRest = Duration.ofHours(16);

        //run method
        worker1.workShift(ldtStart,ldtFinish,perOfWork,durOfRest);
    }
}
