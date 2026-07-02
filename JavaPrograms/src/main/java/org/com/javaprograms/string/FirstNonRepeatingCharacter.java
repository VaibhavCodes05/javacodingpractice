package org.com.javaprograms.string;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args){
        String input = "aabbccadeeaabf";

        printFirstNonRepeatingCharacterUsingLinkedHashMap(input);
        printFirstNonRepeatingCharacterWithoutHashMap(input);
    }

    private static void printFirstNonRepeatingCharacterUsingLinkedHashMap(String input) {
        Map<Character, Integer> counterMap = new LinkedHashMap<>();

        for(char c : input.toCharArray()){
            counterMap.put(c, counterMap.getOrDefault(c, 0)+1);
        }

        for(Map.Entry<Character, Integer> entry : counterMap.entrySet()){
            if(entry.getValue()==1){
                System.out.println("First non repeating character : " +entry.getKey());
                return;
            }
        }

        System.out.println("No non repeating character found in the given string");
    }

    private static void printFirstNonRepeatingCharacterWithoutHashMap(String input) {
        int[] counterArray = new int[256];

        for(char c : input.toCharArray()){
            counterArray[c]++;
        }

       for(char c : input.toCharArray()){
           if(counterArray[c] == 1){
               System.out.println("First non repeating character : " +c);
               return;
           }
       }
    }
}
