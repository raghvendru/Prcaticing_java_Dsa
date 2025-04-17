package com.jagcoder.BasicString;
import java.util.*;
public class Anagram {

    public static boolean ana(String s,String t){
//        char[] s1 = s.toCharArray();
//        char[] s2 = t.toCharArray();
//        Arrays.sort(s1);
//        Arrays.sort(s2);
//        return Arrays.equals(s1,s2);

        int[] count = new int[26];
        for(char c:s.toCharArray()) count[c-'a']++;
        for(char c:t.toCharArray()) count[c-'a']--;
        for(int i:count){
            if(i!=0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "raghavendra";
        String t = "araghavendr";
        boolean ans = ana(s,t);
        if(ans){
            System.out.println("yes!!! its a valid anagram");
        }
        else{
            System.out.println("sorry!its not an anagram");
        }

    }
}
