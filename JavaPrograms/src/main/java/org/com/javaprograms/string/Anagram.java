package org.com.javaprograms.string;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
         String str = "listen";
         String str1 = "silent";

         //brute force
        boolean isAnagram =  checkAnagramBruteForce(str,str1);

        //optimized frequency array
        boolean isAnagram1 = checkAnagramByFrequencyArray(str, str1);

        //optimized sorting
        boolean isAnagram2 = checkAnagramBySorting(str, str1);

        if(isAnagram && isAnagram1 && isAnagram2){
            System.out.println("Given strings are anagrams.");
        }else {
            System.out.println("Given strings are not anagrams.");
        }

    }

    private static boolean checkAnagramBySorting(String str, String str1) {

        char[] arr = str.toCharArray();
        char[] arr1 = str1.toCharArray();
        Arrays.sort(arr);
        Arrays.sort(arr1);
        return Arrays.equals(arr, arr1);
    }

    private static boolean checkAnagramByFrequencyArray(String str, String str1) {

        if(str.length()!=str1.length()) {
            return false;
        }
        int[] freq = new int[26];
        for(int i=0;i<str.length();i++){
            freq[str.charAt(i) - 'a']++;
            freq[str1.charAt(i) - 'a']--;
        }

        for(int count: freq){
            if(count!=0){
                return false;
            }
        }
        return true;
    }

    private static boolean checkAnagramBruteForce(String str, String str1) {

        if(str.length() != str1.length()){
            return false;
        }else {
            boolean [] used = new boolean[str1.length()];

            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                boolean found = false;

                for(int j =0; j<str1.length();j++){
                    if(!used[j] && c == str1.charAt(j)){
                        used[j]= true;
                        found = true;
                        break;
                    }
                }

                if(!found){
                    return false;
                }
            }
        }
        return true;
    }
}
