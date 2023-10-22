package com.Chevy;

public class LongestSubstringOfAllVowelsinOrder {

    public int longestBeautifulSubstring(String word) {

        int maxLength = 0,  currentLength = 0, count = 0;

        for (int i = 0; i < word.length(); i++) {
            if (i > 0 && word.charAt(i) < word.charAt(i - 1)) {
                count = 0;
            currentLength = 0;
            }

            if (count == 0 && word.charAt(i) == 'a')
                count++;
            else if (count == 1 && word.charAt(i) == 'e')
                count++;
            else if (count == 2 && word.charAt(i) == 'i')
                count++;
            else if (count == 3 && word.charAt(i) == 'o')
                count++;
            else if (count == 4 && word.charAt(i) == 'u')
                count++;

            currentLength++;

            if (count == 5)
                maxLength = Math.max(maxLength, currentLength);
        }

        return maxLength;
    }
}
