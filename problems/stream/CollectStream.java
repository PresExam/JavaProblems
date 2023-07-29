package problems.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectStream {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
        List<Integer> squares = numbers.stream().map(n -> n*n).collect(Collectors.toList());
        System.out.println(numbers);
        System.out.println(squares);
    }
}
