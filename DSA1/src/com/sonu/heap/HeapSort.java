package com.sonu.heap;

public class HeapSort {



        // Main heap sort function
        public void heapSort(int[] arr) {
            int n = arr.length;

            // Step 1: Build max heap (heapify all non-leaf nodes)
            for (int i = n / 2 - 1; i >= 0; i--) {
                heapify(arr, n, i);
            }

            // Step 2: Extract elements from heap one by one
            for (int i = n - 1; i > 0; i--) {
                // Move current root to end
                int temp = arr[0];
                arr[0] = arr[i];
                arr[i] = temp;

                // Call max heapify on the reduced heap
                heapify(arr, i, 0);
            }
        }

        // Heapify a subtree rooted with node i (size = n)
        void heapify(int[] arr, int n, int i) {
            int largest = i; // root
            int left = 2 * i + 1;
            int right = 2 * i + 2;

            // Check if left child is larger
            if (left < n && arr[left] > arr[largest])
                largest = left;

            // Check if right child is larger
            if (right < n && arr[right] > arr[largest])
                largest = right;

            // If largest is not root, swap and continue heapifying
            if (largest != i) {
                int temp = arr[i];
                arr[i] = arr[largest];
                arr[largest] = temp;

                heapify(arr, n, largest);
            }
        }

        // Print array
        void printArray(int[] arr) {
            for (int val : arr)
                System.out.print(val + " ");
            System.out.println();
        }

        // Main
        public static void main(String[] args) {
            int[] arr = { 12, 11, 13, 5, 6, 7 };
            HeapSort hs = new HeapSort();

            System.out.print("Original array: ");
            hs.printArray(arr);

            hs.heapSort(arr);

            System.out.print("Sorted array: ");
            hs.printArray(arr);
        }


}
