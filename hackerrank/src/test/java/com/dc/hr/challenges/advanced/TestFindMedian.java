package com.dc.hr.challenges.advanced;

import com.dc.hr.challenges.advanced.FindMedian;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class TestFindMedian {

    @Test
    void testCase0() {
        Assertions.assertEquals(3, FindMedian.findMedian(Arrays.asList(0, 1, 2, 4, 6, 5, 3)));
    }
}