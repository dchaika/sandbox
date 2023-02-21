package com.dc.hr.challenges;

import java.util.List;

public class DiagonalDifference {

    /*
     * Given a square matrix, calculate the absolute difference between the sums of its diagonals.
     *
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int diagonalDifference(List<List<Integer>> arr) {
        int len = arr.size();
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < len; i++) {
            sum1 += arr.get(i).get(i);
            sum2 += arr.get(i).get(len - 1 - i);
        }
        return Math.abs(sum1 - sum2);
    }
}