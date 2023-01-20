package solutions.solution_0053;

public class Solution {
    public int maxSubArray(int[] nums) {
        int max_sum = nums[0];
        int current_sum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int num = nums[i];

            current_sum = Math.max(current_sum + num, num);
            max_sum = Math.max(current_sum, max_sum);
        }

        return max_sum;
    }
}
