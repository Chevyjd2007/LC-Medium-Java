package com.Chevy;

import java.util.ArrayList;
import java.util.List;

public class LetterCasePermutation {

    public static void main(String[] args) {

        String s = "a1b2";

        List<String> output = letterCasePermutation(s);



    }

    public static List<String> letterCasePermutation(String s) {

        List<String> answer = new ArrayList<>();
        answer.add(s);

        StringBuilder builder = new StringBuilder(s);

        boolean m = false;


        for (int i = 0; i < builder.length(); i++) {
            StringBuilder original = new StringBuilder(s);
            Character c = builder.charAt(i);
            if (Character.isAlphabetic(c) && Character.isLowerCase(c)){

                builder.setCharAt(i, Character.toUpperCase(c));
                answer.add(builder.toString());
                if (m) {
                    original.setCharAt(i, Character.toUpperCase(c));
                    answer.add(original.toString());
                }
                m = true;

            } else if (Character.isAlphabetic(c) && Character.isUpperCase(c)) {
                builder.setCharAt(i, Character.toLowerCase(c));
                answer.add(builder.toString());
                if (m) {
                    original.setCharAt(i, Character.toLowerCase(c));
                    answer.add(original.toString());
                }
                m = true;
            }
        }

        return answer;
    }
}
