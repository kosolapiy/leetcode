package strings;

import java.util.Arrays;

public class ValidAnagram {
    //    "A man, a plan, a canal: Panama"
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
