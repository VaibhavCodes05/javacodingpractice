package org.com.javaprograms.patterns;

public class NumberPattern {
    public static void main(String[] args) {
        //1st.Number Triangle
        //Output:
        //   1
        //   12
        //   123
        //   1234

        System.out.println("1st.Number Triangle : req output");
        printNumberTrianglePattern();
        System.out.println();

        // 2nd. Number Triangle
        // 1
        // 22
        // 333
        // 4444

        // Rows =  4;
        //Columns = depends on rows
        //Print row number for each column in that row
        System.out.println("2nd.Number Triangle: req output");
        printNumberTrianglePattern1();
        System.out.println();

        // 3rd. Number Triangle Inverted
        // 1234
        // 123
        // 12
        // 1

        // Rows =  4;
        //i=1 → print upto  4-1+1=4
        //i=2 → print upto  4-2+1=3
        //i=3 → print upto  4-3+1=2
        // print j
        System.out.println("3rd.Number Triangle Inverted  : req output");
        printNumberTrianglePatternInverted();
        System.out.println();

    }

    private static void printNumberTrianglePatternInverted() {
        int rows = 4;
        for(int i = 1; i<=rows; i++) {
            for(int j = 1; j<=rows-i+1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    private static void printNumberTrianglePattern1() {
        int rows = 4;
        for(int i = 1; i<=rows; i++) {
            for(int j = 1; j<=i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    private static void printNumberTrianglePattern() {
        int rows =4;
        for(int i = 1; i<=rows; i++){
            for(int j =1; j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
