package lv.zane;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTest {

    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println(date);

        LocalTime time = LocalTime.now();
        System.out.println("Time is: " + time);

        LocalDateTime dateTimeFormat = LocalDateTime.now();
        DateTimeFormatter formatterDateTime = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        DateTimeFormatter formatterDateTime2 = DateTimeFormatter.ISO_LOCAL_DATE;
        DateTimeFormatter formatterDateTime3 = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        String formattedDate = formatterDateTime.format(dateTimeFormat);
        String isoDate = formatterDateTime2.format(dateTimeFormat);
        String taskDate = formatterDateTime3.format(dateTimeFormat);

        System.out.println("After format: " + formattedDate);
        System.out.println("ISO date format: " + isoDate);
        System.out.println("Task1 "+ taskDate);
    }
}
