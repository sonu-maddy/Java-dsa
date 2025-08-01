package com.sonu.heap;

import java.util.ArrayList;

public class MaxHeap {
    private ArrayList<Integer> heap;

    public MaxHeap() {
        heap = new ArrayList<>();
    }

    // Insert element into the heap
    public void insert(int val) {
        heap.add(val);
        int index = heap.size() - 1;
        // Heapify up
        while (index > 0) {
            int parent = (index - 1) / 2;
            if (heap.get(index) > heap.get(parent)) {
                swap(index, parent);
                index = parent;
            } else {
                break;
            }
        }
    }

    // Delete the maximum element (root) from the heap
    public int deleteMax() {
        if (heap.size() == 0)
            throw new IllegalStateException("Heap is empty");

        int max = heap.get(0);
        int last = heap.remove(heap.size() - 1);
        if (heap.size() > 0) {
            heap.set(0, last);
            heapifyDown(0);
        }
        return max;
    }

    // Heapify down from root
    private void heapifyDown(int index) {
        int size = heap.size();
        while (index < size) {
            int left = 2 * index + 1;
            int right = 2 * index + 2;
            int largest = index;

            if (left < size && heap.get(left) > heap.get(largest))
                largest = left;
            if (right < size && heap.get(right) > heap.get(largest))
                largest = right;

            if (largest != index) {
                swap(index, largest);
                index = largest;
            } else {
                break;
            }
        }
    }

    // Swap helper
    private void swap(int i, int j) {
        int temp = heap.get(i);
        heap.set(i, heap.get(j));
        heap.set(j, temp);
    }

    // Print heap
    public void printHeap() {
        System.out.println(heap);
    }

    public static void main(String[] args) {
        MaxHeap maxHeap = new MaxHeap();
        maxHeap.insert(10);
        maxHeap.insert(20);
        maxHeap.insert(5);
        maxHeap.insert(30);

        System.out.print("Heap after insertions: ");
        maxHeap.printHeap();

        System.out.println("Deleted max: " + maxHeap.deleteMax());

        System.out.print("Heap after deletion: ");
        maxHeap.printHeap();
    }
}

