package com.dc.hr.challenges;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestCaesarCipher {

    @Test
    void testCase5() {
        Assertions.assertEquals("okffng-Qwvb", CaesarCipher.caesarCipher("middle-Outz", 2));
    }

    @Test
    void testCase11() {
        Assertions.assertEquals("Fqbfdx-Qttp-ts-ymj-Gwnlmy-Xnij-tk-Qnkj", CaesarCipher.caesarCipher("Always-Look-on-the-Bright-Side-of-Life", 5));
    }

    @Test
    void customTestCase1() {
        Assertions.assertEquals("Sdurdb Ljnbja", CaesarCipher.caesarCipher("Julius Caesar", 87));
    }
}