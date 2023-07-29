package problems.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CreatingStream {
    public static void main(String[] args) {

        // First Method
        // Source -> Array

        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
        Stream<Integer> stream1 = numbers.stream();
        stream1.forEach(System.out::println);

        // Alternate Method
        // Source -> Array

        int arr[] = {1,2,3,4,5,6};
        IntStream stream2 = Arrays.stream(arr);
        stream2.forEach(System.out::println);
    }
}
