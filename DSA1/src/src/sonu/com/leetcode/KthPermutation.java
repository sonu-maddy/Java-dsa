package src.sonu.com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class KthPermutation {
    public static void main(String[] args) {
        int n = 3, k = 3;
        System.out.println(getPermutation(n,k));
    }

    public static String getPermutation(int n, int k) {
        int fact =1;
        List<Integer> num = new ArrayList<>();
        for (int i = 1; i <n ; i++) {
            fact = fact *i;
            num.add(i);
        }
        num.add(n);

        String ans = "";
        k =k-1;
        while (true){
            ans  = ans + num.get(k/fact);
            num.remove(k/fact);
            if (num.size() == 0){
                break;
            }

            k = k % fact;
            fact = fact/num.size();
        }
        return ans;
    }
}
