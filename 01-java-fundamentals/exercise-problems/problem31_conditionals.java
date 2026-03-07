/*Write a program that takes a number and determines whether it is:
Positive
Negative
Zero
 */

import java.util.Scanner;

public class problem31_conditionals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double num = sc.nextDouble();
        if (num != 0) {
            if (num > 0) {
                System.out.print("The number is positive.");
            } else {
                System.out.print("The number is negative");
            }
        } else {
            System.out.print("The number is Zero.");
        }

        sc.close();

    }
}