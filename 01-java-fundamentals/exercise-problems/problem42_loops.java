/* Write a program to print the **sum of all even numbers from 1 to N**
 */

import java.util.Scanner;

public class problem42_loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n ");
        int n = sc.nextInt();
        int sum = 0;
        System.out.print("The sum of all numbers from 1 to " + n + ": ");

        sum = n * (n + 1) / 2;
        System.out.print(sum);

        sc.close();

    }
}