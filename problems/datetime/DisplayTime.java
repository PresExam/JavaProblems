package problems.datetime;

import java.time.LocalTime;

public class DisplayTime {
    public static void main(String[] args) {
        LocalTime obj = LocalTime.now();
        System.out.println("Current time is : " + obj);
    }
}
