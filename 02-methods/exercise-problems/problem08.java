/*Write a method:
power(int base, int exponent)
that returns `base^exponent`.

Example:
Input: `2 5`  
Output: `32`
 */
public class problem08 {
    public static int power(int base, int exponent) {
        int result = 1;
        for (int i = 1; i <= exponent; i++) {
            result = result * base;
        }

        return result;
    }

    public static void main(String[] args) {
        int power = power(3, 5);
        System.out.print(power);
    }
}