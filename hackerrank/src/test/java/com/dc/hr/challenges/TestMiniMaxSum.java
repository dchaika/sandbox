package com.dc.hr.challenges;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;

public class TestMiniMaxSum {
    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @AfterEach
    public void tearDown() {
        System.setOut(standardOut);
    }

    @Test
    void testCase0() {
        MiniMaxSum.miniMaxSum(Arrays.asList(1, 2, 3, 4, 5));
        Assertions.assertEquals("10 14", outputStreamCaptor.toString().trim());
    }

    @Test
    void testCase14() {
        MiniMaxSum.miniMaxSum(Arrays.asList(7, 69, 2, 221, 8974));
        Assertions.assertEquals("299 9271", outputStreamCaptor.toString().trim());
    }
}