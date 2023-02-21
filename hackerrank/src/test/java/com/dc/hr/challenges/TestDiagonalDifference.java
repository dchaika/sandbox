package com.dc.hr.challenges;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class TestDiagonalDifference {
    @Test
    void testCase0() {
        Assertions.assertEquals(
                15,
                DiagonalDifference.diagonalDifference(
                        Arrays.asList(
                                Arrays.asList(11, 2, 4),
                                Arrays.asList(4, 5, 6),
                                Arrays.asList(10, 8, -12))));
    }
}