package com.jagcoder.AdvanceString;
import java.util.*;
public class IndexStartOfMatchingPatt {
    public static List<Integer> search(String text,String pat){
        int n = text.length();
        int m = pat.length();
        List<Integer> ans = new ArrayList<>();
        for(int i=0;i<=n-m;i++){
           boolean flag = true ;
           for(int j=0;j<m;j++){
               if(text.charAt(i+j) != pat.charAt(j)) {
                   flag=false;
                   break;
               }
           }
           if(flag){
               ans.add(i);
           }
        }
        return ans;
    }
    public static void main(String[] args){
        String text = "gabcdabc";
        String pat = "abc";
        System.out.println(search(text,pat));

    }
}
