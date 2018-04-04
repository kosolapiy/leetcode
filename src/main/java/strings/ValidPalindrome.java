package strings;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        if (s.length() == 0) {
            return true;
        }

        s = s.toLowerCase();

        StringBuilder new_s = new StringBuilder("");
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if ((c >= 'a' && c <= 'z') || (c >= '0' && c <= '9')) {
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
