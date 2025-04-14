package sonu.com.gfg;

import java.util.ArrayList;
import java.util.Arrays;

public class SearchPatternKMPAlgorithm {
    public static void main(String[] args) {
       String txt = "aabaacaadaabaaba", pat = "aaba";
        System.out.println(Arrays.toString(search(pat,txt)));
    }
    static ArrayList<Integer> search(String pat, String txt) {
        // your code here
        int n =pat.length();
        int m = txt.length();
        int[] lps =new int[n];
        for (int i = 1,len=0; i < n;) {
            if (pat.charAt(i) == pat.charAt(len)){
                lps[i++] = ++len;
//                len++;
//                i++;
            }
        }
    }
}
