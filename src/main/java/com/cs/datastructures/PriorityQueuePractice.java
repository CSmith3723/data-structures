package com.leetcodepractice.datastructures;
//to be put out first.
//The use cases for this are when you have basic tasks that can be done first in -

import java.util.PriorityQueue;
import java.util.Queue;

//first out, but a new task comes in that must be prioritized.
//Also consider something like adding tasks to a list, they get added to the end, but
//can be removed from the list based on due date.
//Why PQ over sorting?
//Efficiency -- for some tasks, the PQ can be more efficient in terms of time and memory
//Customized Operations -- You can customize the rules of PQ beyond simple sorting rules
//for example: a type of input needs to be prioritized. There may not be a way to sort
//the data to do that, or the sorting may be highly inefficient. 
//
// In Java, the PriorityQueue does not guarantee internal ordering. It simple ensures
//that the head is the lowest or highest value, based on how you are prioritizing
//the PQ values are stored in the Java heap
public class PriorityQueuePractice {

    public static void main(String[] args) {

        Queue<Integer> priorityQueue = new PriorityQueue<>();

        for (int i = 5; i > 0; i--) {
            priorityQueue.offer(i);

        }
        System.out.println("Not in natural order, because PQ data stored in heap");
        System.out.println(priorityQueue);
    }

}
