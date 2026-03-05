/*Write a program that asks for **two numbers and an operator (+, -, \*, /)** and prints the result. */

import java.util.Scanner;

public class problem29_io {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter another number: ");
        double num2 = sc.nextDouble();
        System.out.print("Enter an operator (+/-/*//): ");
        char ops = sc.next().charAt(0);

        if (ops == '+') {
            System.out.println("The result is: " + (num1 + num2));
        } else if (ops == '-') {
            System.out.println("The result is: " + (num1 - num2));

        } else if (ops == '*') {
            System.out.println("The result is: " + (num1 * num2));

        } else if (ops == '/') {
            System.out.println("The result is: " + (num1 / num2));

        } else {
            System.out.println("Invalid operator entered.");

        }
        sc.close();

    }
}