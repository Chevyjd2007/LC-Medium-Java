package com.Chevy;

public class MaximumProductSubarray {


    public static void main(String[] args) {
        int[] nums = {-2,0,-1};
        // output: 0
        System.out.println(maxProduct(nums));

    }

    public static int maxProduct(int[] nums) {
        int answer = 0;
        int max = 1, min = 1;

        for (int n : nums) {
            if (n == 0){
                max = 1;
                min = 1;
            }

            int tmp = n * max;
            max = Math.max(tmp, min * n);
            max = Math.max(max, n);

            min = Math.max(tmp, n);
            min = Math.max(n , min);

            answer = Math.max(max, answer);
        }

        return answer;
    }

    // First handle of this problem. Fails later tests on LC
    public static int maxProduct1(int[] nums) {

        if (nums.length == 1)
            return nums[0];

        int answer = 1;
        int negCounter = 0;
        int prevAnswer = 1;

        int answerCounter = 0;

        int[] neg = new int[2];

        for (int n : nums) {
            if (n > 0) {
                answer *= n;
                answerCounter++;
            }

            else if (n < 0 && negCounter == 0) {
                neg[negCounter] = n;
                negCounter++;
                if (answer != 1)
                    prevAnswer = answer;
                answer = 1;
            }

            else if (n < 0 && negCounter == 1) {
                neg[negCounter] = n;
                negCounter = 0;
                answer = Math.max(answer * prevAnswer * neg[0] * neg[1], answer);
                prevAnswer = 0;
                answerCounter++;

            }

            else if (n == 0) {
                prevAnswer = 0;
            }
        }

        if (answerCounter == 0) {
            answer = 0;
        }

        return Math.max(answer, prevAnswer);
    }
}
