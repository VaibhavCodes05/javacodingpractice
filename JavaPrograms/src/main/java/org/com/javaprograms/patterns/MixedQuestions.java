package org.com.javaprograms.patterns;

public class MixedQuestions {
    public static void main(String[] args) {
//        Question 1
//        1
//        21
//        321
//        4321
//
//        rows= 4;
//        rows increase cols increase
//        1st row i=1 -> 1       what to print i-j+1 -> 1-1+1 = 1
//        2nd row i=2 -> 21		what to print i-j+1 -> 2-1+1 = 2 and second iteration of j -> 2-2+1 =1
//        3rd row i=3 -> 321		what to print i-j+1 -> 3-1+1 = 3 and second iteration of j -> 3-2+1 =2 and third iteration of j -> 3-3+1 =1
        System.out.println("Question 1 : req output");
        printQusetion1Pattern();
        System.out.println();

//        Question 2:
//        A
//        BB
//        CCC
//        DDDD
//
//        rows = 4
//        rows increase columns increase
//        what to print :
//        1st row : A   -> 'A' + i - 1
//        2nd row : BB  -> 'A' + i - 1

        System.out.println("Question 2 : req output");
        printQuestion2Pattern();
        System.out.println();


//	Question 3
//		   1
//		  121
//		 12321
//		1234321
//
//		rows = 4
//		cols logic = 2*rows-1
//		three things to print one is space and second one is ascending numbers and then third descending number
// 		formula for space = rows - i
//		formula for 1st part : what to print : j; limit j<=i
//		formula for 2nd part : 1st row -> skip
//							   2nd row -> 1      Start with j=i-1 and print j
//							   3rd row -> 21
//							   4th row -> 321

            System.out.println("Question 3 : req output");
            printQuestion3Pattern();
            System.out.println();

        }

    private static void printQuestion3Pattern() {
        int rows = 4;


        for(int i =1; i<=rows; i++) {
            // print spaces
            for(int j=1;j<= rows-i; j++) {
                System.out.print(" ");
            }

            //print 1st part
            for(int j=1; j<=i; j++) {
                System.out.print(j);
            }

            //print 2nd Part
            for(int j=i-1;j>=1; j--) {
                System.out.print(j);
            }

            System.out.println();
        }

    }

    private static void printQuestion2Pattern() {
        int rows =4;
        for(int i=1;i<=rows;i++){
            for(int j = 1;j<=i;j++){
                System.out.print((char)('A'+i-1));
            }
            System.out.println();
        }
    }

    private static void printQusetion1Pattern() {
        int rows = 4;
        for(int i = 1; i<=rows; i++){
            for(int j=1; j<=i;j++){
                System.out.print(i-j+1);
            }
            System.out.println();
        }
    }
}
