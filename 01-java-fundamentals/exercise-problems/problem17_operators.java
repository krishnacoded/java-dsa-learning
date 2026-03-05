/* Write a program that evaluates a logical expression such as:
(a > b && b > c)
and prints the result. */
public class problem17_operators {
    public static void main(String[] args) {
        int a = 15, b = 11, c = 19;
        if (a > b && b > c) {
            System.out.println("A is the largest number");
        } else {
            System.out.println("A is NOT the largest number");
        }
    }
}