/* Write a program that determines the **quadrant of a point (x, y)** in the coordinate plane.
x > 0, y > 0 → Quadrant 1
x < 0, y > 0 → Quadrant 2
x < 0, y < 0 → Quadrant 3
x > 0, y < 0 → Quadrant 4

Also handle cases where the point lies on the axes.
 */

import java.util.Scanner;

public class problem40_conditionals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the x-coordinate of the point: ");
        int x = sc.nextInt();
        System.out.print("Enter the y-coordinate of the point: ");
        int y = sc.nextInt();

        if (x > 0 && y > 0) {
            System.out.print("The point is in 1st Quadrant.");

        } else if (x > 0 && y < 0) {
            System.out.print("The point is in 4th Quadrant");

        } else if (x < 0 && y < 0) {
            System.out.print("The point is in 3rd Quadrant");

        } else {
            System.out.print("The point is in 2nd Quadrant");

        }
        sc.close();

    }
}