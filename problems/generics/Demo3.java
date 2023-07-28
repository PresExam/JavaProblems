package problems.generics;

import java.util.HashMap;
import java.util.Map;

public class Demo3 {
    public static void main(String[] args) {
        Map<String, Integer> stmarks = new HashMap<>();

        stmarks.put("Ranjith", 92);
        stmarks.put("Avishai", 29);
        stmarks.put("Rakesh", 101);

        int ranjithMarks = stmarks.get("Ranjith");
        int avishaiMarks = stmarks.get("Avishai");
        int rakeshMarks = stmarks.get("Rakesh");

        System.out.println("Ranjith's Marks : "+ranjithMarks);
        System.out.println("Avinash's Marks : "+avishaiMarks);
        System.out.println("Rakesh's Marks : "+rakeshMarks);

    }
}
