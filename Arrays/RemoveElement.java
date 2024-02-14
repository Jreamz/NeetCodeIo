package Arrays;

// https://leetcode.com/problems/remove-element/
public class RemoveElement {

    public int removeElement(int[] nums, int val) {
        int swap = 0;

        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != val) {
                nums[swap] = nums[index];
                swap++;
            }
        }
        return swap;
    }
}
