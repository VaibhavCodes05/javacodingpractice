package org.com.javaprograms.patterns;

public class AlphabetPatttern {

    public static void main(String[] args) {
        //1st. Alphabet Triangle pattern : req output
        // A
        // AB
        // ABC
        // ABCD
        System.out.println("1st. Alphabet Triangle pattern : req output");
        printAlphabetTrianglePattern();
        System.out.println();
    }

    private static void printAlphabetTrianglePattern() {
        int rows = 4;
        for(int i=1; i<=rows; i++) {
            for(int  j=1;j<=i;j++){
                System.out.print((char)('A'+j-1));
            }
            System.out.println();
        }

    }
}
