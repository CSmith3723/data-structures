package com.cs.datastructures;

import java.util.LinkedList;

/*


LinkedList = stores Nodes in 2 parts (data + address). Under the hood, it's essentially a chain of hashmaps pointing to the next.
             Nodes are in non-consecutive memory locations
             Elements are linked using pointers (no indexes)

             Singly Linked List

      Node            Node              Node    
[data|address] -> [data|address] -> [data|address]

    1. Inserting and deleting at tail is O(n), but inserting/deleting at head is O(1). Inserting/deleting ANYWHERE in the middle
    is O(n).
    2. Searching by value is O(n), regardless of search method.
    3. If you're working primarily with the head values, LL is better, but working with tail values, ArrayList is better.




             Doubly Linked List

    Node                Node              Node    
[data|address] <-> [data|address] <-> [data|address] 


Advantages: 
1. Dynamic Data Structure (allocates needed memory while running)
2. Insertion and Deletion of nodes is easy O(1) -- It's 4 operations, simply redefining the previous and next values. HOWEVER,
    arriving at/traversing TO the node can be costly.
            FOR EXAMPLE: the only way to access the node that will be the new tail is to access what is pointing to it.
                This means you have to traverse from the start on an SLL to arrive at the appropriate node.

3. No/Low memory waste


Disadvantages:
1. Greater memory usage(additional pointer)
2. No random access of elements (no index [i]) -- Because the memory positions are not contiguous, we cannot use offset
    to calculate the position of the indexed value, so we can't access it instantly. we have to iterate through.
3. Accessing/searching elements is more time consuming. O(n)

Uses:
1. Implement Stacks/Queues
2. GPS navigation
3. Music Playlist


Ordering of operations is very important, because if we are resetting/changing the links between nodes, and we remove the NEXT link
to a node before we have some way to access that link, we can lose the following node and not be able to access it.

 */
public class LinkedListPractice {

    public static void main(String[] args) {

        LinkedListPractice myLinkedList = new LinkedListPractice(4);



    }









    private LLNode head; //pointing to node
    private LLNode tail;
    private int length;


    LinkedListPractice(int value){
        LLNode newNode = new LLNode(value);  //variable newNode of type LLNode can POINT to the new LLNode created with the value
        head = newNode; //head, of type LLNode, can point to the same thing newNode is pointing at.
        tail = newNode; //So now, with a single node and a length of 1, the head and tail point to the same node.
        length = 1;
    }

    public void printList(){
        LLNode temp = head; //starting at head
        while (temp != null){
            System.out.println(temp.value);  //printing value of the temp, and moving through the nodes
            temp = temp.next;
        }
    }


    public void getHead(){
        System.out.println("Head: " + head.value);
    }

    public void getTail(){
        System.out.println("Tail: " + tail.value);
    }

    public void getLength(){
        System.out.println("Length: " + length);
    }




    //Inner Class
    class LLNode{
        int value;
        LLNode next; //This variable can point to a Node.

        LLNode(int value){
            this.value = value;
        }
    }



}


