package com.dc.hr.challenges;

public class RecursiveDigitSum {

    /*
     * We define super digit of an integer x using the following rules:
     * Given an integer, we need to find the super digit of the integer.
     * - If x has only 1 digit, then its super digit is x.
     * - Otherwise, the super digit of x is equal to the super digit of the sum of the digits of x.
     *
     * Complete the 'superDigit' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. STRING n
     *  2. INTEGER k
     */

    public static int superDigit(String n, int k) {
        while (n.length() > 1) {
            long sum = 0;
            for (char c : n.toCharArray()) {
                sum += Integer.parseInt(String.valueOf(c));
            }
            n = String.valueOf(sum);
        }

        StringBuilder sb = new StringBuilder(n);
        for (int i = 0; i < k - 1; i++) {
            sb.append(n);
        }
        String s = sb.toString();

        while (s.length() > 1) {
            long sum = 0;
            for (char c : s.toCharArray()) {
                sum += Integer.parseInt(String.valueOf(c));
            }
            s = String.valueOf(sum);
        }

        return Integer.parseInt(s);
    }
}