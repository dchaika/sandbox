package com.dc.hr.challenges;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class TestLonelyInteger {
    @Test
    void testCase0() {
        Assertions.assertEquals(1, LonelyInteger.lonelyinteger(Arrays.asList(1)));
    }

    @Test
    void testCase1() {
        Assertions.assertEquals(2, LonelyInteger.lonelyinteger(Arrays.asList(1, 1, 2)));
    }

    @Test
    void testCase2() {
        Assertions.assertEquals(2, LonelyInteger.lonelyinteger(Arrays.asList(0, 0, 1, 2, 1)));
    }
}