package com.leetcodepractice.datastructures;

import java.util.LinkedList;

/*


LinkedList = stores Nodes in 2 parts (data + address)
             Nodes are in non-consecutive memory locations
             Elements are linked using pointers

             Singly Linked List

      Node            Node              Node    
[data|address] -> [data|address] -> [data|address] 

             Doubly Linked List

    Node                Node              Node    
[data|address] <-> [data|address] <-> [data|address] 


Advantages: 
1. Dynamic Data Structure (allocates needed memory while running)
2. Insertion and Deletion of nodes is easy O(1)
3. No/Low memory waste


Disadvantages:
1. Greater memory usage(additional pointer)
2. No random access of elements (no index [i])
3. Accessing/searching elements is more time consuming. O(n)

Uses:
1. Implement Stacks/Queues
2. GPS navigation
3. Music Playlist


 */
public class LinkedListPractice {

    public static void main(String[] args) {

        linkedListDemo();
    }

    public static void linkedListDemo() {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();

        for (int i = 0; i < 10; i++) {
            linkedList.offer(i);
        }

        //the order of the linked list will be determined by the methods used to add
        //elements. Push/pop will be a stack. offer/poll will be a queue
        System.out.println(linkedList);
        linkedList.poll();
        System.out.println("Polled ");
        System.out.println(linkedList);
        System.out.println("Removing index 4");
        linkedList.remove(4);
        System.out.println(linkedList);
        System.out.println("Adding element at the beginning and end");
        linkedList.addFirst(7);
        linkedList.addLast(7);
        System.out.println(linkedList);

    }
}
