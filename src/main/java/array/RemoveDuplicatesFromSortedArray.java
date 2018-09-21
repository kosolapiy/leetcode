package array;

/**
 * @author Mikhail Pavlenko
 * <p>
 * Given a sorted array nums, remove the duplicates in-place such that each element appear only once and return the new length.
 * Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
 * <p>
 * Example 1:
 * Given nums = [1,1,2],
 * Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively.
 * It doesn't matter what you leave beyond the returned length.
 * <p>
 * Example 2:
 * Given nums = [0,0,1,1,1,2,2,3,3,4],
 * Your function should return length = 5, with the first five elements of nums being modified to 0, 1, 2, 3, and 4 respectively.
 * It doesn't matter what values are set beyond the returned length.
 */

public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        if(nums.length < 2)        {
            return nums.length;
        }
        int i = 0;
        int newLength = 1;
        int current = nums[i];
        while (true){
            if(current != nums[i+1]){
                nums[newLength] = nums[i+1];
                ++newLength;
                current = nums[i+1];
            }
            if(i == nums.length - 2){
                break;
            }
            ++i;
        }

        return newLength;
    }
}
