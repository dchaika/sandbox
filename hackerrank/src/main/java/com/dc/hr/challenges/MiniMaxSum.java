package com.dc.hr.challenges;

import java.util.Comparator;
import java.util.List;

public class MiniMaxSum {

    /*
     * Given five positive integers, find the minimum and maximum values that can be calculated by summing exactly four of the five integers.
     * Then print the respective minimum and maximum values as a single line of two space-separated long integers.
     *
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
        long minSum = arr.stream()
                .mapToLong(i -> i)
                .sorted()
                .limit(4)
                .reduce(0L, Long::sum);
        long maxSum = arr.stream()
                .mapToLong(i -> i)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .limit(4)
                .reduce(0L, Long::sum);
        System.out.println(minSum + " " + maxSum);
    }
}