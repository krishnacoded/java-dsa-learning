/* Write a program that asks for a student's marks and prints the grade:
90+ → A
75–89 → B
60–74 → C
40–59 → D
<40 → Fail */

import java.util.Scanner;

public class problem33_conditionals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your marks: ");
        double marks = sc.nextDouble();
        if (marks >= 90 && marks <= 100) {
            System.out.print("Congrats, you got an A+");
        } else if (marks < 90 && marks >= 75) {
            System.out.print("Congrats, you got a B");
        } else if (marks < 75 && marks >= 60) {
            System.out.print("Congrats, you got a C");

        } else if (marks < 60 && marks >= 40) {
            System.out.print("Congrats, you got a D");

        } else if (marks < 40) {
            System.out.print("You have failed the exam, better luck next time!");

        } else {
            System.out.print("Invalid entry");

        }
        sc.close();

    }
}