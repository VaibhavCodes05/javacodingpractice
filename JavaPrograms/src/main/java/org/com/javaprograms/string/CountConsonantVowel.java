package org.com.javaprograms.string;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CountConsonantVowel {
    public static void main(String[] args) {
        String input = "Hello World";
        countConsonantVowel(input.toLowerCase());
    }

    private static void countConsonantVowel(String input) {
        int vowelCount = 0;
        int consonantCount = 0;

        List<Character> vowels = Arrays.asList('a','e','i','o','u');

        for(char c : input.replace(" ", "").toCharArray()){
            if(vowels.contains(c)){
                vowelCount++;
            }else{
                consonantCount++;
            }
        }
        System.out.println("Vowel Count : " + vowelCount);
        System.out.println("Consonant Count : " + consonantCount);
    }
}
