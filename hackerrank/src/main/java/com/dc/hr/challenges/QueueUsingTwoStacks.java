package com.dc.hr.challenges;

import java.io.*;
import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class QueueUsingTwoStacks {

    /*
     * A queue is an abstract data type that maintains the order in which elements were added to it,
     * allowing the oldest elements to be removed from the front and new elements to be added to the rear. https://en.wikipedia.org/wiki/Queue_%28abstract_data_type%29
     * This is called a First-In-First-Out (FIFO) data structure because
     * the first element added to the queue (i.e., the one that has been waiting the longest) is always the first one to be removed.
     *
     * A basic queue has the following operations:
     * - Enqueue: add a new element to the end of the queue.
     * - Dequeue: remove the element from the front of the queue and return it.
     *
     * In this challenge, you must first implement a queue using two stacks.
     * Then process q queries, where each query is one of the following 3 types:
     * - 1 x: Enqueue element  into the end of the queue.
     * - 2: Dequeue the element at the front of the queue.
     * - 3: Print the element at the front of the queue.
     */

    public static Stack<Integer> stack1 = new Stack<>();
    public static Stack<Integer> stack2 = new Stack<>();

    public static void processInput(String type, String value) {
        switch (type) {
            case "1":
                enQueue(Integer.parseInt(value));
                break;
            case "2":
                deQueue();
                break;
            case "3":
                System.out.println(peek());
                break;
        }
    }

    private static void enQueue(Integer value) {
        stack1.push(value);
    }

    private static void deQueue() {
        if (stack2.empty()) {
            while (!stack1.empty()) {
                stack2.push(stack1.pop());
            }
        }
        stack2.pop();
    }

    private static Integer peek() {
        if (stack2.empty()) {
            while (!stack1.empty()) {
                stack2.push(stack1.pop());
            }
        }
        if (stack2.empty()) {
            return null;
        }
        return stack2.peek();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int q = Integer.parseInt(bufferedReader.readLine().trim());
        IntStream.range(0, q).forEach(tItr -> {
            try {
                Stream.of(bufferedReader.readLine())
                        .forEach(s -> {
                            String[] arr = s.replaceAll("\\s+$", "").split(" ");
                            if (arr.length > 1) {
                                processInput(arr[0], arr[1]);
                            } else {
                                processInput(arr[0], null);
                            }
                        });
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
    }
}