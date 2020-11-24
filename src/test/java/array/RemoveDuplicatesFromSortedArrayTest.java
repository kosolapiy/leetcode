package array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RemoveDuplicatesFromSortedArrayTest {

    @Test
    public void removeDuplicatesFromSortedArray_1() {
        int[] nums = {1, 1, 2};
        Assertions.assertEquals(2, new RemoveDuplicatesFromSortedArray().removeDuplicates(nums));
    }

    @Test
    public void removeDuplicatesFromSortedArray_2() {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        Assertions.assertEquals(5, new RemoveDuplicatesFromSortedArray().removeDuplicates(nums));
    }
}