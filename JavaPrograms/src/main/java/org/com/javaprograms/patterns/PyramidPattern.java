package org.com.javaprograms.patterns;

public class PyramidPattern {

    public static void main(String[] args) {
        //1st. Pyramid pattern : req output
        //    *
        //   ***
        //  *****
        // *******

        // Here rows = 4
        // col = 7
        // so columns = 2*rows-1


        //now formula for spaces
        // 1st row -> 3 spaces  (row -1)
        // 2nd row -> 2 spaces  (row -2)
        // 3rd row -> 1 spaces  (row -3)
        // 4th row -> 0 spaces  (row -4)
        // so formula -> row - i

        // Formula for stars:
        // 1st row -> 1 star
        // 2nd row -> 3 stars
        // 3rd row -> 5 stars
        // 4th row -> 7 stars
        // so formula -> 2*i - 1
        System.out.println("1st. Pyramid pattern : req output");
        printPyramidPattern();
        System.out.println();
    }

    public static void printPyramidPattern(){
        int rows = 4;
        for(int i = 1; i <= rows; i++){
            //for spaces
            for(int j =1;j<=rows-i;j++){
                System.out.print(" ");
            }

            //for stars
            for(int k = 1; k<=2*i-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
