package solutions.solution_0278;

public class Solution {

    public static final int bad = 8;
    public int firstBadVersion(int n) {

        int start = 1, end = n;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (!isBadVersion(mid)) {
                start = mid + 1;
            } else end = mid;
        }
        return start;
    }

    public static boolean isBadVersion(int version) {
        return version >= bad;
    }

    public static void main(String[] args) {
        Solution s = new Solution();

        System.out.println(s.firstBadVersion(8));
    }
}
