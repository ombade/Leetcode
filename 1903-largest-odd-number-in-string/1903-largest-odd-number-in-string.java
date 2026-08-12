class Solution {
    public String largestOddNumber(String num) {
        int n = num.length();

        while (n > 0) {
            int lastDigit = num.charAt(n - 1) - '0';

            if (lastDigit % 2 == 1) {
                return num.substring(0, n);
            }

            n--;
        }

        return "";
    }
}