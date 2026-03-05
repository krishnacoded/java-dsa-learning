/* Write a program that takes the user's **name as input** and prints:
Hello <name> */

import java.util.Scanner;

public class problem21_io {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Hello, " + name);
        sc.close();

    }
}