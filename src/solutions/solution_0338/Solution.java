package solutions.solution_0338;

import java.util.Arrays;

public class Solution {
    public int[] countBits(int n) {

        int[] memo = new int[n + 1];

        memo[0] = 0;

        for(int i = 1; i < memo.length; i++) {
            memo[i] = memo[i >> 1] + i%2;
        }

        return memo;
    }

}
