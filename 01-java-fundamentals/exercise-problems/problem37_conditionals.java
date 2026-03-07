/*  Write a program that asks for a **month number (1–12)** and prints the number of days in that month.
 */

import java.util.Scanner;

public class problem37_conditionals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the month number(1-12): ");
        int month = sc.nextInt();

        switch (month) {
            case 1: {
                System.out.print("The month is January with 31 days");

            }
                break;
            case 2: {
                System.out.print("The month is February with 28/29 days");

            }
                break;
            case 3: {
                System.out.print("The month is March with 31 days");

            }
                break;
            case 4: {
                System.out.print("The month is April with 30 days");
            }
                break;
            case 5: {
                System.out.print("The month is May with 31 days");

            }
                break;
            case 6: {
                System.out.print("The month is June with 30 days");

            }
                break;
            case 7: {
                System.out.print("The month is July with 31 days");

            }
                break;
            case 8: {
                System.out.print("The month is August with 31 days");

            }
                break;
            case 9: {
                System.out.print("The month is September with 30 days");

            }
                break;
            case 10: {
                System.out.print("The month is October with 31 days");

            }
                break;
            case 11: {
                System.out.print("The month is November with 30 days");

            }
                break;
            case 12: {
                System.out.print("The month is December with 31 days");

            }
                break;
        }

        sc.close();

    }
}