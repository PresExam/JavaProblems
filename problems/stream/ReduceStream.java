package problems.stream;

import java.util.Arrays;
import java.util.List;

public class ReduceStream {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
        int sum = numbers.stream().reduce(0,(a,b) -> a+b); // 0+1+2+3+4+5
        System.out.println("The sum is : "+sum);
        int product = numbers.stream().reduce(1,(a,b) -> a*b); // 1*1*2*3*4*5
        System.out.println("The product is : "+product);
    }
}
