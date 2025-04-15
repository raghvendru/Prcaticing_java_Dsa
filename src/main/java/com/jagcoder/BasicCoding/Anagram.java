package com.jagcoder.BasicCoding;

public class Anagram {
    public boolean Ana(String str,String target) {
        if (str.length() != target.length()) {
            return false;
        }
        int[] count = new int[26];
        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i) - 'a']++;
            count[target.charAt(i) - 'a']--;
        }
        for (int i : count) {
            if (i != 0) {
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        Anagram a = new Anagram();
        String str = "listen";
        String target = "silent";
        boolean result = a.Ana(str, target);
        if (result) {
            System.out.println(str + " and " + target + " are anagrams.");
        } else {
            System.out.println(str + " and " + target + " are not anagrams.");
        }

    }
}
