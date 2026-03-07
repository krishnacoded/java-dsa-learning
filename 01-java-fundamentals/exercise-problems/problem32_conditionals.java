/* Write a program to determine the **largest of three numbers** entered by the user.*/

import java.util.Scanner;

public class problem32_conditionals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        if (a > b && b >= c) {
            System.out.print("A is the largest number");
        } else if (b > c && c >= a) {
            System.out.print("B is the largest number");
        } else if (c > a && a >= b) {
            System.out.print("C is the largest number.");
        } else {
            System.out.print("Theres no single largest number");
        }

        sc.close();

    }
}