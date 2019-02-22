package strings;

import java.util.Arrays;

/**
 * @author Mikhail Pavlenko
 * <p>
 * Given two strings s and t , write a function to determine if t is an anagram of s.
 * <p>
 * Example 1:
 * Input: s = "anagram", t = "nagaram"
 * Output: true
 * <p>
 * Example 2:
 * Input: s = "rat", t = "car"
 * Output: false
 * <p>
 * Note:
 * You may assume the string contains only lowercase alphabets.
 * <p>
 * Follow up:
 * What if the inputs contain unicode characters? How would you adapt your solution to such case?
 */

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if (s == null || t == null || s.length() != t.length()) {
            return false;
        }

        char[] a_s = s.toCharArray();
        Arrays.sort(a_s);
        char[] a_t = t.toCharArray();
        Arrays.sort(a_t);

        return Arrays.equals(a_s, a_t);
    }
}
