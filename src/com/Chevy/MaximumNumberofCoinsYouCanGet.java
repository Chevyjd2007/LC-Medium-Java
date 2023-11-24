package com.Chevy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MaximumNumberofCoinsYouCanGet {

    public static void main(String[] args) {

        int[] piles = {9,8,7,6,5,1,2,3,4};

        System.out.println(maxCoins(piles));

    }

    public static int maxCoins(int[] piles) {
        int alice = 0, me = 0, bob = piles[0];

        int answer = 0;

        List<Integer> list = new ArrayList<>();

        for (int c : piles) {
            list.add(c);
        }

        Collections.sort(list);
        int a = 0;

        while (list.size() >= 3) {
            int n = list.size();
            alice = list.get(n - 1);
            me = list.get(n - 2);
            answer += me;

            list.remove(n - 1);
            list.remove(n - 2);
            list.remove(a);
        }


        return answer;
    }
}
