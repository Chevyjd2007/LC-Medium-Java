package com.Chevy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/*
Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ times.



Example 1:

Input: nums = [3,2,3]
Output: [3]
Example 2:

Input: nums = [1]
Output: [1]
Example 3:

Input: nums = [1,2]
Output: [1,2]
 */

public class MajorityElementTwo {

    public static void main(String[] arg) {

    }

    public List<Integer> majorityElement(int[] nums) {

        // Majority element
        int n = nums.length/3;

        // Map that will hold the occurrences of values in nums
        Map<Integer, Integer> map = new HashMap<>();

        // What we will return for our solution
        List<Integer> answer = new ArrayList<>();

        /*
            We iterate through nums while counting the occurrences of each value in a mao.
            If the occurrence of said value is greater than the majority element,
            then we add that element to our output list
         */
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);

            if (map.get(num) > n && !answer.contains(num)) {
                answer.add(num);
            }
        }

        return answer;


    }
}
