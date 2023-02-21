package com.dc.hr.challenges;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CountingSort1 {

    /*
     * Quicksort usually has a running time of n * log(n), but is there an algorithm that can sort even faster?
     * In general, this is not possible.
     * Most sorting algorithms are comparison sorts, i.e. they sort a list just by comparing the elements to one another.
     * A comparison sort algorithm cannot beat n * log(n) (worst-case) running time,
     * since n * log(n) represents the minimum number of comparisons needed to know where to place each element.
     * For more details, you can see these notes (PDF) http://www.cs.cmu.edu/~avrim/451f11/lectures/lect0913.pdf.
     *
     * Alternative Sorting
     * Another sorting method, the counting sort, does not require comparison.
     * Instead, you create an integer array whose index range covers the entire range of values in your array to sort.
     * Each time a value occurs in the original array, you increment the counter at that index.
     * At the end, run through your counting array, printing the value of each non-zero valued index that number of times.
     *
     * Complete the 'countingSort' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static List<Integer> countingSort(List<Integer> arr) {
        List<Integer> result = new ArrayList<>(arr.size());
        int[] array = new int[arr.size()];
        for (int i : arr) {
            array[i] += 1;
        }
        for (int i : array) {
            result.add(i);
        }
        return result.stream().limit(100).collect(Collectors.toList());
    }
}