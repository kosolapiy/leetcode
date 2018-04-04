package array;

public class RotateArray {
    void rotate(int[] nums, int k) {
        if (nums.length == 1) {
            return;
        }

        int[] old = nums.clone();

        for (int i = 0; i < nums.length; i++) {
            nums[(i + k) % nums.length] = old[i];
        }
    }
}
