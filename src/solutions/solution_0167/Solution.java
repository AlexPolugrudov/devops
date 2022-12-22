package solutions.solution_0167;

import java.util.Arrays;

public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] res = new int[]{0,0};

        if (numbers.length == 2) {
            if (numbers[0] == target - numbers[1]) {
                res[0] = 1;
                res[1] = 2;
            }
            return res;
        }

        int start = 0, end = numbers.length - 1;
        while (start < end) {
            int v = numbers[start] + numbers[end];
            if (v == target) {
                res[0] = numbers[start];
                res[1] = numbers[end];
                return res;
            } else if (v > target) {
                end--;
            } else {
                start++;
            }
        }

        return res;
    }

}
