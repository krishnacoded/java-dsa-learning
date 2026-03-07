/* Write a program to print **all prime numbers between 1 and N**.

 */

import java.util.Scanner;

public class problem49_loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        for (int i = 2; i <= num; i++) {
            boolean isPrime = true;
            for (int j = 2; j * j <= i; j++)
                if (i % j == 0) {
                    isPrime = false;
                    ;
                }
            if (isPrime) {
                System.out.print(i + " ");
            }
        }

        sc.close();

    }
}