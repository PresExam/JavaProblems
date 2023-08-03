package problems.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FilterStream {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,10,12,47,89);
        Stream<Integer> stream = numbers.stream();
        System.out.println("Even Numbers ");
        stream.filter(n -> n%2 == 0).forEach(System.out::println); // Even
        System.out.println("\nOdd Numbers ");
        numbers.stream().filter(n -> n%2 != 0).forEach(System.out::println); //Odd
    }
}