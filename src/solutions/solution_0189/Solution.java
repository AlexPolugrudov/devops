package solutions.solution_0189;

import java.util.Arrays;

public class Solution {
    public void rotate(int[] nums, int k) {

        k = k % nums.length;

        swap(nums, 0, nums.length - k - 1);
        swap(nums, nums.length - k, nums.length - 1);
        swap(nums, 0, nums.length - 1);

        System.out.println(Arrays.toString(nums));
    }

    private void swap(int[] arr, int k, int j) {
        int temp = 0;
        while (k < j) {
            temp = arr[k];
            arr[k] = arr[j];
            arr[j] = temp;
            k++;
            j--;
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        s.rotate(new int[]{-1,-100,3,99}, 2);
    }
}
