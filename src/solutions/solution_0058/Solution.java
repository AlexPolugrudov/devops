package solutions.solution_0058;

public class Solution {
    public static int lengthOfLastWord(String s) {
        int count = 0;
        StringBuilder str = new StringBuilder(s);
        str.reverse();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ' && count == 0) {
                continue;
            } else {
                if (str.charAt(i) == ' ') {
                    return count;
                }
                count++;
            }
        }
        System.out.println(count);
        return count;
    }

    public static void main(String[] args) {
        lengthOfLastWord(" qwer were ww  ");
    }
}
