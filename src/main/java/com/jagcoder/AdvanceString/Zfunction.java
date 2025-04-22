package com.jagcoder.AdvanceString;
import java.util.*;
public class Zfunction {
    public static List<Integer> Z_compute(String s){
        int n = s.length();
        ArrayList<Integer>  Z = new ArrayList<>(Collections.nCopies(n,0));
        for(int i=0;i<n;i++){
            while(i+Z.get(i) <n && s.charAt(i + Z.get(i))== s.charAt(Z.get(i))){
                Z.set(i,Z.get(i)+1);
            }
        }
        return Z;
    }


    public static List<Integer> search(String pat,String text){
        String s = pat + '$' + text;
        int n = pat.length();
        int m = text.length();
        List<Integer> Z = Z_compute(s);
        List<Integer> ans = new ArrayList<>();
        for(int i = n+1;i<s.length();i++){
            if(Z.get(i) == n){
                ans.add(i-(n+1));
            }
        }
        return ans;

    }

    public static void main(String[] args){
        String pat = "abc";
        String text = "abcgaabc";
        System.out.println(search(pat,text));
    }
}
