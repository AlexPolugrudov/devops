package solutions.solution_35;

public class Solution {
    public int searchInsert(int[] nums, int target) {
        if (nums == null) return 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            } else if (target > nums[i]) {
                return i + 1;
            }
        }
        return nums.length;
    }
}
