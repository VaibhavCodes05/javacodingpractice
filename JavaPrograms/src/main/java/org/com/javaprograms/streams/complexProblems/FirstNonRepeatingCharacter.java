package org.com.javaprograms.streams.complexProblems;

import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        String str = "ilovejava";

        str.chars()
                .mapToObj(c -> (char)c)
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        LinkedHashMap::new,
                        Collectors.counting()
                )).entrySet()
                .stream()
                .filter(e -> e.getValue() == 1)
                .findFirst()
                .ifPresent((c) -> {
                    System.out.println("First Non Repeating Character :" + c.getKey());
                });
    }

}
