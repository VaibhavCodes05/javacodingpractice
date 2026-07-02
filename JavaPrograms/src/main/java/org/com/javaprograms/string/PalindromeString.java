package org.com.javaprograms.string;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = sc.nextLine();
        checkPalindromeString(input);
    }

    private static void checkPalindromeString(String input) {
        int left = 0;
        int right = input.length() - 1;

        while(left<right){
            if(input.charAt(left)!= input.charAt(right)){
                System.out.println("Input String is not a palindrome");
                return;
            }
            left++;
            right--;
        }
        System.out.println("Input String is a palindrome.");
        }
}
