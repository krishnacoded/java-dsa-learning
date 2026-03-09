/*Create a method:
printTable(int n)
that prints the multiplication table of `n` up to 10.

Example:
Input: `5`

Output:5 x 1 = 5
5 x 2 = 10
...
5 x 10 = 50
 */

public class problem09 {
    public static void printTable(int n) {
        System.out.println("Multiplication table of " + n + ": ");
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " X " + i + " = " + n * i);
        }
    }

    public static void main(String[] args) {
        printTable(18);
    }
}