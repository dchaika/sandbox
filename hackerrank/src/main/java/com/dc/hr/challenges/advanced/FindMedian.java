package com.dc.hr.challenges.advanced;

import java.util.List;
import java.util.stream.Collectors;

public class FindMedian {

    /*
     * The median of a list of numbers is essentially its middle element after sorting.
     * The same number of elements occur after it as before.
     * Given a list of numbers with an odd number of elements, find the median. https://en.wikipedia.org/wiki/Median
     *
     * Complete the 'findMedian' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static int findMedian(List<Integer> arr) {
        return arr.stream()
                .sorted()
                .collect(Collectors.toList())
                .subList(arr.size() / 2, arr.size() / 2 + 1)
                .get(0);
    }
}