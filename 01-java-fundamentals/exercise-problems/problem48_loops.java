/* Write a program to determine whether a number is **prime**.

 */

import java.util.Scanner;

public class problem48_loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int flag = 0;
        for (int i = 2; i <= (Math.sqrt(num)); i++) {
            if (num % i == 0) {
                flag = 1;
            }
        }
        if (flag == 0 && num >= 2) {
            System.out.print("Prime ");
        } else {
            System.out.print("NOT Prime ");
        }

        sc.close();

    }
}