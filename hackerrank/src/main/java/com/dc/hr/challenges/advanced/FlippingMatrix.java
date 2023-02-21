package com.dc.hr.challenges.advanced;

import java.util.List;

public class FlippingMatrix {

    /*
     * Sean invented a game involving a 2n * 2n matrix where each cell of the matrix contains an integer.
     * He can reverse any of its rows or columns any number of times.
     * The goal of the game is to maximize the sum of the elements in the n * n sub-matrix located in the upper-left quadrant of the matrix.
     *
     * Given the initial configurations for q matrices,
     * help Sean reverse the rows and columns of each matrix in the best possible way
     * so that the sum of the elements in the matrix's upper-left quadrant is maximal.
     *
     * Complete the 'flippingMatrix' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY matrix as parameter.
     */

    public static int flippingMatrix(List<List<Integer>> matrix) {
        if (matrix.size() > 256) {
            throw new IllegalArgumentException("Matrix size has exceeded constraint value: " + matrix.size());
        }
        int[][] m = new int[matrix.size()][matrix.size()];
        for (int x = 0; x < matrix.size(); x++) {
            for (int y = 0; y < matrix.get(x).size(); y++) {
                if (matrix.get(x).get(y) > 4096) {
                    throw new IllegalArgumentException("Matrix[" + x + "][" + y + "] value has exceeded constraint value: " + matrix.get(x).get(y));
                }
                m[x][y] = matrix.get(x).get(y);
            }
        }
        return flippingMatrix(m);
    }

    public static int flippingMatrix(int[][] matrix) {
        int maxSum = 0;
        int len = matrix.length; // Entire matrix size
        int n = matrix.length / 2; // Upper-left matrix size
        for (int x = 0; x < n; x++) {
            for (int y = 0; y < n; y++) {
                int maxValue = -1;
                maxValue = Math.max(matrix[x][y], maxValue);
                maxValue = Math.max(matrix[x][len - 1 - y], maxValue);
                maxValue = Math.max(matrix[len - 1 - x][y], maxValue);
                maxValue = Math.max(matrix[len - 1 - x][len - 1 - y], maxValue);

                maxSum += maxValue;
            }
        }
        return maxSum;
    }
}