package org.com.javaprograms.patterns;

public class StarPattern {

    public static void main(String[] args) {
        //1st. Square pattern : req output
        // ****
        // ****
        // ****
        // ****
        System.out.println("1st. Square pattern : req output");
        printSquarePattern();
        System.out.println();

        // 2nd. Right Angle Triangle pattern
        // Required Output:
        //  *
        //  **
        //  ***
        //  ****
        System.out.println("2nd. Right Angle Triangle pattern : req output");
        printRightAngledTrianglePattern();
        System.out.println();

        // 3rd. Inverted Right Angle Triangle pattern(Reverse Triangle)
        // Required Output :
        //   ****
        //   ***
        //   **
        //   *
        System.out.println("3rd. Inverted Right Angle Triangle pattern : req output");
        printInvertedRightAngledTriangle();
        System.out.println();


    }

    private static void printInvertedRightAngledTriangle() {
        int rows = 4;
        for(int i = 1; i<=rows; i++) {
            for(int j = 1; j<= rows-i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

    private static void printRightAngledTrianglePattern() {
        int rows = 4;

        for(int i = 1; i<=rows; i++) {
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void printSquarePattern(){
        int rows = 4;
        int cols = 4;

        for(int i = 1; i <= rows; i++){
            for(int j = 1; j<=cols; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
