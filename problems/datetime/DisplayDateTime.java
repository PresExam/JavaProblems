package problems.datetime;

import java.time.LocalDateTime;

public class DisplayDateTime {
    public static void main(String[] args) {
        LocalDateTime obj = LocalDateTime.now();
        System.out.println("Current Date & Time is : " + obj);
    }
}
