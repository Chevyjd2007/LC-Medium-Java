package com.Chevy;

public class SumOfTwoIntegers {

    public static void main(String[] args) {
        int a = 2;
        int b = 3;

        System.out.println(getSum(a, b));
    }

    // Treat the summation with xor and && operations of their binary counterpart
    public static int getSum(int a, int b) {


        // b is carry value
        while ( b != 0) {
            int temp = (a & b) << 1;
            a = a ^ b;
            b = temp;
        }

        return a        ;

    }
}
