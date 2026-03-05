/* Write a program that takes two numbers as input and prints their **sum**.
 */

import java.util.Scanner;

public class problem23_io {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter another number: ");
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        System.out.print("The sum of both numbers is: " + sum);

        sc.close();

    }
}