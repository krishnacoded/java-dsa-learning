/* Write a program to generate the **Fibonacci sequence up to N terms**
Example:
0 1 1 2 3 5 8 13
 */

import java.util.Scanner;

public class problem50_loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of terms: ");
        int n = sc.nextInt();
        int first = 0;
        System.out.print(first + " ");
        int second = 1;
        System.out.print(second + " ");

        for (int i = 0; i < n; i++) {
            int next = first + second;
            System.out.print(next + " ");
            first = second;
            second = next;

        }
        sc.close();

    }
}