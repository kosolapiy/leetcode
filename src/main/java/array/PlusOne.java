package array;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Mikhail Pavlenko
 * <p>
 * Given a non-empty array of digits representing a non-negative integer, plus one to the integer.
 * The digits are stored such that the most significant digit is at the head of the list, and each element in the array contain a single digit.
 * You may assume the integer does not contain any leading zero, except the number 0 itself.
 * <p>
 * Example 1:
 * Input: [1,2,3]
 * Output: [1,2,4]
 * Explanation: The array represents the integer 123.
 * <p>
 * Example 2:
 * Input: [4,3,2,1]
 * Output: [4,3,2,2]
 * Explanation: The array represents the integer 4321.
 */

public class PlusOne {
    public int[] plusOne(int[] digits) {
        if (digits.length == 1 && digits[0] == 0) {
            return new int[]{1};
        }
        List<Integer> newDigits = new ArrayList<>();
        boolean sign = false;
        int inc = 1;

        for (int i = digits.length - 1; i >= 0; i--) {
            int newDigit = digits[i] + inc + (sign ? 1 : 0);
            if (newDigit == 10) {
                newDigits.add(0);
                sign = true;
            } else {
                newDigits.add(newDigit);
                sign = false;
            }
            inc = 0;
        }

        if (sign) {
            newDigits.add(1);
        }

        int[] result = new int[newDigits.size()];
        for (int i = 0; i < newDigits.size(); i++) {
            result[i] = newDigits.get(newDigits.size() - 1 - i);
        }

        return result;
    }
}
