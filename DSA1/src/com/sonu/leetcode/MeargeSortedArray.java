package com.sonu.leetcode;

import java.util.Arrays;

public class MeargeSortedArray {
    public static void main(String[] args) {
       int[] nums1 = {1,2,3,4,0,0,0},  nums2 = {2,5,6};
        int m = 4,  n = 3;
        System.out.println(Arrays.toString(merge(nums1,m,nums2,n)));

    }
    public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
       // int[] newarr = new int[m+n];

        int i = m-1;
        int j = n-1;
        int k = m+n-1;

        while (j>=0){

            if (i>=0 && nums1[i] > nums2[j]){
                nums1[k] = nums1[i];
                i--;
                k--;
            }else {
                nums1[k] = nums2[j];
                j--;
                k--;
            }
        }
        return nums1;
    }


}
