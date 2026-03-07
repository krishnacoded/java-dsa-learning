/* Write a program to print numbers from **1 to N** using a loop.
 */

import java.util.Scanner;

public class problem41_loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of N: ");
        int N = sc.nextInt();
        System.out.print("The counting numbers from 1 to " + N + ": ");
        for (int i = 1; i <= N; i++) {
            System.out.print(i + "  ");
        }

        sc.close();

    }
}