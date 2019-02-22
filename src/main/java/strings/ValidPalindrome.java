package strings;

/**
 * @author Mikhail Pavlenko
 * <p>
 * Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
 * Note: For the purpose of this problem, we define empty string as valid palindrome.
 * <p>
 * Example 1:
 * Input: "A man, a plan, a canal: Panama"
 * Output: true
 * <p>
 * Example 2:
 * Input: "race a car"
 * Output: false
 */

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        if (s.length() == 0) {
            return true;
        }

        s = s.toLowerCase();

        StringBuilder new_s = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
//            if ((c >= 'a' && c <= 'z') || (c >= '0' && c <= '9')) {
            if (Character.isLetterOrDigit(c)) {
                new_s.append(c);
            }
        }

        for (int i = 0; i < new_s.length() / 2; i++) {
            if (new_s.charAt(i) != new_s.charAt(new_s.length() - i - 1)) {
                return false;
            }
        }

        return true;
    }
}
