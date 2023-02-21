package com.dc.hr.challenges;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestTowerBreakers {

    @Test
    void testCase0_1() {
        Assertions.assertEquals(2, TowerBreakers.towerBreakers(2, 2));
    }

    @Test
    void testCase0_2() {
        Assertions.assertEquals(1, TowerBreakers.towerBreakers(1, 4));
    }

    @Test
    void testCase11_1() {
        Assertions.assertEquals(1, TowerBreakers.towerBreakers(1, 7));
    }

    @Test
    void testCase11_2() {
        Assertions.assertEquals(1, TowerBreakers.towerBreakers(3, 7));
    }

    @Test
    void customTestCase1() {
        Assertions.assertEquals(2, TowerBreakers.towerBreakers(1, 1));
    }

    @Test
    void customTestCase2() {
        Assertions.assertEquals(2, TowerBreakers.towerBreakers(100, 1));
    }

    @Test
    void customTestCase3() {
        Assertions.assertEquals(1, TowerBreakers.towerBreakers(1, 100));
    }

    @Test
    void customTestCase4() {
        Assertions.assertEquals(2, TowerBreakers.towerBreakers(2, 100));
    }
}