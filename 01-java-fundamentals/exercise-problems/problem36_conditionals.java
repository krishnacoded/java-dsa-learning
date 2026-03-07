/* Write a program that takes a number and determines whether it is:
Single-digit
Double-digit
Three-digit
More */

import java.util.Scanner;

public class problem36_conditionals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double num = sc.nextDouble();
        if (num >= 100 && num < 1000) {
            System.out.print("The number is triple digit");

        } else if (num >= 10 && num < 100) {
            System.out.print("The number is double digit");
        } else if (num < 10) {
            System.out.print("The number is single digit.");

        } else {
            System.out.print("The number is neither single digit, nor double or triple digit.");

        }

        sc.close();

    }
}