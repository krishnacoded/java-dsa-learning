/*  Write a program to print the **multiplication table of a number up to 20**
 */

import java.util.Scanner;

public class problem43_loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.println("Multiplication Table of " + n + ": ");

        for (int i = 1; i <= 20; i++) {
            System.out.println(n + " X " + i + " = " + n * i);
        }

        sc.close();

    }
}