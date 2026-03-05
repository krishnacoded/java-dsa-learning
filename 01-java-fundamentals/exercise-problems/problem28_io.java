
/* Write a program that takes **a number from the user** and prints its **square and cube**.
 */
import java.util.Scanner;

public class problem28_io {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        double num = sc.nextDouble();

        double square = num * num;
        double cube = num * num * num;

        System.out.println("The square of " + num + " is " + square + " and its cube is " + cube + ".");
        sc.close();
    }
}