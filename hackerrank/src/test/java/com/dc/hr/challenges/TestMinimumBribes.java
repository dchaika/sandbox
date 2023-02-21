package com.dc.hr.challenges;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;

public class TestMinimumBribes {
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
    void testCase0_1() {
        MinimumBribes.minimumBribes(Arrays.asList(2, 1, 5, 3, 4));
        Assertions.assertEquals("3", outputStreamCaptor.toString().trim());
    }

    @Test
    void testCase0_2() {
        MinimumBribes.minimumBribes(Arrays.asList(2, 5, 1, 3, 4));
        Assertions.assertEquals("Too chaotic", outputStreamCaptor.toString().trim());
    }

    @Test
    void testCase1_1() {
        MinimumBribes.minimumBribes(Arrays.asList(1, 2, 5, 3, 7, 8, 6, 4));
        Assertions.assertEquals("7", outputStreamCaptor.toString().trim());
    }

    @Test
    void testCase1_2() {
        MinimumBribes.minimumBribes(Arrays.asList(5, 1, 2, 3, 7, 8, 6, 4));
        Assertions.assertEquals("Too chaotic", outputStreamCaptor.toString().trim());
    }

    @Test
    void testCase11() {
        MinimumBribes.minimumBribes(Arrays.asList(1, 2, 5, 3, 4, 7, 8, 6));
        Assertions.assertEquals("4", outputStreamCaptor.toString().trim());
    }
}