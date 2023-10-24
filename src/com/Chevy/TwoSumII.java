package com.Chevy;

public class TwoSumII {

    public static void main(String[] args) {

        int[] numbers = {0,0,3,4};
        int n = 0;

        int[] answer = twoSum(numbers, n);

        // Output = 1, 2
        System.out.println("_________________");
        for (int i : answer) {
            System.out.println(i);
        }
    }

    // Runs at O(nlogn) thus slower than the optimal GPT solution
    public static int[] twoSum(int[] numbers, int target) {

        int[] answer = new int[2];

        for (int i = 0; i < numbers.length; i++) {
            int tmp = target - numbers[i];

            int a = 0;
            int b = numbers.length - 1;

            int c = 0;

            // binary search
            while (a <= b) {
                c = a + (b - a) /2;

                if (numbers[c] == tmp) {
                    if (c != i)
                        break;
                    else
                        a = c + 1;
                }


                else if (numbers[c] < tmp )
                    a = c + 1;

                else
                    b = c - 1;
            }

            if (numbers[i] + numbers[c] == target) {
                answer[0] = i + 1;
                answer[1] = c + 1;
                break;
            }
        }

        return answer;
    }
}
