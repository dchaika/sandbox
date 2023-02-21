package com.dc.hr.challenges;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestTimeConversion {
    @Test
    void testCase0() {
        Assertions.assertEquals("19:05:45", TimeConversion.timeConversion("07:05:45PM"));
    }
}