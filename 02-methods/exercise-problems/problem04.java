/*Create a method:
isPrime(int n)

that returns `true` if the number is prime, otherwise `false`.

Example:
Input: `11`  
Output: `Prime`
 */
public class problem04 {

    public static boolean isPrime(int n) {

        if (n <= 1) {
            return false;
        }

        for (int j = 2; j * j <= n; j++) {
            if (n % j == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        boolean result = isPrime(47);
        System.out.print(result);

    }
}