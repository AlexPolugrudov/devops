package solutions.solution_0303;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> sums = new ArrayList<>();

    public Solution(int[] nums) {

        int current_num = 0;

        for (int i = 0; i < nums.length; i++) {
            current_num += nums[i];
            sums.add(current_num);
        }

    }

    public int sumRange(int left, int right) {
        if (left == 0)
            return sums.get(right);
        return sums.get(right) - sums.get(left - 1);
    }
}
