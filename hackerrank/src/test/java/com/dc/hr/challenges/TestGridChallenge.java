package com.dc.hr.challenges;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class TestGridChallenge {

    @Test
    void testCase0() {
        Assertions.assertEquals(
                "YES",
                GridChallenge.gridChallenge(
                        Arrays.asList(
                                "eabcd",
                                "fghij",
                                "olkmn",
                                "trpqs",
                                "xywuv")));
    }

    @Test
    void testCase12_1() {
        Assertions.assertEquals(
                "YES",
                GridChallenge.gridChallenge(
                        Arrays.asList(
                                "abc",
                                "lmp",
                                "qrt")));
    }

    @Test
    void testCase12_2() {
        Assertions.assertEquals(
                "NO",
                GridChallenge.gridChallenge(
                        Arrays.asList(
                                "mpxz",
                                "abcd",
                                "wlmf")));
    }

    @Test
    void testCase12_3() {
        Assertions.assertEquals(
                "YES",
                GridChallenge.gridChallenge(
                        Arrays.asList(
                                "abc",
                                "hjk",
                                "mpq",
                                "rtv")));
    }
}