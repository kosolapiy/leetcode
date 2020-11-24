package array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RotateArrayTest {

    @Test
    void rotate_1() {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int[] res = {5, 6, 7, 1, 2, 3, 4};
        new RotateArray().rotate(nums, 3);
        Assertions.assertArrayEquals(res, nums);
    }

    @Test
    void rotate_2() {
        int[] nums = {-1,-100,3,99};
        int[] res = {3,99,-1,-100};
        new RotateArray().rotate(nums, 2);
        Assertions.assertArrayEquals(res, nums);
    }
}