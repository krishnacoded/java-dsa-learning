/*Write a program that asks for **name and age** and prints:
<Name> is <age> years old. */

import java.util.Scanner;

public class problem25_io {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.println("Hello, my name is " + name + " and i am " + age + " years old.");
        sc.close();
    }
}