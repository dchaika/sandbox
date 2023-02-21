package com.dc.hr.challenges.advanced;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class TestFlippingMatrix {

    @Test
    void testCase0() {
        Assertions.assertEquals(
                414,
                FlippingMatrix.flippingMatrix(
                        Arrays.asList(
                                Arrays.asList(112, 42, 83, 119),
                                Arrays.asList(56, 125, 56, 49),
                                Arrays.asList(15, 78, 101, 43),
                                Arrays.asList(62, 98, 114, 108))));
    }

    @Test
    void testCase1() {
        Assertions.assertEquals(
                12781,
                FlippingMatrix.flippingMatrix(
                        Arrays.asList(
                                Arrays.asList(517, 37, 380, 3727),
                                Arrays.asList(3049, 1181, 2690, 1587),
                                Arrays.asList(3227, 3500, 2665, 383),
                                Arrays.asList(4041, 2013, 384, 965))));
    }

    @Test
    void testCase2() {
        Assertions.assertEquals(
                3625,
                FlippingMatrix.flippingMatrix(
                        Arrays.asList(
                                Arrays.asList(806, 408),
                                Arrays.asList(1674, 3625))));
    }

    @Test
    void testCase4() {
        Assertions.assertEquals(
                32021,
                FlippingMatrix.flippingMatrix(
                        Arrays.asList(
                                Arrays.asList(3542, 2126, 2650, 83, 2400, 46),
                                Arrays.asList(3511, 4087, 1922, 1335, 55, 2220),
                                Arrays.asList(394, 1500, 580, 2656, 2525, 3703),
                                Arrays.asList(902, 2862, 2403, 410, 2328, 9),
                                Arrays.asList(1025, 3347, 4088, 287, 1, 3928),
                                Arrays.asList(3650, 865, 3045, 2901, 4002, 3025))));
    }

    @Test
    void testCase7() {
        Assertions.assertEquals(
                488,
                FlippingMatrix.flippingMatrix(
                        Arrays.asList(
                                Arrays.asList(107, 54, 128, 15),
                                Arrays.asList(12, 75, 110, 138),
                                Arrays.asList(100, 96, 34, 85),
                                Arrays.asList(75, 15, 28, 112))));
    }
}