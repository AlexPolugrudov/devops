package solutions.solution_0026;

public class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums == null) return 0;

        int count = 1;
        int i = 0, j = 1;

        for (; i < nums.length; i++) {
            for (; j < nums.length; j++) {
                if (nums[i] != nums[j]) {

                    nums[count] = nums[j];
                    count++;

                    i = j;
                }
            }
        }
        return count;
    }
}
