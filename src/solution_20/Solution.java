package solution_20;

import java.util.Stack;

public class Solution {
    public boolean isValid(String s) {

        if (s == null || s.isEmpty()) {
            return false;
        }

        char[] chars = s.toCharArray();

        Stack<Character> characters = new Stack<>();

        for (char aChar : chars) {

            if (aChar == '(' || aChar == '[' || aChar == '{') {
                characters.push(aChar);
            }

            if (aChar == ')' || aChar == ']' || aChar == '}') {
                if (characters.isEmpty()) {
                    return false;
                }
                if (aChar == ')' && characters.pop() != '(') {
                    return false;
                }
                if (aChar == ']' && characters.pop() != '[') {
                    return false;
                }
                if (aChar == '}' && characters.pop() != '{') {
                    return false;
                }
            }
        }
        return characters.isEmpty();
    }
}
