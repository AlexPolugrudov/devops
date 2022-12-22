package solutions.solution_0344;

public class Solution {
    public void reverseString(char[] s) {

        char temp = '0';

        if (s.length >= 2) {
            for (int i = 0; i < s.length/2; i++) {
                temp = s[i];
                s[i] = s[s.length - 1 - i];
                s[s.length - 1 - i] = temp;
            }
        }

    }

}
