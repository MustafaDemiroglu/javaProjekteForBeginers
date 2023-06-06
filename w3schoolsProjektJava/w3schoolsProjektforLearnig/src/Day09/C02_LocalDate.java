package Day09;

import java.sql.Date;
import java.time.LocalTime ;
import java.time.LocalDateTime ;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;


public class C02_LocalDate {

    public static void main(String[] args) {

        LocalTime time = LocalTime.now();
        LocalTime time2 = LocalTime.MAX;
        LocalTime time3 = LocalTime.MIN;
        LocalTime time4 = LocalTime.MIDNIGHT;
        LocalTime time5 = LocalTime.NOON;
        System.out.println(time);
        System.out.println(time2);
        System.out.println(time3);
        System.out.println(time4);
        System.out.println(time5);

        System.out.println("---------------------------------");

        LocalDateTime time6 = LocalDateTime.now();
        LocalDateTime time7 = LocalDateTime.MAX;
        LocalDateTime time8 = LocalDateTime.MIN;
        System.out.println(time6);
        System.out.println(time7);
        System.out.println(time8);

        System.out.println("---------------------------------");

        LocalDate time9 = LocalDate.now();
        LocalDate time10 = LocalDate.MAX;
        LocalDate time11 = LocalDate.MIN;
        LocalDate time12 = LocalDate.ofEpochDay(2012);
        LocalDate time13 = LocalDate.EPOCH;
        System.out.println(time9);
        System.out.println(time10);
        System.out.println(time11);
        System.out.println(time12);
        System.out.println(time13);

        System.out.println("---------------------------------");

        LocalDateTime myDateObj = LocalDateTime.now();
        System.out.println("Before formatting : " + myDateObj);
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        String formattedDate = myDateObj.format(myFormatObj) ;
        System.out.println("After Formatting : " + formattedDate);

    }
}
