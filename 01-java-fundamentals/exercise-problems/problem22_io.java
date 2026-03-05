/* Write a program that takes an integer input and prints:
You entered: X
*/

import java.util.Scanner;

public class problem22_io {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();
        System.out.print("You entered: " + num);
        sc.close();

    }
}