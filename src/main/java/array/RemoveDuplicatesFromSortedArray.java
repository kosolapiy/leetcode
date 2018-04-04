package array;

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
