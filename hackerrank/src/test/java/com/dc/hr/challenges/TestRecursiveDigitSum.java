package com.dc.hr.challenges;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestRecursiveDigitSum {

    @Test
    void testCase0() {
        Assertions.assertEquals(3, RecursiveDigitSum.superDigit("148", 3));
    }

    @Test
    void testCase10() {
        Assertions.assertEquals(8, RecursiveDigitSum.superDigit("9875", 4));
    }

    @Test
    void testCase11() {
        Assertions.assertEquals(9, RecursiveDigitSum.superDigit("123", 3));
    }

    @Test
    void customTestCase1() {
        Assertions.assertEquals(3, RecursiveDigitSum.superDigit("123129387129831837914724172649871239648218934761298346129346128933642", 100000));
    }
}