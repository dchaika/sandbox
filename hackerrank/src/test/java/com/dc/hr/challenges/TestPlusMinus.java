package com.dc.hr.challenges;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;

public class TestPlusMinus {
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
    void testCase1() {
        PlusMinus.plusMinus(Arrays.asList(-4, 3, -9, 0, 4, 1));
        Assertions.assertEquals("0.500000\r\n0.333333\r\n0.166667", outputStreamCaptor.toString().trim());
    }

    @Test
    void testCase11() {
        PlusMinus.plusMinus(Arrays.asList(1, 2, 3, -1, -2, -3, 0, 0));

        String[] expected = new String[]{"0.375000", "0.375000", "0.250000"};
        String[] actual = outputStreamCaptor.toString().trim().split("\\r\\n");

        Assertions.assertEquals(expected.length, actual.length);
        for (int i = 0; i < expected.length; i++) {
            Assertions.assertEquals(expected[i], actual[i]);
        }
    }
}