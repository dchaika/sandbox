package com.dc.hr.challenges;

import java.util.List;

public class MinimumBribes {

    /*
     * It is New Year's Day and people are in line for the Wonderland rollercoaster ride.
     * Each person wears a sticker indicating their initial position in the queue from 1 to n.
     * Any person can bribe the person directly in front of them to swap positions, but they still wear their original sticker.
     * One person can bribe at most two others.
     * Determine the minimum number of bribes that took place to get to a given queue order.
     * Print the number of bribes, or, if anyone has bribed more than two people, print "Too chaotic".
     *
     * Complete the 'minimumBribes' function below.
     *
     * The function accepts INTEGER_ARRAY q as parameter.
     */

    public static void minimumBribes(List<Integer> q) {
        int bribes = 0;
        for (int i = q.size() - 1; i > 0; i--) {
            int current = q.get(i);
            int expected = i + 1;
            int prev = q.get(i - 1);
            if (current != expected) {
                if (prev == expected) {
                    bribes++;
                    swap(q, i - 1, i);
                } else if (i - 2 >= 0 && q.get(i - 2) == expected) {
                    bribes += 2;
                    swap(q, i - 2, i - 1);
                    swap(q, i - 1, i);
                } else {
                    System.out.println("Too chaotic");
                    return;
                }
            }
        }
        System.out.println(bribes);
    }

    private static void swap(List<Integer> q, int index1, int index2) {
        int temp = q.get(index1);
        q.set(index1, q.get(index2));
        q.set(index2, temp);
    }
}