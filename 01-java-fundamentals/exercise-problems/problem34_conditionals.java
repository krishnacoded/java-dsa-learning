/* Write a program that checks whether a year is a **leap year**.

Rules:
Divisible by 4
Not divisible by 100
Unless divisible by 400
 */

import java.util.Scanner;

public class problem34_conditionals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an year: ");
        int year = sc.nextInt();
        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
            System.out.print("This is a leap year");
        } else {
            System.out.print("This is NOT a leap year.");
        }
        sc.close();

    }
}