package com.dc.hr.challenges;

import java.util.List;

public class PlusMinus {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
        int positiveCounter = 0;
        int negativeCounter = 0;
        int zeroCounter = 0;

        for (int i : arr) {
            if (i > 0) {
                positiveCounter++;
                continue;
            }
            if (i < 0) {
                negativeCounter++;
                continue;
            }
            zeroCounter++;
        }
        System.out.printf("%.6f%n", (double) positiveCounter / arr.size());
        System.out.printf("%.6f%n", (double) negativeCounter / arr.size());
        System.out.printf("%.6f%n", (double) zeroCounter / arr.size());
    }
}