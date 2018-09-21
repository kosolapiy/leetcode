package array;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Mikhail Pavlenko
 * <p>
 * Given an array of integers, find if the array contains any duplicates.
 * Your function should return true if any value appears at least twice in the array, and it should return false if every element is distinct.
 * <p>
 * Example 1:
 * Input: [1,2,3,1]
 * Output: true
 * <p>
 * Example 2:
 * Input: [1,2,3,4]
 * Output: false
 * <p>
 * Example 3:
 * Input: [1,1,1,3,3,4,3,2,4,2]
 * Output: true
 */


public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        if (nums.length < 2) {
            return false;
        }

        Set<Integer> set = new HashSet<>();
        set.add(nums[0]);
        for (int i = 1; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                return true;
            } else {
                set.add(nums[i]);
            }
        }

        return false;
    }
}
