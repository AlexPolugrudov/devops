package solutions.solution_0070;

public class Solution {
    public int climbStairs(int n) {

        if ( n == 1) return 1;

        int one = 1;
        int two = 2;

        for (int i = 3; i < n + 1; i++) {
            int tmp = one;
            one = two;
            two += tmp;
        }

        return two;
    }
}
