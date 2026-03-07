/* Write a program that takes **three angles of a triangle** and determines whether the triangle is:
Equilateral
Isosceles
Scalene
Invalid */

import java.util.Scanner;

public class problem35_conditionals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the three angles of a triangle: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        if (a + b + c == 180) {
            if (a == 90 || b == 90 || c == 90) {
                System.out.print("The triangle is Right angled.");
            } else if (a < 90 && b < 90 && c < 90) {
                System.out.print("The triangle is Scalane.");

            } else if (a == b && b == c) {
                System.out.print("The triangle is equilateral.");

            } else {
                System.out.print("The triangle is isosceles.");

            }
        } else {
            System.out.print("NOT A TRIANGLE (sum of angles is not 180).");

        }

        sc.close();

    }
}