package problems.exceptionhandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem5 {
    public static void main(String[] args) throws IOException {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            String str = " ";
            System.out.println("Enter data or press any key...");
            str = br.readLine();
            System.out.println(str);
        }
    }
}
