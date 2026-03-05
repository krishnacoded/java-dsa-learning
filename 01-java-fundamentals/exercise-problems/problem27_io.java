/*  Write a program that takes **length and width** as input and prints the **area of a rectangle**. */

import java.util.Scanner;

public class problem27_io {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length: ");
        double length = sc.nextDouble();
        System.out.print("Enter the width: ");
        double width = sc.nextDouble();

        double area = length * width;
        System.out.print("The area of the rectangle is: " + area);
        sc.close();
    }
}