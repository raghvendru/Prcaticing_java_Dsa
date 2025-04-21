package com.jagcoder.AdvanceString;
import java.util.*;

public class IndexStartOfMatchingPatt1 {
    public static List<Integer> search(String text, String pat) {
        int m = text.length(), n = pat.length(), p = 7, mod = 101;
        int power = 1;
        for (int i = 0; i < n - 1; i++)
            power = (power * p) % mod;

        int hashPat = 0, hashTxt = 0;
        for (int i = 0; i < n; i++) {
            hashPat = (hashPat * p + (pat.charAt(i) - 'a' + 1)) % mod;
            hashTxt = (hashTxt * p + (text.charAt(i) - 'a' + 1)) % mod;
        }

        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i <= m - n; i++) {
            if (hashTxt == hashPat && text.substring(i, i + n).equals(pat)) {
                ans.add(i);
            }
            if (i < m - n) {
                hashTxt = (hashTxt - (text.charAt(i) - 'a' + 1) * power % mod + mod) % mod;
                hashTxt = (hashTxt * p + (text.charAt(i + n) - 'a' + 1)) % mod;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String text = "gabcdeabc";
        String pat  = "abc";
        System.out.println(search(text, pat));  // prints [1, 6]
    }
}
