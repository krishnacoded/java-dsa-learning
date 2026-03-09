/*Write a method `isEven(int n)` that returns `true` if the number is even and `false` otherwise.

Example:
Input: `7`  
Output: `Odd`
 */

public class problem01 {

    public static boolean isEven(int n) {
        if (n % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        boolean result = isEven(9);
        System.out.print(result);
    }
}