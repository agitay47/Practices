package Collections.Udemy;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

import static java.util.Calendar.DATE;

public class LocaLdate {
    public static void main(String[] args) {
//        LocalDate date = LocalDate.parse("2018-04-30", DateTimeFormatter.ISO_LOCAL_DATE);
//        date.plusDays(2);
//       // date.plusHours(3);
//        System.out.println(date.getYear() + " " + date.getMonth() + " "
//                + date.getDayOfMonth());



//        LocalDate date = LocalDate.of(2018, Month.APRIL, 40);
//        System.out.println(date.getYear() + " " + date.getMonth() + " "
//                + date.getDayOfMonth());

//        LocalDate date = LocalDate.of(2018, Month.APRIL, 30);
//        date.plusDays(2);
//        date.plusYears(3);
//        System.out.println(date.getYear() + " " + date.getMonth() + " "
//                + date.getDayOfMonth());


//        LocalDateTime d = LocalDateTime.of(2015, 5, 10, 11, 22, 33);
//        Period p = Period.of(1, 2, 3);
//        d = d.minus(p);
//        DateTimeFormatter f = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
//        System.out.println(d.format(f));

        System.out.println("====================================================");

        LocalDateTime d = LocalDateTime.of(2015, 5, 10, 11, 22, 33);
        Period p = Period.ofDays(1).ofYears(2);
        d = d.minus(p);
        DateTimeFormatter f = DateTimeFormatter.ofLocalizedDateTime(FormatStyle
                .SHORT);
        System.out.println(f.format(d));
    }
}
