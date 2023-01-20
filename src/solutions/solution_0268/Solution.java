package solutions.solution_0268;

import java.util.stream.IntStream;

public class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;

        // Сумма (ожидаемая) - сумма (фактическая)
        return n*(n+1)/2 - IntStream.of(nums).sum();
    }
}
