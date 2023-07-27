package problems.datetime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class MonthAgo {
    public static void main(String[] args) {
        LocalDateTime obj = LocalDateTime.now();
        DateTimeFormatter dt = DateTimeFormatter.ofPattern("E, dd-MMM-YYYY");
        DateTimeFormatter t = DateTimeFormatter.ofPattern("HH:MM");
        LocalDateTime ago = LocalDateTime.now().minusMonths(53);
        DateTimeFormatter dtago = DateTimeFormatter.ofPattern("E, dd-MMM-YYYY");
        DateTimeFormatter tago = DateTimeFormatter.ofPattern("HH:MM");
        // E -> WeekDay
        // D -> Day no. of the Year
        String date = obj.format(dt);
        String time = obj.format(t);
        System.out.println("Today's Date : " + date);
        System.out.println("Current Time : " + time);
        // 53 Months Ago
        String dateago = ago.format(dtago);
        String timeago = ago.format(tago);
        System.out.println("53 Month's Ago Date : " + dateago);
        System.out.println("53 Month's Ago Time : " + timeago);
    }
}
