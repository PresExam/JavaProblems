package problems.datetime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class WeeksAfter {
    public static void main(String[] args) {
        LocalDateTime obj = LocalDateTime.now();
        DateTimeFormatter dt = DateTimeFormatter.ofPattern("E, dd-MMM-YYYY");
        DateTimeFormatter t = DateTimeFormatter.ofPattern("HH:MM");
        // Plus 47 Weeks
        LocalDateTime after = LocalDateTime.now().plusWeeks(47);
        DateTimeFormatter dtafter = DateTimeFormatter.ofPattern("EEEE, dd-MMMM-YYYY");
        DateTimeFormatter tafter = DateTimeFormatter.ofPattern("HH:MM");
        // E -> WeekDay
        // D -> Day no. of the Year
        String date = obj.format(dt);
        String time = obj.format(t);
        System.out.println("Today's Date : " + date);
        System.out.println("Current Time : " + time);
        // After 47 Weeks
        String dateafter = after.format(dtafter);
        String timeafter = after.format(tafter);
        System.out.println("Date after 47 Weeks : " + dateafter);
        System.out.println("Time after 47 Weeks : " + timeafter);
    }
}
