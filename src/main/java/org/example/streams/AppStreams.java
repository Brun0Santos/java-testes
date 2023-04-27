package org.example.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AppStreams {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 3, 4, 2, 4, 12, 11);

        List<Integer> integerStream = numbers.stream().map(i -> i * 10).limit(3).toList();

        integerStream.forEach(System.out::println);

        int sum = numbers.stream().reduce(0, (x, y) -> x + y);
        System.out.println("SOU PUTOOOOOOOOOOOOOO");
        System.out.println(sum);

        System.out.println(Arrays.toString(numbers.toArray()));
    }
}
