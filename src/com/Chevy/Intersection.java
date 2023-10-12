package com.Chevy;


import java.util.HashSet;
import java.util.Set;

public class Intersection {

    public static void main(String[] args) {
        int[] num1 = {1, 3, 4, 5, 9};

        int[] num2 = {1, 3, 9};

        int[] answer = intersection(num1, num2);

        for (int num : answer) {
            System.out.println(num);
        }
    }

    public static int[] intersection(int[] num1, int[] num2) {

        // We will need an
        Set<Integer> set1 = new HashSet<>();

        // You add all the values from array num1 into the set.
        // Repeated values in num1 will not be added per HashSet rules.
        for (int i : num1) {
            set1.add(i);
        }

        // We create another hashset which will include the values in the array num2 that are present in set1
        Set<Integer> set2 = new HashSet<>();
        // This pointer will iterate through num2 in the loop below
        int pointer = 0;
        for(int j : num2) {
            if(set1.contains(j)) {
                set2.add(j);
            }
            pointer++;
        }

        // We will loop through set2 (which includes the intersection) and add the values into a new array which we will return
        int index = 0;
        int[] answer = new int[set2.size()];
        for (int m : set2) {
            answer[index++] = m;
        }

        return answer;

    }
}
