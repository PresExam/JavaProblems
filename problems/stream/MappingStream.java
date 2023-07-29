package problems.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MappingStream {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,10,20,30,40,50);
        Stream<Integer> stream = numbers.stream();
        stream.map(n -> n*n).forEach(System.out::println);
    }
}
