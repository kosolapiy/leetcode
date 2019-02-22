package strings;

/**
 * @author Mikhail Pavlenko
 * <p>
 * Given a 32-bit signed integer, reverse digits of an integer.
 * <p>
 * Example 1:
 * Input: 123
 * Output: 321
 * <p>
 * Example 2:
 * Input: -123
 * Output: -321
 * <p>
 * Example 3:
 * Input: 120
 * Output: 21
 * <p>
 * Note:
 * Assume we are dealing with an environment which could only store integers within the 32-bit signed integer range: [-2^31,  2^31 - 1].
 * For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.
 */

public class ReverseInteger {
    public int reverse(int x) {
        if (x > -10 && x < 10) {
            return x;
        }

        boolean isNegative = false;
        String s = String.valueOf(x);
        if (x < 0) {
            s = s.substring(1);
            isNegative = true;
        }

        try {
            int res = Integer.parseInt(new StringBuilder(s).reverse().toString());
            return isNegative ? res * -1 : res;
        } catch (NumberFormatException e) {
            return 0;
        }
    }
}
