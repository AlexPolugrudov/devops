package solution_27;

public class Solution {
    public int removeElement(int[] nums, int val) {
        if (nums == null) return 0;

        int count = 0;
        int i = 0;

        for(; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[count] = nums[i];
                count++;
            }
        }
        return count;
    }
}
