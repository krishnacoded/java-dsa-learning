/* Write a program that checks whether three numbers can form a **valid triangle**.

Rule:
a + b > c
b + c > a
a + c > b */

import java.util.Scanner;

public class problem39_conditionals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three angles: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        if ((a + b) > c && (b + c) > c && (a + c) > b && (a+b+c) == 180) {
            System.out.print("The three angles can form a valid triangle");

        } else {
            System.out.print("The three angles cannot form a valid triangle.");

        }

        sc.close();

    }
}