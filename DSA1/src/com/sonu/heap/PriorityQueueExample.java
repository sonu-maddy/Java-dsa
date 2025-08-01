package com.sonu.heap;

import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        // Create a PriorityQueue of integers (Min-Heap by default)
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // Add elements
        pq.add(30);
        pq.add(10);
        pq.add(50);
        pq.add(20);

        System.out.println("Priority Queue: " + pq); // internal order not guaranteed

        // Peek (view top element without removing)
        System.out.println("Peek (smallest element): " + pq.peek());

        // Poll (remove top element)
        System.out.println("Poll (remove smallest): " + pq.poll());
        System.out.println("After poll: " + pq);

        // Remove specific element
        pq.remove(30);
        System.out.println("After removing 30: " + pq);
    }
}

