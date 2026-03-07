/*  Write a program to **find the sum of digits of a number**.

 */

import java.util.Scanner;

public class problem46_loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int sum = 0;
        while (num > 0) {
            int last_digit = num % 10;
            num = num / 10;
            sum = sum + last_digit;
        }
        System.out.print("The sum is " + sum);

        sc.close();

    }
}