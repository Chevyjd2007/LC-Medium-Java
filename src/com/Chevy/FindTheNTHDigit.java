package com.Chevy;

public class FindTheNTHDigit {

    public static void main(String[] args) {

    }


    // My solution which is intuitive but abuses memory as the n gets bigger
    public static int findNthDigit(int n) {

        StringBuilder s = new StringBuilder();

        for (int i = 1; i <= n; i++) {
            s.append(Integer.toString(i));
        }

        int answer = Integer.parseInt(Character.toString(s.charAt(n - 1)));

        return answer;

    }

    // ChatGPT's much more efficient solution

    public class Solution {
        public int findNthDigit(int n) {
            int len = 1; // length of numbers (1 for 1-9, 2 for 10-99, etc.)
            long count = 9; // count of numbers in the range
            int start = 1; // starting number in the range

            // Find the length of the number where the nth digit is located
            while (n > len * count) {
                n -= len * count;
                len += 1;
                count *= 10;
                start *= 10;
            }

            // Find the actual number where the nth digit is located
            start += (n - 1) / len;

            // Find the nth digit and return
            String s = Integer.toString(start);
            return Character.getNumericValue(s.charAt((n - 1) % len));
        }
    }

}
