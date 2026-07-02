package org.com.javaprograms.patterns;

public class HollowPattern {

    public static void main(String[] args) {
        //1st. Hollow Square pattern : req output
        // ****
        // *  *
        // *  *
        // ****

        //Here rows = 4
        //i=1 → print 4 stars
        //i=2 → print 1 star, 2 spaces, 1 star
        //i=3 → print 1 star, 2 spaces, 1 star
        //i=4 → print 4 stars
        System.out.println("1st. Hollow Square pattern : req output");
        printHollowSquarePattern();
        System.out.println();
    }

    public static void printHollowSquarePattern(){

        int rows = 4;
        for(int i = 1; i <= rows; i++) {
            for(int j =1; j<=rows; j++) {
                if (i == 1 || i == rows) {
                    System.out.print("*");
                } else if (j == 1 || j == rows) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
