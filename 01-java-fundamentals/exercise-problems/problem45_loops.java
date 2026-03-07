/* Write a program to **reverse a number**.
 */

import java.util.Scanner;

public class problem45_loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to be reversed: ");
        int num = sc.nextInt();
        int reverse = 0;
        while (num > 0) {
            int last_digit = num % 10;
            num = num / 10;
            reverse = reverse * 10 + last_digit;
        }
        System.out.print(reverse);
        sc.close();

    }
}