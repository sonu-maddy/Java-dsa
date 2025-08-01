package com.sonu.heap;
import java.util.PriorityQueue;

public class KthLargetstElement {

        public static int findKthLargest(int[] nums, int k) {
            // Min-Heap of size k
            PriorityQueue<Integer> minHeap = new PriorityQueue<>();

            for (int num : nums) {
                minHeap.add(num);
                // Maintain heap size = k
                if (minHeap.size() > k) {
                    minHeap.poll(); // remove smallest
                }
            }

            return minHeap.peek(); // root = kth largest
        }

        public static void main(String[] args) {
            int[] nums = {3, 2, 1, 5, 6, 4};
            int k = 2;
            System.out.println("Kth largest element is: " + findKthLargest(nums, k));
        }


}
