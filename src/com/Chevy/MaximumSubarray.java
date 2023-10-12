package com.Chevy;

public class MaximumSubarray {
    public static void main(String[] args ) {

    }

    public static int maxSubArrau(int[] nums) {
        // We can't instatiate largestSum to 0 because there may be negative numbers.
        int largestSum = nums[0];
        // This is the integer value that will be used to check if the summation of the current subarray.
        int currentSum = 0;


        // We iterate through the nums array resetting currentSum to 0 if it's a negative value.
        // If not, we add it to largest sum.
        for (int num : nums) {
            if (currentSum < 0) {
                currentSum = 0;
            }

            currentSum += num;
            largestSum = Math.max(largestSum, currentSum);
        }

        return largestSum;
    }
}
