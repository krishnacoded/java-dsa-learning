/*
=========================================================
JAVA METHODS
Topic: Recursion Introduction
File: recursion-intro.java
=========================================================

Recursion is when a method calls itself.

Instead of solving a problem directly,
the method breaks the problem into a smaller version
of the same problem.

Example idea:

factorial(5)

= 5 * factorial(4)
= 5 * 4 * factorial(3)
= 5 * 4 * 3 * factorial(2)
= 5 * 4 * 3 * 2 * factorial(1)

=========================================================
IMPORTANT RULE OF RECURSION
=========================================================

Every recursive function must have:

1. Base Case
2. Recursive Case

Base Case → stopping condition
Recursive Case → function calling itself

Without a base case → infinite recursion.

=========================================================
EXAMPLE 1: PRINT NUMBERS 1 TO N
=========================================================
*/

public class RecursionIntro {

    public static void printNumbers(int n) {

        // base case
        if (n == 0) {
            return;
        }

        // recursive call
        printNumbers(n - 1);

        // print after recursive call
        System.out.println(n);
    }

    /*
     * =========================================================
     * EXAMPLE 2: FACTORIAL
     * =========================================================
     * 
     * factorial(5)
     * 
     * 5 × 4 × 3 × 2 × 1
     */

    public static int factorial(int n) {

        // base case
        if (n == 0 || n == 1) {
            return 1;
        }

        // recursive case
        return n * factorial(n - 1);
    }

    /*
     * =========================================================
     * EXAMPLE 3: SUM OF FIRST N NUMBERS
     * =========================================================
     */

    public static int sumN(int n) {

        if (n == 1) {
            return 1;
        }

        return n + sumN(n - 1);
    }

    public static void main(String[] args) {

        System.out.println("Print numbers using recursion:");
        printNumbers(5);

        System.out.println("\nFactorial:");
        int fact = factorial(5);
        System.out.println(fact);

        System.out.println("\nSum of first N numbers:");
        int sum = sumN(5);
        System.out.println(sum);
    }
}