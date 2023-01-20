package solutions.solution_0448;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int i = 0;

        while (i < nums.length) {
            int pos = nums[i] - 1;

            if (nums[i] != nums[pos]) {
                int tmp = nums[pos];
                nums[pos] = nums[i];
                nums[i] = tmp;
            } else
                i += 1;
        }
        List<Integer> list = new ArrayList<>();

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j + 1)
                list.add(j + 1);
        }
        return list;
    }
}
