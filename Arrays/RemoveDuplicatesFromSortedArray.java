package Arrays;

// https://leetcode.com/problems/remove-duplicates-from-sorted-array/

class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        int counter = 1;

        for (int index = 1; index < nums.length; index++) {
            if (nums[index] != nums[index - 1]) {
                nums[counter] = nums[index];
                counter++;
            }
        }
        return counter;
    }
}
