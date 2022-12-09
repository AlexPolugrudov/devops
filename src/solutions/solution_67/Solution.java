package solutions.solution_67;

public class Solution {
    public static String addBinary(String a, String b) {
        StringBuilder str = new StringBuilder();

        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;

        while (i >= 0 || j >= 0 || carry == 1) {
            int dA = i < 0 ? 0 : a.charAt(i--) - '0';
            int dB = j < 0 ? 0 : b.charAt(j--) - '0';
            str.insert(0, (dA + dB + carry) % 2);
            carry = (dA + dB + carry) / 2;
        }
        return str.toString();
    }

    public static void main(String[] args) {
        System.out.println(addBinary("110", "111"));
    }
}
