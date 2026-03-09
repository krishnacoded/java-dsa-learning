/*Write a method:
factorial(int n)

that returns the factorial of a number.

Example:
Input: `5`  
Output: `120`
 */
public class problem03 {
    public static int factorial(int n) {
        int i = 1;
        int result = 1;
        while (i <= n) {
            result *= i;
            i++;
        }
        return result;
    }

    public static void main(String args[]) {
        int factorial = factorial(6);
        System.out.print(factorial);
    }
}