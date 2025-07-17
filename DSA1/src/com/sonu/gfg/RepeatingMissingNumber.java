package com.sonu.gfg;

import java.util.ArrayList;

public class RepeatingMissingNumber {
    static ArrayList<Integer> findTwoElement(int[] arr) {
        int n = arr.length;

                                 
        int[] freq = new int[n + 1];
        int repeating = -1;
        int missing = -1;


        for (int i = 0; i < n; i++) {
            freq[arr[i]]++;
        }

        for (int i = 1; i <= n; i++) {


            if (freq[i] == 0) {
                missing = i;
            }


            else if (freq[i] == 2) {
                repeating = i;
            }
        }

        ArrayList<Integer> result = new ArrayList<>();
        result.add(repeating);
        result.add(missing);
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 3};
        ArrayList<Integer> ans = findTwoElement(arr);

        System.out.println(ans.get(0) + " " + ans.get(1));
    }
}
