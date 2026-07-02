package org.com.javaprograms.streams.complexProblems;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharFrequencyInString {

    public static void main(String[] args) {
         String str = "ilovejava";

        Map<Character, Long> frequencymap =
                str.chars()
                 .mapToObj(c -> (char)c)
                 .collect(Collectors.groupingBy(
                         Function.identity(),
                         LinkedHashMap::new,
                         Collectors.counting()
                 ));

        frequencymap.forEach((c, v) -> {
            System.out.println(c + " -> " + v );
        });


    }
}
