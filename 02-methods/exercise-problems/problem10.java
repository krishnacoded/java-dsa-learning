/* Write a method:
countDigits(int n)
that returns the number of digits in the number.

Example:
Input: `45678`  
Output: `5`
 */
public class problem10 {

    public static int countDigits(int n) {
        int count = 0;
        while (n > 0) {
            n = n / 10;
            count++;
        }

        return count;

    }

    public static void main(String[] args) {
        int result = countDigits(438345);
        System.out.print(result);
    }
}