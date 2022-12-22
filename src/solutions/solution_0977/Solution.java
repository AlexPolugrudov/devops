package solutions.solution_0977;

import java.util.Arrays;

public class Solution {
    public int[] sortedSquares(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int) Math.pow(nums[i], 2);
        }
        int j;

        for (int i = 1; i < nums.length; i++) {
            int swap = nums[i];

            for (j = i; j > 0 && swap < nums[j - 1]; j--) {
                nums[j] = nums[j - 1];
            }
            nums[j] = swap;
        }

        return nums;
    }

    public static void main(String[] args) {
        Solution s = new Solution();

        System.out.println(Arrays.toString(s.sortedSquares(new int[]{-7, -3, 2, 3, 11})));
    }
}
