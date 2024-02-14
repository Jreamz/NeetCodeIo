package Arrays;

// https://leetcode.com/problems/concatenation-of-array/

public class ConcatOfArray {

    public int[] getConcatenation(int[] nums) {

        int[] ans = new int[nums.length * 2];

        for (int index = 0; index < nums.length; index++) {
            ans[index] = nums[index];
            ans[index + nums.length] = nums[index]; // Adding the length of original array, so 0 + n, 1 + n, 2 + n, etc.
            System.out.println(ans[index + nums.length]);
        }
        return ans;
    }
}
