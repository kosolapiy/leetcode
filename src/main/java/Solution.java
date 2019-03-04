import array.SingleNumber;
import strings.ImplementStrStr;

public class Solution {
    public static void main(String[] args) {
        int[] nums = {4,1,2,1,2};
        String haystack = "hello", needle = "ll";
        System.out.println(new ImplementStrStr().strStr(haystack, needle));
    }
}
