package problems.datetime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DisplayFormattedDateTime {
    public static void main(String[] args) {
        LocalDateTime obj = LocalDateTime.now();
        DateTimeFormatter dt = DateTimeFormatter.ofPattern("E, dd-MMM-YYYY");
        DateTimeFormatter t = DateTimeFormatter.ofPattern("HH:MM");
        // E -> WeekDay
        // D -> Day no. of the Year
        String date = obj.format(dt);
        String time = obj.format(t);
        System.out.println("Formatted Date : " + date);
        System.out.println("Formatted Time : " + time);
    }
}
