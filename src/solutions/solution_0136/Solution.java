package solutions.solution_0136;

public class Solution {
    public int singleNumber(int[] nums) {
        int mask = 0;

        for (int num : nums) {
            mask ^= num;
        }
        return mask;
    }
}
