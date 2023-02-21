package com.dc.hr.challenges;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class LonelyInteger {

    /*
     * Given an array of integers, where all elements but one occur twice, find the unique element.
     *
     * Complete the 'lonelyinteger' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY a as parameter.
     */

    public static int lonelyinteger(List<Integer> a) {
        List<Integer> list = a.stream().sorted().collect(Collectors.toList());
        for (int i = 0; i < list.size() - 1; i += 2) {
            if (!Objects.equals(list.get(i), list.get(i + 1))) {
                return list.get(i);
            }
        }
        return list.get(list.size() - 1);
    }
}