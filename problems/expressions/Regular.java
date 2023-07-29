package problems.expressions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regular {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word : ");
        String word = sc.nextLine();
        Pattern pattern = Pattern.compile(word);
        Matcher matcher = pattern.matcher("We are learning JAVA");
        boolean matchFound = matcher.find();
        System.out.println(matchFound);

        if(matchFound)
            System.out.println("Match Founded");
        else
            System.out.println("Match not Founded");
    }
}
