package com.cs.datastructures;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class DataStructures {

    public static void main(String[] args) {
        stackDemo();
        queueDemo();

    }

    //Queue demo
    public static void queueDemo() {
        //Queue is an interface, so we must instantiate a LinkedList
        System.out.println("---Queue Demo---");
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            queue.offer(i);
        }

        System.out.println("Queue: " + queue);
        System.out.println("Removing the front of the queue: " + queue.poll());
        System.out.println("Peeking at the front of the queue: " + queue.peek());
        System.out.println();
    }

    //Stack demo
    public static void stackDemo() {
        System.out.println("---Stack Demo---");
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < 5; i++) {
            stack.push(i);
        }

        System.out.println("Full stack: " + stack);
        System.out.println("Removing the top element: " + stack.pop());
        System.out.println("Peeking at the new top element: " + stack.peek());
        System.out.println();
    }
}
