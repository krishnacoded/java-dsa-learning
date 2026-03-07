/*  Write a program to check whether a number is a **palindrome**.

 */

import java.util.Scanner;

public class problem47_loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int original = num;
        int reverse = 0;
        while (num > 0) {
            int last_digit = num % 10;
            num /= 10;
            reverse = reverse * 10 + last_digit;
        }

        if (reverse == original) {
            System.out.print("The number is a palindrome.");
        } else {
            System.out.print("The number is NOT a palindrome.");
        }
        sc.close();

    }
}