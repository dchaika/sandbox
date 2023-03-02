package com.dc.hr.challenges;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Stack;

public class TestQueueUsingTwoStacks {
    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        QueueUsingTwoStacks.stack1 = new Stack<>();
        QueueUsingTwoStacks.stack2 = new Stack<>();
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @AfterEach
    public void tearDown() {
        System.setOut(standardOut);
    }

    @Test
    void customTestCase0() {
        QueueUsingTwoStacks.processInput("1", "1");
        QueueUsingTwoStacks.processInput("2", null);
        QueueUsingTwoStacks.processInput("3", null);
        Assertions.assertEquals("null", outputStreamCaptor.toString().trim());
    }

    @Test
    void testCase0() {
        QueueUsingTwoStacks.processInput("1", "42");
        QueueUsingTwoStacks.processInput("2", null);
        QueueUsingTwoStacks.processInput("1", "14");
        QueueUsingTwoStacks.processInput("3", null);
        QueueUsingTwoStacks.processInput("1", "28");
        QueueUsingTwoStacks.processInput("3", null);
        QueueUsingTwoStacks.processInput("1", "60");
        QueueUsingTwoStacks.processInput("1", "78");
        QueueUsingTwoStacks.processInput("2", null);
        QueueUsingTwoStacks.processInput("2", null);
        Assertions.assertEquals("14\r\n14", outputStreamCaptor.toString().trim());
    }
}