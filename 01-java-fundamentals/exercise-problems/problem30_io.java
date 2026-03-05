/*Write a program that asks the user for **five numbers and prints their sum and average**. */

import java.util.Scanner;

public class problem30_io {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter five numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        int sum = a + b + c + d + e;
        double avg = (double) sum / 5;

        System.out.println("The sum is: " + sum);
        System.out.println("The average is: " + avg);

        sc.close();

    }
}