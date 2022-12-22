package solutions.solution_4;

public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        if (nums1.length == 0 || nums2.length == 0) {
            if (nums1.length == 0) {
                return (double) (nums2[0] + nums2[nums2.length - 1])/2;
            } else {
                return (double) (nums1[0] + nums1[nums1.length - 1])/2;
            }
        }

        int min, max;

        min = Math.min(nums1[0], nums2[0]);
        max = Math.max(nums1[nums1.length - 1], nums2[nums2.length - 1]);

        return (double) (max + min)/2;
    }

    public static void main(String[] args) {
        Solution s = new Solution();

        System.out.println(s.findMedianSortedArrays(new int[]{1,2}, new int[]{3,4}));
    }
}
